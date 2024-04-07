package com.lazyvic.tacos.data;

import org.springframework.data.repository.CrudRepository;

import com.lazyvic.tacos.Ingredient;

public interface IngredientRepository 
         extends CrudRepository<Ingredient, String> {
  
}
