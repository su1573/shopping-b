package com.su.shoppingb.repository;

import com.su.shoppingb.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 9:56
 * @Author: Mr.SU
 * @Description:
 */
public interface CartRepositoryDao extends JpaRepository<Cart, Integer> {

}
