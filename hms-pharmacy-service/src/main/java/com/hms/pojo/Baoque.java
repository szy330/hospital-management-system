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
 * @since 2020-10-25
 */
@ApiModel(value="Baoque对象", description="")
public class Baoque implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "baoqueid", type = IdType.AUTO)
    private Integer baoqueid;

    @TableField("baoqueName")
    private String baoqueName;

    @TableField("baoqueNum")
    private Integer baoqueNum;


    public Integer getBaoqueid() {
        return baoqueid;
    }

    public void setBaoqueid(Integer baoqueid) {
        this.baoqueid = baoqueid;
    }

    public String getBaoqueName() {
        return baoqueName;
    }

    public void setBaoqueName(String baoqueName) {
        this.baoqueName = baoqueName;
    }

    public Integer getBaoqueNum() {
        return baoqueNum;
    }

    public void setBaoqueNum(Integer baoqueNum) {
        this.baoqueNum = baoqueNum;
    }

    @Override
    public String toString() {
        return "Baoque{" +
        "baoqueid=" + baoqueid +
        ", baoqueName=" + baoqueName +
        ", baoqueNum=" + baoqueNum +
        "}";
    }
}
