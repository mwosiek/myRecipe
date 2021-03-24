package io.github.mwosiek.repositories;
import io.github.mwosiek.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SqlRecipeRepository extends RecipeRepository, JpaRepository<Recipe,Integer> {
}

//klasa, która służy do komunikacji z bazą danych.

/*@RepositoryRestResource - tutaj mówimy springowi-to jest repozytorium,
tutaj są metody z których ty masz korzystac.*/
