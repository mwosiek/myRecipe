package io.github.mwosiek.controller;

import io.github.mwosiek.model.Recipe;
import io.github.mwosiek.repositories.RecipeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//wiązanie klasy z istniejącym repozytorium
    @RestController
    class RecipeController {

        /* chcemy logger który z klasy taskcontrolller bedzie tworzył logi. czyli
        np. po odczytaniu wszystkich przepisow bedzie wiadomosc "wszystkie przepisy
        odczytane"*/
        private static final Logger logger = LoggerFactory.getLogger(RecipeController.class);

        //potrzebujemy tu repozytorium
        private final RecipeRepository repository;

        RecipeController(final RecipeRepository repository) {
            this.repository = repository;
        }

        //metoda bezprarametrowa, która woła sobie loggerem.
        //dostaniemy kolekcję/listę wszystkich tasków
        //spring zamieni javową listę na JSONa
        //każdy "get" zostanie zmapowany
        @GetMapping(value = "/recipes", params = {"!sort", "!page", "!size"})
        ResponseEntity<List<Recipe>> readAllRecipes() {
            logger.warn("Wyświetlane są wszystkie przepisy");
            return ResponseEntity.ok(repository.findAll());
        }

        //pagebale-mozna za jej pomoca stworzyc stronicowanie/pobrac numer/rozmiar strony
        @GetMapping("/recipes")
        ResponseEntity<List<Recipe>> readAllRecipes(Pageable page) {
            logger.info("Dostosowane stronicowanie");
            return ResponseEntity.ok(repository.findAll(page).getContent());
        }
    }
