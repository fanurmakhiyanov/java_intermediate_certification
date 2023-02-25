package org.example.view;

import org.example.model.Toy;

import java.util.List;

public class ToyViewer {

    public void showToyBox(List<Toy> toyList) {

        System.out.println("Игрушки в коробке");

        printWhatInBox(toyList);

    }

    public void showPrizeToy(Toy toy) {
        System.out.printf("Вы выиграли игрушку - это %s%n", toy.getSummary());
        System.out.println("---------------------");}

    public void showRemainingToys(List<Toy> toyList) {

        if (toyList.size() > 0){
            System.out.println("Оставшиеся игрушки в коробке");

        }else System.out.println("В коробке нет игрушек. Жеребьевка окончена");

        printWhatInBox(toyList);



    }

    public void printWhatInBox(List<Toy> toyList) {


        toyList.forEach(System.out::println);
        System.out.println("---------------------");
    }
}