package service;

import model.Movie;

import java.util.List;

public interface FindAble {
    String createDateBase(List<Movie>movies);
    List<Movie> getAllMovies();
    void findMovieByName();
    void findMovieByActorName();
    void findMovieByYear();
    void findMovieByDirector();
    void findMovieByDescription();
    void findMovieByRole();
}
