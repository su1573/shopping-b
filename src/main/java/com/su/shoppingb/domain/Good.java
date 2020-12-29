package com.su.shoppingb.domain;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 14:50
 * @Author: Mr.SU
 * @Description: 商品实体类
 */
@Entity
@Proxy(lazy = false) //设置懒加载方式
@DynamicUpdate   //自动更新
public class Good {

    /** 商品id. */
    @Id
    @GeneratedValue
    private Integer goodId;

    /** 商品名称. */
    private String goodName;

    /** 商品价格. */
    private BigDecimal goodPrice;

    /** 商品主图片. */
    private String goodMainUrl;

    /** 商品详细图片. */
    private String goodDetailUrls;

    /** 商品类别. */
    private String goodType;

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public BigDecimal getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(BigDecimal goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoodMainUrl() {
        return goodMainUrl;
    }

    public void setGoodMainUrl(String goodMainUrl) {
        this.goodMainUrl = goodMainUrl;
    }

    public String getGoodDetailUrls() {
        return goodDetailUrls;
    }

    public void setGoodDetailUrls(String goodDetailUrls) {
        this.goodDetailUrls = goodDetailUrls;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }

    public Good() {
    }

    public Good(Integer goodId, String goodName, BigDecimal goodPrice, String goodMainUrl, String goodDetailUrls,
                String goodType) {
        super();
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.goodMainUrl = goodMainUrl;
        this.goodDetailUrls = goodDetailUrls;
        this.goodType = goodType;
    }

    public Good(String goodName,String goodMainUrl) {
        super();
        this.goodName=goodName;
        this.goodMainUrl=goodMainUrl;
    }

    @Override
    public String toString() {
        return "Good [goodId=" + goodId + ", goodName=" + goodName + ", goodPrice=" + goodPrice + ", goodMainUrl="
                + goodMainUrl + ", goodDetailUrls=" + goodDetailUrls + ",goodType=" + goodType + "]";
    }
}
