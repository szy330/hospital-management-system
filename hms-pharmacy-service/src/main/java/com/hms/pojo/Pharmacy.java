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
 * @since 2020-10-25
 */
@ApiModel(value="Pharmacy对象", description="")
public class Pharmacy implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "pharmacyId", type = IdType.AUTO)
    private Integer pharmacyId;

    @TableField("pharmacyName")
    private String pharmacyName;

    @TableField("drugstoreId")
    private Integer drugstoreId;

    @TableField("skullId")
    private Integer skullId;

    @TableField("warehouseId")
    private Integer warehouseId;

    private Integer unit;

    @TableField("sellingPrice")
    private Double sellingPrice;

    private Integer area;

    private Integer type;

    @TableField("produceDate")
    private Date produceDate;

    @TableField("validDate")
    private Date validDate;

    private Integer drugstorenum;

    private String skullbatch;


    public Integer getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(Integer pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public Integer getDrugstoreId() {
        return drugstoreId;
    }

    public void setDrugstoreId(Integer drugstoreId) {
        this.drugstoreId = drugstoreId;
    }

    public Integer getSkullId() {
        return skullId;
    }

    public void setSkullId(Integer skullId) {
        this.skullId = skullId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Integer getDrugstorenum() {
        return drugstorenum;
    }

    public void setDrugstorenum(Integer drugstorenum) {
        this.drugstorenum = drugstorenum;
    }

    public String getSkullbatch() {
        return skullbatch;
    }

    public void setSkullbatch(String skullbatch) {
        this.skullbatch = skullbatch;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
        "pharmacyId=" + pharmacyId +
        ", pharmacyName=" + pharmacyName +
        ", drugstoreId=" + drugstoreId +
        ", skullId=" + skullId +
        ", warehouseId=" + warehouseId +
        ", unit=" + unit +
        ", sellingPrice=" + sellingPrice +
        ", area=" + area +
        ", type=" + type +
        ", produceDate=" + produceDate +
        ", validDate=" + validDate +
        ", drugstorenum=" + drugstorenum +
        ", skullbatch=" + skullbatch +
        "}";
    }
}
