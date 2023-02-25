import org.example.controller.ToyController;
import org.example.model.Toy;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        ToyController toyController = new ToyController();
        List<Toy> toys = List.of(
                new Toy(1, "'Набор Lego'", 1, 1),
                new Toy(2, "'Самолет Mobicaro'", 1, 2),
                new Toy(3, "'Игрушка alilo Умный зайка'", 1, 3),
                new Toy(4, "'Игра настольная Hasbro Games'", 1, 4),
                new Toy(5, "'Кукла Enchantimals'", 1, 5)
        );

        toys.forEach(toyController::addToyInBox);
        toyController.showToyBox();
        for (int i = 0; i < toys.size(); i++) {
            toyController.play();

        }


    }
}