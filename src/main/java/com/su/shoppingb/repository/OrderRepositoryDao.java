package com.su.shoppingb.repository;

import com.su.shoppingb.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 18:32
 * @Author: Mr.SU
 * @Description:
 */
public interface OrderRepositoryDao extends JpaRepository<OrderDetail, Integer> {
}
