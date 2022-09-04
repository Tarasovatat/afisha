package ru.netology.afisha.movies;

public class Poster {

    private String[] movies = new String[0];
    private int limit;

    public Poster() {
        limit = 10;
    }

    public Poster(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] newMovies = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            newMovies[i] = movies[i];
        }
        newMovies[newMovies.length - 1] = movie;
        movies = newMovies;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }

        String[] newMovies = new String[resultLength];

        for (int i = 0; i < newMovies.length; i++) {
            newMovies[i] = movies[movies.length - 1 - i];
        }
        return newMovies;
    }

}