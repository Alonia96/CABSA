package com.dam2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Alba Mart�n Castell�
 * In this class are declared all the variables that we will use in the query requests 
 * (and declared in the database).
 */

@Entity
@Table(name="food")
public class Food {
	
	
    @Id
	private Integer id;
	
	@Column(name="name")
	private String name;

	/**
	 * @param id, to declare the id of the food.
	 * @param name, to declare the name of the food.
	 */
	public Food(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * Empty constructor required for queries to work.
	 */
	public Food() {}

	/**
	 * @return id, to get the id of the food.
	 */
	public Integer getId() {return id;}

	/**
	 * @param id, to set the id of the food.
	 */
	public void setId(Integer id) {this.id = id;}

	/**
	 * @return name, to get the name of the food.
	 */
	public String getName() {return name;}

	/**
	 * @param name, to set the name of the food.
	 */
	public void setName(String name) {this.name = name;}

}