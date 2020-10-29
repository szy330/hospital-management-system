package com.hms.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
 * @since 2020-10-27
 */
@ApiModel(value="Report对象", description="")
public class Report implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "reportId", type = IdType.AUTO)
    private Integer reportId;

    @TableField("reportName")
    private String reportName;

    private String sex;

    private Integer age;

    private Integer department;

    private Integer doctor;

    @TableField("reportType")
    private Integer reportType;

    private Double price;

    private Date time;

    private String users;

    private Integer state;

    private String phone;

    private String carid;

    private String zhuan;


    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Integer getDoctor() {
        return doctor;
    }

    public void setDoctor(Integer doctor) {
        this.doctor = doctor;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getZhuan() {
        return zhuan;
    }

    public void setZhuan(String zhuan) {
        this.zhuan = zhuan;
    }

    @Override
    public String toString() {
        return "Report{" +
        "reportId=" + reportId +
        ", reportName=" + reportName +
        ", sex=" + sex +
        ", age=" + age +
        ", department=" + department +
        ", doctor=" + doctor +
        ", reportType=" + reportType +
        ", price=" + price +
        ", time=" + time +
        ", users=" + users +
        ", state=" + state +
        ", phone=" + phone +
        ", carid=" + carid +
        ", zhuan=" + zhuan +
        "}";
    }
}
