package com.su.shoppingb.domain;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 17:54
 * @Author: Mr.SU
 * @Description: 订单
 */
@Entity
@Proxy(lazy = false) //设置懒加载方式
@DynamicUpdate   //自动更新
public class OrderDetail {
    /** 订单id. */
    @Id
    @GeneratedValue
    private Integer orderId;

    /** 商品名称. */
    private String goodName;

    /** 商品价格. */
    private BigDecimal goodPrice;

    /** 商品图片 */
    private String goodMainUrl;

    /** 商品数量 */
    private Integer goodNum;

    public OrderDetail() {
    }

    public Integer getOrderId() {
        return orderId;
    }
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
    public Integer getGoodNum() {
        return goodNum;
    }
    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }
    public OrderDetail(Integer orderId, String goodName, BigDecimal goodPrice, String goodMainUrl, Integer goodNum) {
        super();
        this.orderId = orderId;
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.goodMainUrl = goodMainUrl;
        this.goodNum = goodNum;
    }
    public OrderDetail(String goodName, BigDecimal goodPrice, String goodMainUrl, Integer goodNum) {
        super();
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.goodMainUrl = goodMainUrl;
        this.goodNum = goodNum;
    }
}
