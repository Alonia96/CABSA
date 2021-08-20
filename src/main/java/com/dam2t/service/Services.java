package com.dam2t.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dam2t.dao.AnimalDao;
import com.dam2t.dao.FoodDao;
import com.dam2t.model.Animal;
import com.dam2t.model.Food;

/**
 * @author Alba Martín Castellà
 * Service is where all the program logic is executed.
 */
@Service
public class Services {

	@Autowired
	private AnimalDao animalDao;
	@Autowired
	private FoodDao foodDao;

	/**
	 * @param food, to pass it the object 'food', and then make a save, 
	 * saving the information of the new food created.
	 */
	public void saveNewFood(Food food) {
		foodDao.save(food);
	}

	
	/**
	 * @param name, is the parameter that is passed to the function to be able 
	 * to pick up the animal you want to search by name. 
	 * @return animalTotalInfo, so that once the objects have been run through 
	 * and filtered by the name in question, it returns only the animal that has 
	 * been indicated. 
	 */
	public List<Animal> getAnimalByName(String name) {
		ArrayList<Food> food = (ArrayList<Food>) foodDao.findAll();
		ArrayList<Animal> animal = (ArrayList<Animal>) animalDao.findAll();
		ArrayList <Animal> animalTotalInfo = new ArrayList<>();

		for(Animal i: animal) {
			if (i.getName().equals(name)) {
				animalTotalInfo.add(i);
			}
		}

		for(Animal i: animalTotalInfo) {
			for(Food x: food) {
				if (i.getId() == x.getId()) {
					i.setFood(x.getName());
				} 
			} 

		}
		return animalTotalInfo;
	} 


	/**
	 * @param searchFood, to search for an animal by the food it consumes.
	 * @return foodForAnimal, to return the specific animal, once the object has been 
	 * traversed and filtered by the food indicated in the parameter.
	 */
	public List<Animal> getAnimalByFoodName(String searchFood) {
		List <Animal> animalTotalInfo = getAllAnimalsFood();
		ArrayList <Animal> foodForAnimal = new ArrayList<>();

		for(Animal i: animalTotalInfo) {
			if (i.getFood().equals(searchFood)) {
				foodForAnimal.add(i);
			}
		}
		return foodForAnimal;
	}

	
	/** 
	 * @return animalTotalInfo, so that it returns a complete list of all animals and 
	 * their corresponding foods; once both objects (Food and Animal) have been combined.
	 */
	
	public List<Animal> getAllAnimalsFood() {
		ArrayList<Food> food = (ArrayList<Food>) foodDao.findAll();
		ArrayList<Animal> animal = (ArrayList<Animal>) animalDao.findAll();
		ArrayList <Animal> animalTotalInfo = new ArrayList<>();

		for(Animal i: animal) {
			animalTotalInfo.add(new Animal(i.getId(),i.getName(),i.getLegs(),"none"));
		}

		for(Animal i: animalTotalInfo) {
			for(Food x: food) {
				if (i.getId() == x.getId()) {
					i.setFood(x.getName());
				} 
			} 
		}
		return animalTotalInfo;
	}  

}
