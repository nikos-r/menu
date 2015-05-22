package menu.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import menu.common.model.Ingredient;
import menu.dao.IngredientDAO;


@Component(value="ingredientDao")
public class IngredientDAOImpl extends GenericDAOImpl<Ingredient, Long> implements IngredientDAO {

	@PersistenceContext
	EntityManager em;

	/** 
	 * @see menu.dao.GenericDAO#getEntityManager()
	 */
	@Override
	public EntityManager getEntityManager() {
		return em;
	}



}
