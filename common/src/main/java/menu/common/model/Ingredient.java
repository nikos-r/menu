package menu.common.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Ingredient
 *
 */
@Entity
public class Ingredient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;
	
	private String name;
	
	public Ingredient() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
