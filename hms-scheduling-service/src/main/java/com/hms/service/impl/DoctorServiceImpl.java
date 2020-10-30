package com.hms.service.impl;

import com.hms.pojo.Doctor;
import com.hms.mapper.DoctorMapper;
import com.hms.service.DoctorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author szy
 * @since 2020-10-24
 */
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor> implements DoctorService {

}
