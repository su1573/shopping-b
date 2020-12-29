package com.su.shoppingb.service.impl;

import com.su.shoppingb.domain.Good;
import com.su.shoppingb.dto.GoodDTO;
import com.su.shoppingb.mapper.GoodMapper;
import com.su.shoppingb.repository.GoodRepositoryDao;
import com.su.shoppingb.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 14:54
 * @Author: Mr.SU
 * @Description:
 */
@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodMapper goodMapper;

    @Autowired
    private GoodRepositoryDao goodRepositoryDao;

    public List<GoodDTO> getAllOdd() {
        return goodMapper.getAllOdd();
    }

    public List<GoodDTO> getAllEvent() {
        return goodMapper.getAllEvent();
    }

    public List<GoodDTO> getTitle() {
        return goodMapper.getTitle();
    }

    public List<Good> getAll() {
        return goodRepositoryDao.findAll();
    }
}
