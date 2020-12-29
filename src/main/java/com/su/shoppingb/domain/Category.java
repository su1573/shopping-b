package com.su.shoppingb.domain;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 18:42
 * @Author: Mr.SU
 * @Description: 商品类别
 */
@Entity
@Proxy(lazy = false) //设置懒加载方式
@DynamicUpdate   //自动更新
public class Category {

    /** 类别id. */
    @Id
    @GeneratedValue
    private Integer catId;

    /** 类别名称. */
    private String catName;

    /** 类别类型. */
    private String catType;

    /** 类别图片. */
    private String catBanner;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    public String getCatBanner() {
        return catBanner;
    }

    public void setCatBanner(String catBanner) {
        this.catBanner = catBanner;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Category() {
    }

    public Category(Integer catId, String catName, String catType, String catBanner) {
        super();
        this.catId = catId;
        this.catName = catName;
        this.catType = catType;
        this.catBanner = catBanner;
    }
}
