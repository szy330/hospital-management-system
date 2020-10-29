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
@ApiModel(value="Paiban对象", description="")
public class Paiban implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "paiId", type = IdType.AUTO)
    private Integer paiId;

    private String one;

    private String two;

    private String three;

    private String four;

    private String five;

    private String six;

    private String seven;

    @TableField("doctorId")
    private Integer doctorId;


    public Integer getPaiId() {
        return paiId;
    }

    public void setPaiId(Integer paiId) {
        this.paiId = paiId;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three;
    }

    public String getFour() {
        return four;
    }

    public void setFour(String four) {
        this.four = four;
    }

    public String getFive() {
        return five;
    }

    public void setFive(String five) {
        this.five = five;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public String getSeven() {
        return seven;
    }

    public void setSeven(String seven) {
        this.seven = seven;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public String toString() {
        return "Paiban{" +
        "paiId=" + paiId +
        ", one=" + one +
        ", two=" + two +
        ", three=" + three +
        ", four=" + four +
        ", five=" + five +
        ", six=" + six +
        ", seven=" + seven +
        ", doctorId=" + doctorId +
        "}";
    }
}
