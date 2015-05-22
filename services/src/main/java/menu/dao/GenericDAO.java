/**
 * 
 */
package menu.dao;

import java.util.List;

import javax.persistence.EntityManager;

/**
 * 
 * @author rizopoulos
 */
public interface GenericDAO<E, PK> {

	
	/**
	 * Get the entity manager for this DAO
	 * @return the entity manager for this DAO
	 */
	EntityManager getEntityManager();
	
	/**
	 * Find the entity with the given primary key
	 * @param id
	 * @return the entity found
	 */
	E findById(PK id);
	
	/**
	 * Find all existing entities
	 * @return all existing entities found
	 */
	List<E> findAll();
}
