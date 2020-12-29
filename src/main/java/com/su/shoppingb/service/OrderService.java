package com.su.shoppingb.service;

import com.su.shoppingb.domain.OrderDetail;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 17:59
 * @Author: Mr.SU
 * @Description:
 */
@Service
public interface OrderService {

    List<OrderDetail> getAll();
}
