package com.su.shoppingb.controller;

import com.su.shoppingb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 17:59
 * @Author: Mr.SU
 * @Description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
    * @Description: 获取所有订单
    * @param: "[]"
    * @Return: java.lang.Object
    * @Author: supenghui
    * @Date: 2020/12/29 18:53
    */
    @GetMapping("/get_all")
    public Object getAll() {
        return orderService.getAll();
    }

}
