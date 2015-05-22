
package menu.dao;



import java.util.List;

import menu.common.model.Ingredient;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 * @author rizopoulos
 *
 */
@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/resources/spring-jpa-test.xml"})
public class DaoTest {

	@Autowired
	IngredientDAO dao;
	
	@Test
	public void testSomething(){
		Ingredient carrot = dao.findById((long)1);
		Assert.assertNotNull("a carrot ingredient exists", carrot);
		Assert.assertEquals("the carrot has correct name", carrot.getName(), "carrot");
	}
	
	@Test
	public void testSomethingElse(){
		List<Ingredient> ingredients = dao.findAll();
		Assert.assertEquals(ingredients.size(), 2);
	}
}
