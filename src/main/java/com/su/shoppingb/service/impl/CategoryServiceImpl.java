package com.su.shoppingb.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.su.shoppingb.domain.Category;
import com.su.shoppingb.domain.Good;
import com.su.shoppingb.dto.FullCategory;
import com.su.shoppingb.repository.CategoryRepositoryDao;
import com.su.shoppingb.repository.GoodRepositoryDao;
import com.su.shoppingb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Autowired
    private GoodRepositoryDao goodRepositoryDao;
    @Override
    public Object getAll() {
        String ret = null;
        try {
            List<Category> results = categoryRepositoryDao.findAll();
            List<FullCategory> full_results=new ArrayList<>();
            for (Category category : results) {
                List<Good> goods = goodRepositoryDao.findByGoodType(category.getCatType());
                FullCategory fullCategory=new FullCategory(category, goods);
                full_results.add(fullCategory);
            }
            ObjectMapper mapper = new ObjectMapper();
            ret = mapper.writeValueAsString(full_results);
            System.out.println(ret);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return ret;

    }
}
