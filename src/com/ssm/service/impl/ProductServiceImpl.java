package com.ssm.service.impl;

import com.ssm.dao.ProductMapper;
import com.ssm.pojo.Product;
import com.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Maze on 2018-04-12.
 */

@Service
public class ProductServiceImpl implements ProductService
{
    @Autowired
   private ProductMapper productMapper;
    public ProductMapper getProductMapper() {
        return productMapper;
    }
    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public List<Product> findAllPRO() {
        return productMapper.findAllPRO();
    }

    @Override
    public List<Product> getPageSelPRO(Map<String, Object> map) {
        return productMapper.getPageSelPRO(map);
    }

    @Override
    public int getCount() {
        return productMapper.getCount();
    }

    @Override
    public int DeletePRO(Integer id) {
        return productMapper.DeletePRO(id);
    }
}
