package com.hms.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hms.mapper.BaoqueMapper;
import com.hms.mapper.HuishouMapper;
import com.hms.mapper.PharmacyMapper;
import com.hms.pojo.Baoque;
import com.hms.pojo.Huishou;
import com.hms.pojo.Pharmacy;
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

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author szy
 * @since 2020-10-25
 */
@RestController
@RequestMapping("/pharmacy")
@Api(description = "药房详情")
public class PharmacyController {
    @Autowired(required = false)
    private PharmacyMapper pharmacyMapper;
    @Autowired(required = false)
    private BaoqueMapper baoqueMapper;
    @Autowired(required = false)
    private HuishouMapper huishouMapper;
    @GetMapping("/getAll")
    @ApiOperation("获取所有数据")
    public Map<String,Object> getAll(){
        Map<String,Object> result = new HashMap<>();
        List<Pharmacy> pharmacyList = pharmacyMapper.selectList(null);
        result.put("code",200);
        result.put("msg","ok");
        result.put("data",pharmacyList);
        return result;
    }
    @PostMapping("/baoQue")
    @ApiOperation("报缺")
    public Map<String,Object> baoQue(Baoque baoque){
        Map<String,Object> result = new HashMap<>();
        baoqueMapper.insert(baoque);
        result.put("code",200);
        result.put("msg","ok");
        return result;
    }
    @PostMapping("/huishou")
    @ApiOperation("库房回收")
    public Map<String,Object> huishou(Huishou huishou){
        Map<String,Object> result = new HashMap<>();
        huishouMapper.insert(huishou);
        result.put("code",200);
        result.put("msg","ok");
        return result;
    }
    @GetMapping("/search")
    @ApiOperation("搜索")
    public Map<String,Object> search(String key){
        Map<String,Object> result = new HashMap<>();
        if(StringUtils.isEmpty(key)){
            result.put("msg","参数传递错误");
            result.put("code",400);
            return result;
        }
        result.put("msg","成功获取数据");
        result.put("code",200);
        QueryWrapper<Pharmacy> pharmacyQueryWrapper = new QueryWrapper<>();
        pharmacyQueryWrapper.like("pharmacyName",key);
        List<Pharmacy> pharmacyList =  pharmacyMapper.selectList(pharmacyQueryWrapper);
        result.put("data",pharmacyList);
        return result;
    }

}

