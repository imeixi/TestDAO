package cn.imeixi.java.DAOimpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.imeixi.java.DAO.DAO;


/**
 * 通过DButil工具集实现DAO接口
 * @author perfermance
 *
 * @param <T>
 */
public class JdbcDaoImpl<T> implements DAO <T>{

	private QueryRunner queryRunner = null;
	private Class<T> type = null;
	
	public JdbcDaoImpl() {
		queryRunner = new QueryRunner();
		type = ReflectionUtils.getSuperGenericType(getClass());
	}
	
	@Override
	public void batch(Connection connection, String sql, Object[] ... args) throws Exception {
		queryRunner.batch(connection, sql, args);
	}

	@Override
	public <E> E getForValue(Connection connection, String sql, Object... args) throws Exception {
		
		return (E) queryRunner.query(connection, sql, new ScalarHandler(), args);
	}

	@Override
	public List<T> getForList(Connection connection, String sql, Object... args) throws SQLException {

		return queryRunner.query(connection, sql, new BeanListHandler<>(type), args);
	}

	@Override
	public T get(Connection connection, String sql, Object... args) throws Exception {
		return queryRunner.query(connection, sql, new BeanHandler<>(type), args);
	
	}

	@Override
	public void update(Connection connection, String sql, Object... args) throws SQLException {
		queryRunner.update(connection, sql, args);
	}

}
