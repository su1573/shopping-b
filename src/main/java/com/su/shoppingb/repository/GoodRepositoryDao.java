package com.su.shoppingb.repository;

import com.su.shoppingb.domain.Good;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 14:53
 * @Author: Mr.SU
 * @Description:
 */
public interface GoodRepositoryDao extends JpaRepository<Good, Integer> {

    List<Good> findByGoodType(String goodType);
}
