package com.hms.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

/**
 * 代码生成器
 */
public class CodeGeneratorUtil {

    /**
     * @param name      开发人员 如：类名上面的注释会加上你所输入的值
     * @param sqlName   数据库名 如;root
     * @param sqlPwd    数据密码 如:root
     * @param outPudDir 生成路径 如：绝对路径 D:\mybatis\hospital-management-system\hms-common\src\main\java\com\hms
     * @param table     表名
     */
    public static void getCodeGenerator(String name, String sqlName, String sqlPwd, String outPudDir, String table) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        // 获取当前项目根路径
        // String projectPath = System.getProperty("user.dir");
        // gc.setActiveRecord(true); // 是否支持AR模式
        gc.setOutputDir(outPudDir);//生成路径
        gc.setAuthor(name);//开发人员
        gc.setFileOverride(true); // 不覆盖之前生成的文件
        gc.setOpen(false);
        // gc.setEnableCache(true);// 开启二级缓存
        gc.setServiceName("%sService");// 设置生成的service接口的名字的首字母是否为I
        gc.setIdType(IdType.AUTO);// 主键策略 自增 注意要和数据库中表实际情况对应
        gc.setDateType(DateType.ONLY_DATE);// 时间类型对应策略
        gc.setSwagger2(true);// 自动开启swagger2的支持
        gc.setBaseResultMap(true);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://localhost:3306/hms");
        dsc.setUsername(sqlName);
        dsc.setPassword(sqlPwd);
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 模块名
        // String moduleName = "study";

        // 包配置
        PackageConfig pc = new PackageConfig();
        // pc.setModuleName(moduleName);
        pc.setParent("com.hms");
        pc.setEntity("pojo");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("mapper");
        pc.setXml("classpath:mapper");
        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //""+""+""
        strategy.setInclude(table);
        // 可以用同配符号:表示生成t_开头的对应库下所有表
        // strategy.setInclude("t" + "_\\w*");
        // strategy.setCapitalMode(true); // 全局大写命名
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setNaming(NamingStrategy.underline_to_camel);// 下划线转驼峰
        strategy.setControllerMappingHyphenStyle(true);

        strategy.setLogicDeleteFieldName("is_deleted");// 设置逻辑删除字段 要和数据库中表对应哈

        // 设置创建时间和更新时间自动填充策略
        TableFill created_date = new TableFill("created_date", FieldFill.INSERT);
        TableFill updated_date = new TableFill("updated_date", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(created_date);
        tableFills.add(updated_date);
        strategy.setTableFillList(tableFills);

        // 乐观锁策略
        // strategy.setVersionFieldName("version");
        strategy.setRestControllerStyle(true);// 采用restful 风格的api
        strategy.setControllerMappingHyphenStyle(true); // controller 请求地址采用下划线代替驼峰

        mpg.setStrategy(strategy);

        // 执行
        mpg.execute();
    }
}
