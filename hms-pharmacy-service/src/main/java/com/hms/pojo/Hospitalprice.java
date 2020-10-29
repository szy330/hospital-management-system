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
 * @since 2020-10-28
 */
@ApiModel(value="Hospitalprice对象", description="")
public class Hospitalprice implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "hospitalpriceid", type = IdType.AUTO)
    private Integer hospitalpriceid;

    @TableField("registerId")
    private Integer registerId;

    private String durgname;

    private Integer durgnum;

    private Double repiceprice;

    private Double repicetotal;

    private Date htime;

    private Integer state;


    public Integer getHospitalpriceid() {
        return hospitalpriceid;
    }

    public void setHospitalpriceid(Integer hospitalpriceid) {
        this.hospitalpriceid = hospitalpriceid;
    }

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }

    public String getDurgname() {
        return durgname;
    }

    public void setDurgname(String durgname) {
        this.durgname = durgname;
    }

    public Integer getDurgnum() {
        return durgnum;
    }

    public void setDurgnum(Integer durgnum) {
        this.durgnum = durgnum;
    }

    public Double getRepiceprice() {
        return repiceprice;
    }

    public void setRepiceprice(Double repiceprice) {
        this.repiceprice = repiceprice;
    }

    public Double getRepicetotal() {
        return repicetotal;
    }

    public void setRepicetotal(Double repicetotal) {
        this.repicetotal = repicetotal;
    }

    public Date getHtime() {
        return htime;
    }

    public void setHtime(Date htime) {
        this.htime = htime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Hospitalprice{" +
        "hospitalpriceid=" + hospitalpriceid +
        ", registerId=" + registerId +
        ", durgname=" + durgname +
        ", durgnum=" + durgnum +
        ", repiceprice=" + repiceprice +
        ", repicetotal=" + repicetotal +
        ", htime=" + htime +
        ", state=" + state +
        "}";
    }
}
