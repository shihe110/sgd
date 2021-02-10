package com.shihe.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shihe
 * @since 2021-02-09
 */
public class SgdPupFlow extends Model<SgdPupFlow> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 城市
     */
    private String city;

    /**
     * 统计年度
     */
    private String statisticalYear;

    /**
     * 户籍人口
     */
    private String populationLocal;

    /**
     * 常驻人口
     */
    private String populationLongTerm;

    /**
     * 人口净流入量-万
     */
    private String populationInflowNum;

    /**
     * 净流入占比%
     */
    private String inflowRt;

    /**
     * 经济圈
     */
    private String economicCircle;

    /**
     * 省份
     */
    private String province;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatisticalYear() {
        return statisticalYear;
    }

    public void setStatisticalYear(String statisticalYear) {
        this.statisticalYear = statisticalYear;
    }

    public String getPopulationLocal() {
        return populationLocal;
    }

    public void setPopulationLocal(String populationLocal) {
        this.populationLocal = populationLocal;
    }

    public String getPopulationLongTerm() {
        return populationLongTerm;
    }

    public void setPopulationLongTerm(String populationLongTerm) {
        this.populationLongTerm = populationLongTerm;
    }

    public String getPopulationInflowNum() {
        return populationInflowNum;
    }

    public void setPopulationInflowNum(String populationInflowNum) {
        this.populationInflowNum = populationInflowNum;
    }

    public String getInflowRt() {
        return inflowRt;
    }

    public void setInflowRt(String inflowRt) {
        this.inflowRt = inflowRt;
    }

    public String getEconomicCircle() {
        return economicCircle;
    }

    public void setEconomicCircle(String economicCircle) {
        this.economicCircle = economicCircle;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SgdPupFlow{" +
        "id=" + id +
        ", city=" + city +
        ", statisticalYear=" + statisticalYear +
        ", populationLocal=" + populationLocal +
        ", populationLongTerm=" + populationLongTerm +
        ", populationInflowNum=" + populationInflowNum +
        ", inflowRt=" + inflowRt +
        ", economicCircle=" + economicCircle +
        ", province=" + province +
        "}";
    }
}
