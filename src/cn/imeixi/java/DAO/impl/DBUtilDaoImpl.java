package cn.imeixi.java.DAO.impl;

import java.sql.Connection;
import java.util.List;

import cn.imeixi.java.DAO.DAO;

public class DBUtilDaoImpl<T> implements DAO <T>{

	@Override
	public void batch(Connection connection, String sql, Object... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E> E getForValue(Connection connection, String sql, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getForList(Connection connection, String sql, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T get(Connection connection, String sql, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Connection connection, String sql, Object... args) {
		// TODO Auto-generated method stub
		
	}

}
