package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: sunxinzhi
 * lbcdzyy
 * @Date: 2020/7/30 16:26
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/save")
    public String save(Model model){
        List<Items> itemsList = itemsService.findAll();
        model.addAttribute("items",itemsList);
        return "items";
    }
}
