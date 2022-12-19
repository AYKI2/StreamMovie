package service.impl;

import model.Movie;
import service.SortAble;

import java.util.Comparator;
import java.util.List;

public class SortAbleImpl implements SortAble {
    @Override
    public void sortByMovieName(List<Movie> movies) {
        movies.stream().sorted(Comparator.comparing(Movie::getName)).forEach(System.out::println);
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        movies.stream().sorted(Comparator.comparing(Movie::getYear)).forEach(System.out::println);
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.stream().sorted(Comparator.comparing(x->x.getDirector().getName())).forEach(System.out::println);
    }
}
