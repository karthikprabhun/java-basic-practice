package com.karthik.pratice;

import java.util.ArrayList;
import java.util.List;

public class Trains {
    private List<Train> trains;

    public void add(Train train) {
        this.trains.add(train);
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }
}
