package com.dam2t.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dam2t.model.Animal;


/**
 * @author Alba Mart�n Castell�
 * The DAO collects the information from the Animal table database to make 
 * the necessary queries.
 */
public interface AnimalDao extends JpaRepository<Animal, Integer>{

}
