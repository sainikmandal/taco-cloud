package com.sainik.tacocloud.repository;

import com.sainik.tacocloud.models.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
