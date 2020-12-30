package com.su.shoppingb.controller;

import com.su.shoppingb.domain.Cart;
import com.su.shoppingb.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 9:46
 * @Author: Mr.SU
 * @Description:
 */
@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    /**
    * @Description: 获取所有购物车商品
    * @param: "[]"
    * @Return: java.lang.Object
    * @Author: supenghui
    * @Date: 2020/12/29 18:53
    */
    @GetMapping("/get_all")
    public Object getAll() {
        return cartService.getList();
    }

    /**
    * @Description: 添加购物车
    * @param: "[cart]"
    * @Return: void
    * @Author: supenghui
    * @Date: 2020/12/29 18:54
    */
    @GetMapping("/add")
    public void add(Cart cart) {
        cartService.add(cart);
    }


}
