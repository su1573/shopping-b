package com.su.shoppingb.repository;

import com.su.shoppingb.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 18:47
 * @Author: Mr.SU
 * @Description:
 */
public interface CategoryRepositoryDao extends JpaRepository<Category, Integer> {
}
