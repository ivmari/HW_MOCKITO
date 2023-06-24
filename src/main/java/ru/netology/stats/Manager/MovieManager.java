package ru.netology.stats.Manager;

import ru.netology.stats.Domain.Movie;

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int defaultMovieLength = 10;


    public MovieManager() {

    }

    public MovieManager(int customMovieLength) {
        if (customMovieLength > 0) {
            defaultMovieLength = customMovieLength;
        }

    }

    public void addMovie(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastMovie = tmp.length - 1;
        tmp[lastMovie] = movie;
        movies = tmp;

    }

    public Movie[] getLastAdd() {
        int length;

        if (movies.length < defaultMovieLength) {
            length = movies.length;
        } else {
            length = defaultMovieLength;
        }
        Movie[] result = new Movie[length];

        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;

    }
}


