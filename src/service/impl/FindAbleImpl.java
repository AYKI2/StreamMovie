package service.impl;

import model.Movie;
import service.FindAble;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAbleImpl implements FindAble {
    private List<Movie> movieList = new ArrayList<>();

    @Override
    public String createDateBase(List<Movie> movies) {
        this.movieList = movies;
        return "Successfully created!";
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieList;
    }

    @Override
    public void findMovieByName() {
        System.out.print("Write movie name: ");
        String movie = new Scanner(System.in).nextLine();
        movieList.stream().filter(x->x.getName().equals(movie)).toList().forEach(System.out::println);
    }

    @Override
    public void findMovieByActorName() {
        System.out.print("Write actor name: ");
        String actor = new Scanner(System.in).nextLine();
        movieList.forEach(x->x.getCast().stream().filter(u->u.getActorFullName().contains(actor)).forEach(System.out::println));
    }

    @Override
    public void findMovieByYear() {
        System.out.print("Write movie year: ");
        int year = new Scanner(System.in).nextInt();
        movieList.stream().filter(x->x.getYear() == year).forEach(System.out::println);
    }

    @Override
    public void findMovieByDirector() {
        System.out.print("Write director name: ");
        String director = new Scanner(System.in).nextLine();
        movieList.stream().filter(x->x.getDirector().getName().equals(director)).forEach(System.out::println);
    }

    @Override
    public void findMovieByDescription() {
        System.out.print("Write genre: ");
        String genre = new Scanner(System.in).nextLine();
        movieList.stream().filter(x->x.getGenre().contains(genre)).forEach(System.out::println);
    }

    @Override
    public void findMovieByRole() {
        System.out.print("Write role: ");
        String role = new Scanner(System.in).nextLine();
        movieList.forEach(x->x.getCast().stream().filter(u->u.getRole().equals(role)).forEach(System.out::println));
    }
}
