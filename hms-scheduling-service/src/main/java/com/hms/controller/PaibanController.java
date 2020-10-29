package com.hms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hms.mapper.DoctorMapper;
import com.hms.mapper.PaibanMapper;
import com.hms.pojo.Paiban;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author szy
 * @since 2020-10-24
 */
@RestController
@RequestMapping("/paiban")
@Api(description = "排班接口")
public class PaibanController {
    @Autowired(required = false)
    private PaibanMapper paibanMapper;

    @PostMapping("/add")
    @ApiOperation("添加值班信息")
    public Map<String,Object> add(Paiban paiban){
        Map<String,Object> result = new HashMap<>();
        if(paibanMapper.insert(paiban)>0){
            result.put("msg","添加值班信息成功");
            result.put("code",200);
            return result;
        }
        result.put("msg","添加值班信息失败");
        result.put("code",500);
        return result;
    }
    @GetMapping("/getAll")
    @ApiOperation("获取所有的值班信息")
    public Map<String,Object> getAll(){
        Map<String,Object> result = new HashMap<>();
        result.put("msg","成功获取数据");
        result.put("code",200);
        result.put("data",paibanMapper.selectList(null)) ;
        return result;
    }
    @GetMapping("/getBySearch")
    @ApiOperation("通过搜索获取")
    public Map<String,Object> getBySearch(String key){
        Map<String,Object> result = new HashMap<>();
        if(StringUtils.isEmpty(key)){
            result.put("msg","参数传递错误");
            result.put("code",400);
            return result;
        }
        result.put("data",paibanMapper.searchByName(key));
        return result;
    }

    @PostMapping("/update")
    @ApiOperation("编辑值班信息")
    public Map<String,Object> update(Paiban paiban){
        Map<String,Object> result = new HashMap<>();
        if(paiban.getPaiId()==null){
            result.put("msg","参数传递错误");
            result.put("code",400);
            return result;
        }
        if(paibanMapper.updateById(paiban)>0){
            result.put("msg","更新值班信息成功");
            result.put("code",200);
            return result;
        }
        result.put("msg","更新值班信息失败");
        result.put("code",500);
        return result;
    }
    @GetMapping("/getByWeek")
    @ApiOperation("/获取周几值班的人员，首页")
    public Map<String,Object> getByWeek(Integer week){
        Map<String,Object> result = new HashMap<>();
        if(null==week){
            result.put("msg","参数传递错误");
            result.put("code",400);
            return result;
        }
        QueryWrapper<Paiban> paibanQueryWrapper = new QueryWrapper<>();
        List<Paiban> paibanList = new ArrayList<>();
        switch (week){
            case 1:
                result.put("msg","查询成功");
                result.put("code",200);
                paibanQueryWrapper.eq("one","有班");
                paibanList = paibanMapper.selectList(paibanQueryWrapper);
                result.put("data",paibanList);
                return result;
            case 2:
                result.put("msg","查询成功");
                result.put("code",200);
                paibanQueryWrapper.eq("two","有班");
                paibanList = paibanMapper.selectList(paibanQueryWrapper);
                result.put("data",paibanList);
                return result;
            case 3:
                result.put("msg","查询成功");
                result.put("code",200);
                paibanQueryWrapper.eq("three","有班");
                paibanList = paibanMapper.selectList(paibanQueryWrapper);
                result.put("data",paibanList);
                return result;
            case 4:
                result.put("msg","查询成功");
                result.put("code",200);
                paibanQueryWrapper.eq("four","有班");
                paibanList = paibanMapper.selectList(paibanQueryWrapper);
                result.put("data",paibanList);
                return result;
            case 5:
                result.put("msg","查询成功");
                result.put("code",200);
                paibanQueryWrapper.eq("five","有班");
                paibanList = paibanMapper.selectList(paibanQueryWrapper);
                result.put("data",paibanList);
                return result;
            case 6:
                result.put("msg","查询成功");
                result.put("code",200);
                paibanQueryWrapper.eq("six","有班");
                paibanList = paibanMapper.selectList(paibanQueryWrapper);
                result.put("data",paibanList);
                return result;
            case 7:
                result.put("msg","查询成功");
                result.put("code",200);
                paibanQueryWrapper.eq("seven","有班");
                paibanList = paibanMapper.selectList(paibanQueryWrapper);
                result.put("data",paibanList);
                return result;
            default:
                result.put("msg","星期传递错误，请用1-7代替");
                result.put("code",400);
                return result;
        }
    }


}

