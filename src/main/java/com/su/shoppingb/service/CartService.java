package com.su.shoppingb.service;

import com.su.shoppingb.domain.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 10:04
 * @Author: Mr.SU
 * @Description:
 */
@Service
public interface CartService {

    List<Cart> getList();

    void add(Cart cart);
}
