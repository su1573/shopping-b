package com.su.shoppingb.controller;


import com.su.shoppingb.dto.GoodDTO;
import com.su.shoppingb.service.GoodService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: shopping-b
 * @Date: 2020/12/29 16:32
 * @Author: Mr.SU
 * @Description:
 */
public class GoodControllerTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private GoodService goodService;

    @Test
    public void getAllOdd() {
        List<GoodDTO> goodList =  (List<GoodDTO>)goodService.getAllOdd();
        logger.info(goodList.toString());
    }
}