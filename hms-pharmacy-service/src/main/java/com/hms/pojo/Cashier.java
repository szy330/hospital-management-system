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
@ApiModel(value="Cashier对象", description="")
public class Cashier implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "cashier", type = IdType.AUTO)
    private Integer cashier;

    @TableField("reportId")
    private Integer reportId;

    private String durgname;

    private Integer durgnum;

    private Double repiceprice;

    private Double repicetotal;

    private Integer state;

    private Date ctime;

    private Integer ostate;

    private String jie;

    private Integer mstate;


    public Integer getCashier() {
        return cashier;
    }

    public void setCashier(Integer cashier) {
        this.cashier = cashier;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    public String getJie() {
        return jie;
    }

    public void setJie(String jie) {
        this.jie = jie;
    }

    public Integer getMstate() {
        return mstate;
    }

    public void setMstate(Integer mstate) {
        this.mstate = mstate;
    }

    @Override
    public String toString() {
        return "Cashier{" +
        "cashier=" + cashier +
        ", reportId=" + reportId +
        ", durgname=" + durgname +
        ", durgnum=" + durgnum +
        ", repiceprice=" + repiceprice +
        ", repicetotal=" + repicetotal +
        ", state=" + state +
        ", ctime=" + ctime +
        ", ostate=" + ostate +
        ", jie=" + jie +
        ", mstate=" + mstate +
        "}";
    }
}
