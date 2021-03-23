package io.github.mwosiek.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//klasa, która służy do komunikacji z bazą danych.

/*@RepositoryRestResource - tutaj mówimy springowi-to jest repozytorium,
tutaj są metody z których ty masz korzystac.*/

@RepositoryRestResource
interface RecipeRepository extends JpaRepository<Recipe,Integer> {
}
