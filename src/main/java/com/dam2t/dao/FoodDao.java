package com.dam2t.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dam2t.model.Food;

/**
 * @author Alba Martín Castellà.
 * The DAO collects the information from the Food table database to make 
 * the necessary queries.
 */
public interface FoodDao extends JpaRepository<Food, Integer>{

}
