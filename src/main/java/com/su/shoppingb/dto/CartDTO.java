package com.su.shoppingb.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 10:08
 * @Author: Mr.SU
 * @Description:
 */
public class CartDTO {
    public class Cart {

        /**
         * 购物车id.
         */
        private Integer cartId;

        /**
         * 商品id.
         */
        private Integer goodId;

        /**
         * 商品名字.
         */
        private String goodName;

        /**
         * 商品价格.
         */
        private BigDecimal goodPrice;

        /**
         * 商品主连接.
         */
        private String goodMainUrl;

        /**
         * 商品详情连接.
         */
        private String goodDetailUrls;

        /**
         * 是否选中.
         */
        private Integer selected;

        /**
         * 数量.
         */
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
    }
}
