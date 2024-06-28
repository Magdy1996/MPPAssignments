package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandLord {

    List<Building> buildings = new ArrayList<>();
    public LandLord() {

    }

    public void addBuilding(int i, int j) {
        buildings.add(new Building(i, j));
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public double calculateTotal() {
        double total = 0;
        for (Building building : buildings) {
            total += building.getTotalBuildingProfit();
        }
        return total;
    }
}
