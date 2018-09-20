package com.cssl.service;

import com.cssl.pojo.Product_details;

import java.util.List;

/**
 * Created by Administrator on 2018/9/13.
 */
public interface Product_detailsService {

       public List<Product_details> sellistpdbypt_id(int pt_id);

       public Product_details selpdbypd_id(int pd_id);

}
