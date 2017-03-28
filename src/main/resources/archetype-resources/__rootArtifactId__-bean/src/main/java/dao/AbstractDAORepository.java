#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import java.io.Serializable;
import java.util.List;

public interface AbstractDAORepository<T extends Serializable> {

	public T find(Object id);
	
	public void persist(final T entity);
	
	public List<T> findAll();
	
	public void deleteAll();
	
	public void delete(Object id);
	
	public void update(final T entity);
	
}