package com.hms.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Huishou对象", description="")
public class Huishou implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "huishouid", type = IdType.AUTO)
    private Integer huishouid;

    private String huishouname;

    private Integer huishounumber;

    private String huishoupihao;

    private String jbr;

    private String beizhu;


    public Integer getHuishouid() {
        return huishouid;
    }

    public void setHuishouid(Integer huishouid) {
        this.huishouid = huishouid;
    }

    public String getHuishouname() {
        return huishouname;
    }

    public void setHuishouname(String huishouname) {
        this.huishouname = huishouname;
    }

    public Integer getHuishounumber() {
        return huishounumber;
    }

    public void setHuishounumber(Integer huishounumber) {
        this.huishounumber = huishounumber;
    }

    public String getHuishoupihao() {
        return huishoupihao;
    }

    public void setHuishoupihao(String huishoupihao) {
        this.huishoupihao = huishoupihao;
    }

    public String getJbr() {
        return jbr;
    }

    public void setJbr(String jbr) {
        this.jbr = jbr;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    @Override
    public String toString() {
        return "Huishou{" +
        "huishouid=" + huishouid +
        ", huishouname=" + huishouname +
        ", huishounumber=" + huishounumber +
        ", huishoupihao=" + huishoupihao +
        ", jbr=" + jbr +
        ", beizhu=" + beizhu +
        "}";
    }
}
