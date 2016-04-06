package cn.imeixi.java.TestDataSoureConfig;

import static org.junit.Assert.*;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestC3P0Configure {

	@Test
	public void testC3p0WithConfigFile() throws Exception{
		DataSource dataSource = new ComboPooledDataSource("helloC3p0");
		System.out.println(dataSource.getConnection());
		
		ComboPooledDataSource comboPooledDataSource = (ComboPooledDataSource) dataSource;
		System.out.println(comboPooledDataSource.getMaxPoolSize());
		
	}
	
	
	@Test
	public void testC3P0() throws Exception {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setDriverClass("com.mysql.jdbc.Driver");
		cpds.setJdbcUrl("jdbc:mysql://qdm161904473.my3w.com:3306/qdm161904473_db");
		cpds.setUser("qdm161904473");
		cpds.setPassword("12345678");
		
		System.out.println(cpds.getConnection());
		System.out.println(cpds.getInitialPoolSize());
	}

}
