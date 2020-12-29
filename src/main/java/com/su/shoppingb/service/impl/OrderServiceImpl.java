package com.su.shoppingb.service.impl;

import com.su.shoppingb.domain.OrderDetail;
import com.su.shoppingb.repository.OrderRepositoryDao;
import com.su.shoppingb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 18:31
 * @Author: Mr.SU
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepositoryDao orderRepositoryDao;

    @Override
    public List<OrderDetail> getAll() {
        return orderRepositoryDao.findAll();
    }
}
