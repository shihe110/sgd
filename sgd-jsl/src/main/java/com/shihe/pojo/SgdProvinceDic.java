package com.shihe.pojo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shihe
 * @since 2021-02-09
 */
public class SgdProvinceDic extends Model<SgdProvinceDic> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 代号
     */
    private String pCode;

    /**
     * 全称
     */
    private String fullName;

    /**
     * 半全称
     */
    private String halfFullName;

    /**
     * 简称
     */
    private String shortName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHalfFullName() {
        return halfFullName;
    }

    public void setHalfFullName(String halfFullName) {
        this.halfFullName = halfFullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SgdProvinceDic{" +
        "id=" + id +
        ", pCode=" + pCode +
        ", fullName=" + fullName +
        ", halfFullName=" + halfFullName +
        ", shortName=" + shortName +
        "}";
    }
}
