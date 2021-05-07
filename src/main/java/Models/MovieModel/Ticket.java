package Models.MovieModel;

import Models.MovieModel.SavedData.Seance;
import Models.BaseModel.TransactionType;

import java.util.Date;

public class Ticket {
    public double price;
    public double discountPrice;
    public long id;
    public Seance seance;
    public long roomId;
    public long seatingId;
    public long movieID;
    public Date sellDate;
    public TransactionType transactionType;
}
