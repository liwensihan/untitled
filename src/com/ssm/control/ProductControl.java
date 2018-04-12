package com.ssm.control;

import com.ssm.pojo.Product;
import com.ssm.service.ProductService;
import com.ssm.tools.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Maze on 2018-04-12.
 */
@Controller
public class ProductControl {
    @Autowired
    private ProductService productService;

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/intoPRO")
    public String showPro(Model model, String pageNo) {
        Pager pg = new Pager();
        //当前页
        if (pageNo == null) {
            pg.setPageNo(1);
        } else {
            pg.setPageSize(Integer.parseInt(pageNo));
        }
        //总记录数
        int totalCount = productService.getCount();
        pg.setTotalCount(totalCount);
        pg.setPageSize(4);
        //总页数
        int pageCount = totalCount % pg.getPageSize() == 0 ? (totalCount / pg.getPageSize()) : (totalCount / pg.getPageSize() + 1);
        pg.setPageCount(pageCount);
        //集合查询传值
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("pageNo", (pg.getPageNo() - 1) * pg.getPageSize());
        map.put("pageSize", pg.getPageSize());
        //数据集合
        List<Product> list = productService.getPageSelPRO(map);
        pg.setPlist(list);
        model.addAttribute("page", pg);
        return "showProduct";
    }

    @RequestMapping("/deletePRO")
    public String DeletePRO(String id) {
        int count = productService.DeletePRO(id);
        if (count > 0) {
            return "redirect:/intoPRO";
        } else {
            return "redirect:/intoPRO";
        }
    }
}

