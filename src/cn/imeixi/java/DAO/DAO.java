package cn.imeixi.java.DAO;

import java.sql.Connection;
import java.util.List;
import java.util.Objects;

/**
 * 访问数据库的DAO接口
 * @author perfermance
 * @param T：DAO 处理的实体类的类型 
 *
 */
public interface DAO <T> {
	
	/**
	 * 批量提交
	 * @param connection
	 * @param sql
	 * @param args
	 */
	void batch(Connection connection,String sql,Object ... args);
	
	/**
	 * 返回具体的一个值，例如总人数，平均工资，某一个人的email等。
	 * @param connection
	 * @param sql
	 * @param args
	 * @return
	 */
	<E> E getForValue(Connection connection,String sql,Object ... args);
	
	/**
	 * 返回 T 的一个集合
	 * @param connection
	 * @param sql
	 * @param args
	 * @return
	 */
	List<T> getForList(Connection connection,String sql,Object ... args);
	
	/**
	 * 返回一个 T 对象
	 * @param connection
	 * @param sql
	 * @param args
	 */
	 T get(Connection connection,String sql,Object ... args);
	
	/**
	 * INSERT,UPDATE,DELETE
	 * @param connection:数据库链接
	 * @param sql：SQL语句
	 * @param args：填充占位符
	 */
	void update(Connection connection,String sql,Object ... args);

}
  