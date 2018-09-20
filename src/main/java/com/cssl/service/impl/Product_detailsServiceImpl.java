package com.cssl.service.impl;

import com.cssl.dao.Product_detailsMapper;
import com.cssl.pojo.Product_details;
import com.cssl.service.Product_detailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/9/1
 */
@Service
public class Product_detailsServiceImpl implements Product_detailsService {
    @Autowired
    private Product_detailsMapper pd;

    public List<Product_details> sellistpdbypt_id(int pt_id) {
        return pd.sellistpdbypt_id(pt_id);
    }

    @Override
    public Product_details selpdbypd_id(int pd_id) {
        System.out.println("pd_id"+pd_id);
        return pd.selpdbypd_id(pd_id);
    }
}
