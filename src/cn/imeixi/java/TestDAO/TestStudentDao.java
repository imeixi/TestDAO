package cn.imeixi.java.TestDAO;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import cn.imeixi.java.DAOimpl.JDBCToolsFromC3P0;
import cn.imeixi.java.DAOimpl.JDBCToolsFromDbcp;

public class TestStudentDao {
	
	StudentDAO studentDao = new StudentDAO();

	@Test
	public void testBatch() {
		Connection connection = null;
		try {
			connection = JDBCToolsFromDbcp.getConnection();
			String sql = "insert into student values(?,?,?,?)";
			Object[] args[] = {{15,"lily","female","1988-10-10"},{16,"Toney","male","1988-10-10"}};
			studentDao.batch(connection, sql,args);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}

	@Test
	public void testGetForValue() {
		Date birth = null;
		Connection connection = null;
		try {
			connection  = JDBCToolsFromDbcp.getConnection();
			String sql = "select birth from student " + 
						"where id = ?";
			birth = studentDao.getForValue(connection, sql, 5);
			System.out.println(birth);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCToolsFromDbcp.release(null, null, connection);
		}
	}

	@Test
	public void testGetForList() {
		List<Student> list = new ArrayList<>();
		Connection connection = null;
		try {
			connection = JDBCToolsFromC3P0.getConnection();
			String sql = "select id,name,sex,birth from student " +
					"where id >= ?";
			list = studentDao.getForList(connection, sql, 6);
			System.out.println(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCToolsFromC3P0.release(null, null, connection);
		}
	}

	@Test
	public void testGet() {
		
		Connection connection = null;
		try {
			connection = JDBCToolsFromC3P0.getConnection();
			
			String sql = "select id,name,sex,birth from student " +
							"where id = ?";
			
			Student student = studentDao.get(connection, sql, 14);
			System.out.println(student);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();		
		}finally{
			JDBCToolsFromC3P0.release(null, null, connection);
		}
	}

	@Test
	public void testUpdate() {
		Connection connection = null;
		try {
			connection = JDBCToolsFromC3P0.getConnection();
			
			String sql = "update student set name = 'jackey' " +
							"where id = ?";
			studentDao.update(connection, sql, 14);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();		
		}finally{
			JDBCToolsFromC3P0.release(null, null, connection);
		}
	}

}
