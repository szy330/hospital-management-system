package com.hms.service.impl;

import com.hms.pojo.Register;
import com.hms.mapper.RegisterMapper;
import com.hms.service.RegisterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author szy
 * @since 2020-10-27
 */
@Service
public class RegisterServiceImpl extends ServiceImpl<RegisterMapper, Register> implements RegisterService {

}
