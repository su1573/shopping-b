package com.su.shoppingb.service.impl;

import com.su.shoppingb.domain.Cart;
import com.su.shoppingb.repository.CartRepositoryDao;
import com.su.shoppingb.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 10:05
 * @Author: Mr.SU
 * @Description:
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepositoryDao cartRepositoryDao;
    @Override
    public List<Cart> getList() {
        return cartRepositoryDao.findAll();
    }

    @Override
    public void add(Cart cart) {
        cartRepositoryDao.save(cart);
    }
}
