package com.hms.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hms.mapper.CashierMapper;
import com.hms.mapper.ReportMapper;
import com.hms.pojo.Cashier;
import com.hms.pojo.Report;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(description = "门诊取药")
@RequestMapping("/mengZhen")
public class MengZhenController {
    @Autowired(required = false)
    private ReportMapper reportMapper;
    @Autowired(required = false)
    private CashierMapper cashierMapper;
    @PostMapping("/select")
    @ApiOperation("选择患者获得药品信息")
    public Map<String,Object> select(Integer reportID){
        Map<String,Object> result = new HashMap<>();
        if(null==reportID){
            result.put("msg","参数传递错误");
            result.put("code",400);
            return result;
        }
        QueryWrapper<Cashier> cashierQueryWrapper = new QueryWrapper<>();
        cashierQueryWrapper.eq("reportId",reportID);
        //2是挂号交了钱的
        cashierQueryWrapper.eq("state",2);
        List<Cashier> cashierList  = cashierMapper.selectList(cashierQueryWrapper);
        result.put("code",200);
        result.put("msg","ok");
        result.put("data",cashierList);
        return result;
    }
    @GetMapping("/search")
    @ApiOperation("查询")
    public Map<String,Object> search(String name){
        Map<String,Object> result = new HashMap<>();
        if(StringUtils.isEmpty(name)){
            result.put("msg","参数传递错误");
            result.put("code",400);
            return result;
        }
        QueryWrapper<Report> reportQueryWrapper = new QueryWrapper<>();
        reportQueryWrapper.like("reportName",name);
        result.put("code",200);
        result.put("msg","ok");
        result.put("data",reportMapper.selectList(reportQueryWrapper));
        return result;
    }
    @PostMapping("/chuku")
    @ApiOperation("出库")
    public Map<String,Object> chuku(Integer reportID){
        Map<String,Object> result = new HashMap<>();
        if(null==reportID){
            result.put("msg","参数传递错误");
            result.put("code",400);
            return result;
        }
        QueryWrapper<Cashier> cashierQueryWrapper = new QueryWrapper<>();
        cashierQueryWrapper.eq("reportId",reportID);
        List<Cashier> cashierList  = cashierMapper.selectList(cashierQueryWrapper);
        //改report表的状态，把state改成3，应该是已经取药了，cashier表里面没有变化。应该是要同步改状态的，不是的话，cashier相关的都注释了
        for (Cashier c:cashierList
             ) {
            c.setState(3);
            cashierMapper.updateById(c);
        }
        Report report = reportMapper.selectById(reportID);
        report.setState(3);
        reportMapper.updateById(report);
        result.put("code",200);
        result.put("msg","ok");
        return result;
    }
}
