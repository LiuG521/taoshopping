package com.cssl.service.impl;

import com.cssl.dao.Product_typeMapper;
import com.cssl.pojo.Product_type;
import com.cssl.service.Product_typeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/9/12.
 */
@Service
public class Product_typeServiceImpl implements Product_typeService {
        @Autowired
        Product_typeMapper  pt;

        //查询商品类别
        public List<Product_type> sel_product_type() {
              List<Product_type> list=pt.sel_product_type();
              return list;
        }
}
