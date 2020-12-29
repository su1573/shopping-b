package com.su.shoppingb.domain;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 9:49
 * @Author: Mr.SU
 * @Description: 购物车实体类
 */
@Entity
@Proxy(lazy = false) //设置懒加载方式
@DynamicUpdate   //自动更新
//@Data       //lombok中使用的   包含getter/setter/toString方法
public class Cart {

    /** 购物车id. */
    @Id
    @GeneratedValue
    private Integer cartId;

    /** 商品id. */
    private Integer goodId;

    /** 商品名字. */
    private String goodName;

    /** 商品价格. */
    private BigDecimal goodPrice;

    /** 商品主连接. */
    private String goodMainUrl;

    /** 商品详情连接. */
    private String goodDetailUrls;

    /** 是否选中. */
    private Integer selected;

    /** 数量. */
    private Integer num;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getGoodId() {
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

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getGoodDetailUrls() {
        return goodDetailUrls;
    }

    public void setGoodDetailUrls(String goodDetailUrls) {
        this.goodDetailUrls = goodDetailUrls;
    }

    public Cart() {
    }

    public Cart(Integer cartId, Integer goodId, String goodName, BigDecimal goodPrice, String goodMainUrl, String goodDetailUrls,
                Integer selected, Integer num) {
        super();
        this.cartId = cartId;
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.goodMainUrl = goodMainUrl;
        this.goodDetailUrls = goodDetailUrls;
        this.selected = selected;
        this.num = num;
    }

    public Cart(Integer goodId, String goodName, BigDecimal goodPrice, String goodMainUrl, String goodDetailUrls) {
        super();
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.goodMainUrl = goodMainUrl;
        this.goodDetailUrls = goodDetailUrls;
    }

    @Override
    public String toString() {
        return "Cart [cartId=" + cartId + ", goodId=" + goodId + ", goodName=" + goodName + ", goodPrice=" + goodPrice
                + ", goodMainUrl=" + goodMainUrl + ", goodDetailUrls=" + goodDetailUrls + ", selected=" + selected
                + ", num=" + num + "]";
    }
}