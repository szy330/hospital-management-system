package com.hms.mapper;

import com.hms.pojo.Paiban;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author szy
 * @since 2020-10-24
 */
public interface PaibanMapper extends BaseMapper<Paiban> {
    List<Paiban>  searchByName(@Param("key") String key);
}
