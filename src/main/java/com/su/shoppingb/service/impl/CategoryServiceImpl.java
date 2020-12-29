package com.su.shoppingb.service.impl;

import com.su.shoppingb.domain.Category;
import com.su.shoppingb.repository.CategoryRepositoryDao;
import com.su.shoppingb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 18:46
 * @Author: Mr.SU
 * @Description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepositoryDao categoryRepositoryDao;
    @Override
    public List<Category> getAll() {
        return categoryRepositoryDao.findAll();
    }
}
