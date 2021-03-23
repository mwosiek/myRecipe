package io.github.mwosiek.model;

import javax.persistence.*;

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

        //nazwa przepisu
        private String title;

        //treść przepisu
        private String content;



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
