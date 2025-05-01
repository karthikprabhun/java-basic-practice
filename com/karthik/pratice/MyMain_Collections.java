package com.karthik.pratice;

import java.util.*;

public class MyMain_Collections {
    public static void main(String[] args) {

        System.out.println("Demo program to practice Java collections");
        System.out.println("Collections abstraction - Iterable,Collection,List,Queue, Set , MAP(Although part of collection framework , doesn't implement collection interface");

        List<Train> trainList = new ArrayList<Train>();
        trainList.add(new Train("abc", "express", 11121, 1400));
        trainList.add(new Train("mowade", " Not express", 10022, 1200));
        trainList.add(new Train("loewmd", "Not express", 11123, 3000));
        trainList.add(new Train("mpanhele", "express", 11104, 899));

        for (Train train : trainList) {
            System.out.println(train);
        }

        System.out.println("Calculate aggregated seats from all the trains "
                + trainList.stream().mapToInt(Train::getSeatCapacity).sum());
        System.out.println("Total seats only for express train "
                + trainList.stream().filter(train -> train.getTrainType().equals("express")).mapToInt(Train::getSeatCapacity).sum());

        System.out.println("Iterator demo");

        Iterator<Train> trainIterator = trainList.iterator();
        while (trainIterator.hasNext()) {
            Train train = trainIterator.next();
            if (train.getTrainType().equals("express")) {
                System.out.println(train.getTrainName());
            }
        }
        System.out.println("Let's explore functions in Collection interface");
        Collections.sort(trainList);
        trainList.forEach(System.out::println);

        System.out.println("Linked list Example");

        List<Train> trainsLinkedList = new LinkedList<>();
        trainsLinkedList.add(new Train("LLWSA", "express", 11134, 1400));
        trainsLinkedList.add(new Train("LLmowade", " Not express", 10032, 1200));
        trainsLinkedList.add(new Train("LLloewmd", "Not express", 11133, 3000));
        //adding duplicate
        trainsLinkedList.add(new Train("LLloewmd", "Not express", 11133, 3000));
        trainsLinkedList.add(new Train("LLloewmd", "Not express", 11133, 3000));

        System.out.println("display only express trains");
        trainsLinkedList.stream().filter(train -> train.getTrainType().equals("express")).forEach(System.out::println);

        System.out.println("Set collection demo - linkedlistarraylist to hashset ");
        Set<Train> trainSet = new HashSet<>();
        trainSet.addAll(trainsLinkedList);
        trainSet.forEach(System.out::println);

        Set<String> names = new HashSet<>();
        names.add("karthik");
        // same values are added mutliple time but set didnt accept the duplicate values.
        names.add("mowade"); names.add("mowade"); names.add("mowade"); names.add("mowade");
        names.add("loewmd");
        names.forEach(System.out::println);

    }
}
