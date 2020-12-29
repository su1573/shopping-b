package com.su.shoppingb.mapper;

import com.su.shoppingb.dto.GoodDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 16:18
 * @Author: Mr.SU
 * @Description:
 */
@Repository
public interface GoodMapper {

    List<GoodDTO> getAllOdd();
    List<GoodDTO> getAllEvent();
    List<GoodDTO> getTitle();
}
