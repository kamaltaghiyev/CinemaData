package Models.MovieModel;

import Models.MovieModel.SavedData.Genre;
import Models.MovieModel.SavedData.Language;
import Models.MovieModel.SavedData.MovieMPAA;
import Models.MovieModel.SavedData.Seance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie {
    public List<Ticket> tickets;
    private double imdbRating;
    private long movieID;
    private String title;
    private LocalDate releaseDate;
    private Date duration;
    private Genre genre;
    private MovieMPAA movieMPAA;
    private Language language;
    private Seance seance;
    private ArrayList<Actor> starredActors;
    private ArrayList<Actor> actors;
    private DistributorCompany distributorCompany;
    private ProducerCompany producerCompany;
    private MovieDirector movieDirector;
    private boolean hasBreak;
    private boolean isRemake;


}
