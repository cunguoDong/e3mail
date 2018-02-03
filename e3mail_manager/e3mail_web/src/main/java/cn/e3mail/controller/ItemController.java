package cn.e3mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.e3mail.pojo.TbItem;
import cn.e3mail.service.ItemService;
/*@RestController就是包含了 @Controller @ResponseBody */

@RestController
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("item/{id}")
	public TbItem findItemById(@PathVariable Long id){
		TbItem tbItem = itemService.findItemById(id);
		return tbItem;
	}
}
