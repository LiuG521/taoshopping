package com.cssl.service;

import com.cssl.pojo.Product_introduce;

import java.util.List;

/**
 * Created by Administrator on 2018/9/15.
 */
public interface Product_introduceService {

       public List<Product_introduce> sellistpibypd_id(int pd_id);
}
