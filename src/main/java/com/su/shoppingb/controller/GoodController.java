package com.su.shoppingb.controller;

import com.su.shoppingb.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 14:54
 * @Author: Mr.SU
 * @Description:
 */
@RestController
@RequestMapping("/good")
public class GoodController {

    @Autowired
    private GoodService goodService;

    /**
    * @Description: 获取奇数商品详情
    * @param: "[]"
    * @Return: java.lang.Object
    * @Author: supenghui
    * @Date: 2020/12/29 14:57
    */
    @GetMapping("/get_all_odd")
    public Object getAllOdd() {
        return goodService.getAllOdd();
    }

    /**
    * @Description: 获取偶数商品详情
    * @param: "[]"
    * @Return: java.lang.Object
    * @Author: supenghui
    * @Date: 2020/12/29 17:37
    */
    @GetMapping("/get_all_even")
    public Object getAllEvent() {
        return goodService.getAllEvent();
    }

    /**
    * @Description: 获取标题
    * @param: "[]"
    * @Return: java.lang.Object
    * @Author: supenghui
    * @Date: 2020/12/29 17:37
    */
    @GetMapping("/get_title")
    public Object getTitle() {
        return goodService.getTitle();
    }

    /**
    * @Description: 获取所有商品
    * @param: "[]"
    * @Return: java.lang.Object
    * @Author: supenghui
    * @Date: 2020/12/29 18:36
    */
    @GetMapping("/get_all")
    public Object getAll() {
        return goodService.getAll();
    }

    /**
    * @Description: 添加订单
    * @param: "[]"
    * @Return: java.lang.Object
    * @Author: supenghui
    * @Date: 2020/12/29 18:53
    */
    @PostMapping("/order")
    public Object order(@RequestBody String json) {
        return goodService.order(json);
    }

}
