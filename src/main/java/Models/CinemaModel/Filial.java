package Models.CinemaModel;

import java.util.List;

public class Filial {
    public String address;
    public boolean isInMall;
    public String longitude;
    public String latitude;
    public String phone;
    public String email;
    public double area;
    public String desc;
    public int screenCount;
    public List<Visitor> visitors;
    public List<FilialSupporter> filialSupporters;
    public int cinemaID;
    public List<Schedule> schedules;

}
