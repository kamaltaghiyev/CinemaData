package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Movie {

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
