package Models.MovieModel;

import Models.BaseModel.Gender;

import java.util.LinkedList;

public class MovieDirector {

    private long directorID;
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private boolean hasOscar;
    private LinkedList<Movie> movies;


}
