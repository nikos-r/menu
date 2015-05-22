/**
 * 
 */
package menu.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.util.Assert;

import menu.dao.GenericDAO;

/**
 * Generic DAO implementing basic DAO functionality.
 * 
 * @author rizopoulos
 *
 */
public abstract class GenericDAOImpl<E, PK> implements GenericDAO<E, PK>{

	private Class<E> type;
	
	
	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		type = (Class<E>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	/** 
	 * @see menu.dao.GenericDAO#findById(java.lang.Object)
	 */
	@Override
	public E findById(PK id) {
		Assert.notNull(id, "Primary key is null");
		return getEntityManager().find(type, id);
	}

	/** 
	 * @see menu.dao.GenericDAO#findAll()
	 */
	@Override
	public List<E> findAll() {
		TypedQuery<E> query = getEntityManager().createQuery("SELECT e FROM "+type.getName() +" e", type);
		return query.getResultList();
	}

	
	
	
}
