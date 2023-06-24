package ru.netology.stats.Domain;

public class Movie {
    private int id;
    private String name;
    private String imageUrl;
    private String genre;


    public Movie(int id, String name, String imageUrl, String genre) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.genre = genre;
    }

}
