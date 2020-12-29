package com.su.shoppingb.dto;

import java.math.BigDecimal;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 17:14
 * @Author: Mr.SU
 * @Description:
 */
public class GoodDTO {
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

    @Override
    public String toString() {
        return "GoodDTO{" +
                "goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", goodPrice=" + goodPrice +
                ", goodMainUrl='" + goodMainUrl + '\'' +
                ", goodDetailUrls='" + goodDetailUrls + '\'' +
                ", goodType='" + goodType + '\'' +
                '}';
    }
}
