
import model.Cast;
import model.Director;
import model.Movie;
import service.impl.FindAbleImpl;
import service.impl.SortAbleImpl;

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static SortAbleImpl sort = new SortAbleImpl();
    public static FindAbleImpl find = new FindAbleImpl();
    public static void main(String[] args) {
        Movie movie1 = new Movie("Black Panther",2022,"Action, Adventure, Fantasy",
                new Director("Ryan","Coogler"),
                List.of(new Cast("Letitia Wright","Shuri"),
                        new Cast("Angela Bassett","Ramonda"),
                        new Cast("Winston Duke","M'Baku")));

        Movie movie2 = new Movie("Avatar",2022,"Sci-Fi, Adventure, Action, Fantasy",
                new Director("James","Cameron"),
                List.of(new Cast("Sam Worthington","Jake Sully"),
                        new Cast("Zoe Saldana","Neytiri"),
                        new Cast("Stephen Lang","Miles Quaritch")));

        Movie movie3 = new Movie("Dracula",2014,"Action, Drama, Fantasy, Horror",
                new Director("Gary","Shore"),
                List.of(new Cast("Luke Evans","Vlad"),
                        new Cast("Sarah Gadon","Mirena"),
                        new Cast("Charles Dance","Master Vampire")));

        Movie movie4 = new Movie("Interstellar",2014,"Adventure, Drama, Sci-Fi",
                new Director("Christofer","Nolan"),
                List.of(new Cast("Matthew McConauqhey","Cooper"),
                        new Cast("Anna Hathaway","Brand"),
                        new Cast("Jessica Chastain","Murph")));

        Movie movie5 = new Movie("Who Am I",2014,"Crime, Drama, Mystery, Sci-Fi, Thriller",
                new Director("Baran bo","Odar"),
                List.of(new Cast("Tom Schilling","Benjamin"),
                        new Cast("Wotan Wilke Möhring","Stephan"),
                        new Cast("Elyas M'Barek","Max")));

        Movie movie6 = new Movie("Inception",2010,"Action, Adventure, Sci-Fi, Thriller",
                new Director("Christofer","Nolan"),
                List.of(new Cast("Leonardo DiCaprio","Cobb"),
                        new Cast("Ellen Page","Ariadne"),
                        new Cast("Tom Hardy","Eames")));


        List<Movie> movies = new ArrayList<>(List.of(movie1,movie2,movie3,movie4,movie5,movie6));
        commands(movies);


    }
    public static void commands(List<Movie>movies) {
        try {
            while (true) {
                System.out.println("""
                        \n-----------Netflix-----------
                        1 - Create Date Base,
                        2 - Show all movies,
                        3 - Find movie by name,
                        4 - Find movie by actor,
                        5 - Find movie by year,
                        6 - Find movie by director,
                        7 - Find movie by genre,
                        8 - Find movie by role,
                        9 - Sort movie by name,
                        10 - Sort movie by year,
                        11 - Sort movie by director;
                        -----------------------------
                        """);
                int number = scanner.nextInt();
                switch (number) {
                    case 1 -> System.out.println(find.createDateBase(movies));
                    case 2 -> System.out.println(find.getAllMovies());
                    case 3 -> find.findMovieByName();
                    case 4 -> find.findMovieByActorName();
                    case 5 -> find.findMovieByYear();
                    case 6 -> find.findMovieByDirector();
                    case 7 -> find.findMovieByDescription();
                    case 8 -> find.findMovieByRole();
                    case 9 -> sort.sortByMovieName(find.getAllMovies());
                    case 10 -> sort.sortByYear(find.getAllMovies());
                    case 11 -> sort.sortByDirector(find.getAllMovies());
                    default -> System.out.println("No such category!");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect number!");
        }
    }
}