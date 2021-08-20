package com.dam2t.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dam2t.model.Animal;
import com.dam2t.model.Food;
import com.dam2t.service.Services;
import java.util.List;


/**
 * @author Alba Martín Castellà
 * It serves to put the root of the url with 'requestmapping' and then according to the function 
 * we want it to perform and the action, with get or post, add words to the url.
 */
@RestController
@RequestMapping("food")
public class FoodController {

	@Autowired
	private Services services;

	@PostMapping("/saveNewFood")
	private void saveNewFood(@RequestBody Food food) {
		services.saveNewFood(food);
	}

	@GetMapping("/name/{name}")
	private List<Animal> findAnimalByFoodName(@PathVariable ("name") String searchFood) {
		return services.getAnimalByFoodName(searchFood);
	}

}
