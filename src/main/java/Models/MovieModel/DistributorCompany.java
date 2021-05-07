package Models.MovieModel;

import Models.MovieModel.Movie;

import java.time.LocalDate;
import java.util.LinkedList;

public class DistributorCompany {

    private String distributionCompanyName;
    private LocalDate distributorCompanyEstablishmentDate;
    private long revenue;
    private long netIncome;
    private LinkedList<Movie> distributedMovies;


}
