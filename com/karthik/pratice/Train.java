package com.karthik.pratice;

import java.util.Comparator;

public class Train implements Comparable<Train>, Comparator<Train> {

    private String trainName;
    private String trainType;
    private int trainNumber;
    private int seatCapacity;

    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainName='" + trainName + '\'' +
                ", trainType='" + trainType + '\'' +
                ", trainNumber=" + trainNumber +
                ", seatCapacity=" + seatCapacity +
                '}';
    }

    public Train(String trainName, String trainType, int trainNumber, int seatCapacity) {
        this.trainName = trainName;
        this.trainType = trainType;
        this.trainNumber = trainNumber;
        this.seatCapacity = seatCapacity;
    }



    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    @Override
    public int compareTo(Train o) {
        return trainNumber - o.getTrainNumber();
    }


    @Override
    public int compare(Train o1, Train o2) {
        return o1.getTrainNumber() - o2.getTrainNumber();
    }
}
