package com.shihe.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shihe
 * @since 2021-02-21
 */
public class SgdIndexEtf extends Model<SgdIndexEtf> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 代码
     */
    private String sCode;

    /**
     * 名称
     */
    private String sName;

    /**
     * 价格
     */
    private String price;

    /**
     * 行业
     */
    private String industry;

    /**
     * 地区
     */
    private String area;

    /**
     * 权重
     */
    private Double weight;

    /**
     * 每股收益
     */
    private Double perSy;

    /**
     * 每股净资产
     */
    private Double perJzc;

    /**
     * roe
     */
    private Double roe;

    /**
     * 总股本-亿
     */
    private String totalAmount;

    /**
     * 流通股本-亿
     */
    private String totalExe;

    /**
     * 流通市值
     */
    private BigDecimal exPrice;

    /**
     * 指数
     */
    private String indexType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPerSy() {
        return perSy;
    }

    public void setPerSy(Double perSy) {
        this.perSy = perSy;
    }

    public Double getPerJzc() {
        return perJzc;
    }

    public void setPerJzc(Double perJzc) {
        this.perJzc = perJzc;
    }

    public Double getRoe() {
        return roe;
    }

    public void setRoe(Double roe) {
        this.roe = roe;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTotalExe() {
        return totalExe;
    }

    public void setTotalExe(String totalExe) {
        this.totalExe = totalExe;
    }

    public BigDecimal getExPrice() {
        return exPrice;
    }

    public void setExPrice(BigDecimal exPrice) {
        this.exPrice = exPrice;
    }

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SgdIndexEtf{" +
        "id=" + id +
        ", sCode=" + sCode +
        ", sName=" + sName +
        ", price=" + price +
        ", industry=" + industry +
        ", area=" + area +
        ", weight=" + weight +
        ", perSy=" + perSy +
        ", perJzc=" + perJzc +
        ", roe=" + roe +
        ", totalAmount=" + totalAmount +
        ", totalExe=" + totalExe +
        ", exPrice=" + exPrice +
        ", indexType=" + indexType +
        "}";
    }
}
