package io.github.mwosiek.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

//klasa podstawowa

    @Entity
    @Table(name = "recipes")
    class Recipe {

        @Id
        /*GeneratedValue - java domyślnie przpisuje 0 dla typu prostego
         int, dlatego było niemożliwe generowanie innych niż 0 numerów
         id dla przepisów. GV bedzie generowac kolejne licznby.*/
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        //id przepisu
        private int id;

        /*@NotBlank - adnotacja, której można użyć do opisu walidacji.
        * Sama adnotacja nie wystarczy, trzeba jeszcze dodać walidację
        * w "MyRecipeApplication" */

        //nazwa przepisu
        @NotBlank(message = "Przepis musi mieć tytuł")
        private String title;

        //treść przepisu
        @NotBlank(message = "Przepis musi mieć opis")
        private String content;


        /*bezparametrowy konstruktor, dlatego ze hibernate mógłby mieć
        problemy po zmianie w repozytorium restresource na inne*/
        Recipe(){
        }


        //gettery i settery

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
