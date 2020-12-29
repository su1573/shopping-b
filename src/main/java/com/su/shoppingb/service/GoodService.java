package com.su.shoppingb.service;

import com.su.shoppingb.domain.Good;
import com.su.shoppingb.dto.GoodDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 14:54
 * @Author: Mr.SU
 * @Description:
 */
@Service
public interface GoodService {

    List<GoodDTO> getAllOdd();
    List<GoodDTO> getAllEvent();
    List<GoodDTO> getTitle();
    List<Good> getAll();
}
