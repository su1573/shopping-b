package com.su.shoppingb.controller;

import com.su.shoppingb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 18:44
 * @Author: Mr.SU
 * @Description:
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
    * @Description: 获取所有商品分类
    * @param: "[]"
    * @Return: java.lang.Object
    * @Author: supenghui
    * @Date: 2020/12/29 18:53
    */
    @GetMapping("/get_all")
    public Object getAll() {
        return categoryService.getAll();
    }

}
