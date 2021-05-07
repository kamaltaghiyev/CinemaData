package Models.CinemaModel;

import java.util.List;

public class Room {
    public List<Seating> seatings;
    public String name;
    public String supportedBy;
    public double area;
    public int countOfRows;
    public int countOfColumns;
    public int countOfSeatingPlaces;
    public boolean isPremium;
    public boolean isDolbyAtmos;
    public boolean isAvailable;
}
