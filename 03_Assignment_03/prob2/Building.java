package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    public double maintanceCost = 0 ;
    List<Apartment> apartments = new ArrayList<Apartment>();

    public Building(double maintanceCost, double rentOfFirstApartment) {
        this.maintanceCost = maintanceCost;
        apartments.add(new Apartment(rentOfFirstApartment));


    }

    public void addApartment(int rent) {
        Apartment apartment = new Apartment(rent);
        apartments.add(apartment);
    }
    public double getTotalBuildingProfit(){
        double sum = 0 ;
        for(Apartment apartment : apartments){
            double apartProfit = apartment.getRent() - this.maintanceCost;
            sum += apartProfit;
        }
        return sum;
    }
}
