package io.github.mwosiek.repositories;


import io.github.mwosiek.model.Recipe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.config.Task;

import java.util.List;
import java.util.Optional;

//tutaj tylko te metody, które nas interesują.

public interface RecipeRepository {

    //chcemy pobierać wszystkie recipes
    List<Recipe> findAll();

    //zwraca page od recipe
    Page<Recipe> findAll(Pageable page);

    //chcemy pobierać jeden konretny recipe
    Optional<Recipe> findById(Integer id);

    //recipe do zapisania
    Recipe save(Recipe entity);

}
