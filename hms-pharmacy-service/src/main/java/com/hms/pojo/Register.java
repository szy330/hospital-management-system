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
@ApiModel(value="Register对象", description="")
public class Register implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "registerid", type = IdType.AUTO)
    private Integer registerid;

    @TableField("userName")
    private String userName;

    private Integer age;

    private String sex;

    private Integer department;

    private Integer doctor;

    private String diagnose;

    private String address;

    @TableField("Phone")
    private String Phone;

    @TableField("Idcard")
    private String Idcard;

    @TableField("registerDate")
    private Date registerDate;

    @TableField("bedNum")
    private Integer bedNum;

    @TableField("Operator")
    private String Operator;

    private Double money;

    private Integer state;

    @TableField("endDate")
    private Date endDate;

    private Double price;

    private String discount;

    private Date zhuan;


    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getIdcard() {
        return Idcard;
    }

    public void setIdcard(String Idcard) {
        this.Idcard = Idcard;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getBedNum() {
        return bedNum;
    }

    public void setBedNum(Integer bedNum) {
        this.bedNum = bedNum;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Date getZhuan() {
        return zhuan;
    }

    public void setZhuan(Date zhuan) {
        this.zhuan = zhuan;
    }

    @Override
    public String toString() {
        return "Register{" +
        "registerid=" + registerid +
        ", userName=" + userName +
        ", age=" + age +
        ", sex=" + sex +
        ", department=" + department +
        ", doctor=" + doctor +
        ", diagnose=" + diagnose +
        ", address=" + address +
        ", Phone=" + Phone +
        ", Idcard=" + Idcard +
        ", registerDate=" + registerDate +
        ", bedNum=" + bedNum +
        ", Operator=" + Operator +
        ", money=" + money +
        ", state=" + state +
        ", endDate=" + endDate +
        ", price=" + price +
        ", discount=" + discount +
        ", zhuan=" + zhuan +
        "}";
    }
}
