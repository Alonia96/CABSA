package com.dam2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Alba Mart�n Castell�
 * In this class are declared all the variables that we will use in the query requests 
 * (and declared in the database).
 */

@Entity
@Table(name="animal")
public class Animal {
	
	@Id
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="legs")
	private int legs;

	@Transient
	private String food;
	
	

	/**
	 * @param id, identifier.
	 * @param name, name of the animal.
	 * @param legs, legs of the animal.
	 */
	public Animal(Integer id, String name, int legs) {
		this.id = id;
		this.name = name;
		this.legs = legs;
		this.food = "none";
	}

	/**
	 * @param id, identifier.
	 * @param name, name of the animal.
	 * @param legs, legs of the animal.
	 * @param food, food that the animal eats.
	 * Another constructor needed to combine the object Animal with Food.
	 */
	public Animal(Integer id, String name, int legs, String food) {
		this.id = id;
		this.name = name;
		this.legs = legs;
		this.food = food;
	}

	/**
	 * Empty constructor required for queries to work.
	 */
	public Animal() {}

	/**
	 * @return id, to get the id of the animal.
	 */
	public Integer getId() {return id;}

	/**
	 * @return name, to get the name of the animal.
	 */
	public String getName() {return name;}

	/**
	 * @return legs, to get the legs of the animal.
	 */
	public int getLegs() {return legs;}

	/**
	 * @return food, to get the food the animal eats.
	 */
	public String getFood() {return food;}

	/**
	 * @param food, to set the food the animal eats.
	 */
	public void setFood(String food) {this.food = food;}

}
