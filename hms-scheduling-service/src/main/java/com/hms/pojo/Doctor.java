package com.hms.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author szy
 * @since 2020-10-24
 */
@ApiModel(value="Doctor对象", description="")
public class Doctor implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "doctorId", type = IdType.AUTO)
    private Integer doctorId;

    @TableField("doctorName")
    private String doctorName;

    @TableField("departmentId")
    private Integer departmentId;

    @TableField("registeredId")
    private Integer registeredId;

    private Integer dstate;

    @TableField("amStartTime")
    private String amStartTime;

    @TableField("amEndTime")
    private String amEndTime;

    @TableField("pmStartTime")
    private String pmStartTime;

    @TableField("pmEndTime")
    private String pmEndTime;


    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getRegisteredId() {
        return registeredId;
    }

    public void setRegisteredId(Integer registeredId) {
        this.registeredId = registeredId;
    }

    public Integer getDstate() {
        return dstate;
    }

    public void setDstate(Integer dstate) {
        this.dstate = dstate;
    }

    public String getAmStartTime() {
        return amStartTime;
    }

    public void setAmStartTime(String amStartTime) {
        this.amStartTime = amStartTime;
    }

    public String getAmEndTime() {
        return amEndTime;
    }

    public void setAmEndTime(String amEndTime) {
        this.amEndTime = amEndTime;
    }

    public String getPmStartTime() {
        return pmStartTime;
    }

    public void setPmStartTime(String pmStartTime) {
        this.pmStartTime = pmStartTime;
    }

    public String getPmEndTime() {
        return pmEndTime;
    }

    public void setPmEndTime(String pmEndTime) {
        this.pmEndTime = pmEndTime;
    }

    @Override
    public String toString() {
        return "Doctor{" +
        "doctorId=" + doctorId +
        ", doctorName=" + doctorName +
        ", departmentId=" + departmentId +
        ", registeredId=" + registeredId +
        ", dstate=" + dstate +
        ", amStartTime=" + amStartTime +
        ", amEndTime=" + amEndTime +
        ", pmStartTime=" + pmStartTime +
        ", pmEndTime=" + pmEndTime +
        "}";
    }
}
