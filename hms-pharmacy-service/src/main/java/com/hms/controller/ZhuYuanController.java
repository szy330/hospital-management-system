package com.hms.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hms.mapper.HospitalpriceMapper;
import com.hms.mapper.RegisterMapper;
import com.hms.pojo.Hospitalprice;
import com.hms.pojo.Register;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(description = "住院取药")
@RequestMapping("/zhuYuan")
@CrossOrigin
public class ZhuYuanController {
    @Autowired(required = false)
    private RegisterMapper registerMapper;
    @Autowired(required = false)
    private HospitalpriceMapper hospitalpriceMapper;
    @GetMapping("/search")
    @ApiOperation("查询")
    public Map<String,Object> search(String registerid){
        Map<String,Object> result = new HashMap<>();
        if(StringUtils.isEmpty(registerid)){
            result.put("msg","参数传递错误");
            result.put("code",400);
            return result;
        }
        QueryWrapper<Register> registerQueryWrapper = new QueryWrapper<>();
        //如果出院住院状态有改变就改下面这个，看人家怎么定的
        //registerQueryWrapper.eq("state",2);
        registerQueryWrapper.eq("state",2);
        registerQueryWrapper.eq("registerid",registerid);
        List<Register> registerList = registerMapper.selectList(registerQueryWrapper);
        if(registerList.size()==0){
            result.put("msg","没有找到这个人");
            result.put("code",404);
            return result;
        }
        result.put("msg","ok");
        result.put("code",200);
        result.put("info",registerList.get(0));
        QueryWrapper<Hospitalprice> hospitalpriceQueryWrapper = new QueryWrapper<>();
        hospitalpriceQueryWrapper.eq("registerId",registerid);
        hospitalpriceQueryWrapper.eq("state",0);//这个应该是交钱没拿药的
        List<Hospitalprice> hospitalpricedaiqu = hospitalpriceMapper.selectList(hospitalpriceQueryWrapper);
        result.put("daiqu",hospitalpricedaiqu);
        hospitalpriceQueryWrapper = new QueryWrapper<>();
        hospitalpriceQueryWrapper.eq("registerId",registerid);
        hospitalpriceQueryWrapper.eq("state",2);//这个应该是取了的
        List<Hospitalprice> hospitalpriceList = hospitalpriceMapper.selectList(hospitalpriceQueryWrapper);
        result.put("yiqu",hospitalpriceList);
        return result;
    }
    @PostMapping("/quyao")
    @ApiOperation("取药,取完了把上面那个查询再执行一次")
    public Map<String,Object> quyao(String registerid){
        Map<String,Object> result = new HashMap<>();
        if(StringUtils.isEmpty(registerid)){
            result.put("msg","参数传递错误");
            result.put("code",400);
            return result;
        }
        QueryWrapper<Hospitalprice> hospitalpriceQueryWrapper = new QueryWrapper<>();
        hospitalpriceQueryWrapper.eq("registerId",registerid);
        hospitalpriceQueryWrapper.eq("state",0);//这个应该是交钱没拿药的
        List<Hospitalprice> hospitalpricedaiqu = hospitalpriceMapper.selectList(hospitalpriceQueryWrapper);
        for (Hospitalprice h:hospitalpricedaiqu
             ) {
            h.setState(2);//就是改个状态
            hospitalpriceMapper.updateById(h);
        }
        result.put("msg","ok");
        result.put("code",200);
        return result;
    }

}
