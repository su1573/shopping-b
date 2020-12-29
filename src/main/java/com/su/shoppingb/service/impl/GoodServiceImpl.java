package com.su.shoppingb.service.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.su.shoppingb.domain.Good;
import com.su.shoppingb.domain.OrderDetail;
import com.su.shoppingb.dto.GoodDTO;
import com.su.shoppingb.mapper.GoodMapper;
import com.su.shoppingb.repository.GoodRepositoryDao;
import com.su.shoppingb.repository.OrderRepositoryDao;
import com.su.shoppingb.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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

    @Autowired
    private OrderRepositoryDao orderRepositoryDao;

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

    public Object order(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);// 允许使用未带引号的字段名
            mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true); // 允许使用单引号
            JsonNode node = mapper.readTree(json);
            String exper = node.get("json").toString();
            // 去掉首位的多余双引号和字符串内的\，jackson真的规则多。。。
            String neeee = exper.substring(1, exper.length() - 1);
            neeee = neeee.replace("\\", "");// 不能用replaceAll，注意二者区别,后者参数是正则表达式
//            goodRepositoryDao.deleteAll();

            OrderDetail[] arr = mapper.readValue(neeee, OrderDetail[].class);
            for (int i = 0; i < arr.length; i++) {
                BigDecimal goodPrice = arr[i].getGoodPrice();
                OrderDetail order = new OrderDetail(arr[i].getGoodName(), goodPrice, arr[i].getGoodMainUrl(), arr[i].getGoodNum());
                orderRepositoryDao.save(order);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "I know";

    }
}
