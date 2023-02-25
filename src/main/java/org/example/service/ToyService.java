package org.example.service;

import org.example.model.Toy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyService {

    private final List<Toy> toyList;


    public ToyService() {
        this.toyList = new ArrayList<>();
    }

    public List<Toy> getToyList() {
        return toyList;
    }

    public void addToy(Toy toy){
        toyList.add(toy);
    }


    public Toy choosePrizeToy() {

        int totalRank = this.toyList.stream().mapToInt(Toy::getRank).sum();
        int randomNum = new Random().nextInt(totalRank);
        int sum = 0;
        for (Toy toy : this.toyList) {
            sum += toy.getRank();
            if (randomNum < sum) {
                toy.setAmount(toy.getAmount() - 1);
                return toy;
            }
        }
        return null;
    }

    public void deleteToyFromList(Toy toy){
        toyList.remove(toy);

    }

    public void savePrizeToysToFile( Toy toy) {

        String filepath = "org/example/toys.txt";
        writeToyInFile(filepath, toy);

    }

    public void writeToyInFile(String filepath, Toy toy) {

        String text = toy.toString();
        try {
            Files.write(Paths.get(filepath), text.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println("No Such File Exception");
        }

    }
}
