package com.spring.gogidang.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.gogidang.domain.MenuVO;
import com.spring.mapper.MenuMapper;
import com.spring.mapper.StoreMapper;

@Service("menuService") 
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public ArrayList<MenuVO> menuList(int s_num) {
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		ArrayList<MenuVO> menuList = new ArrayList<MenuVO>();
		menuList = menuMapper.listByNum(s_num);
		
		return menuList;
	}
	
	@Override
	public void menuModify(int menu_num) {
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		menuMapper.modifyByNum(menu_num);
	}
	
	@Override
	public void menuDelete(int menu_num) {
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		menuMapper.deleteByNum(menu_num);
	}
	
	@Override
	public int menuRegister(MenuVO menuVO) {
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		
		return menuMapper.register(menuVO);
	}

}
