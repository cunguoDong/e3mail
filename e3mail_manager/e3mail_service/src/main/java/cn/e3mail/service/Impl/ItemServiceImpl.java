package cn.e3mail.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mail.mapper.TbItemMapper;
import cn.e3mail.pojo.TbItem;
import cn.e3mail.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	public TbItem findItemById(Long id) {
		TbItem tbItem = itemMapper.selectByPrimaryKey(id);
		return tbItem;
	}

}
