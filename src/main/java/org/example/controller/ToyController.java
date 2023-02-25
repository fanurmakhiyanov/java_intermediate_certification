package org.example.controller;

import org.example.model.Toy;
import org.example.service.ToyService;
import org.example.view.ToyViewer;

import java.util.List;

public class ToyController {

    public final ToyService toyService;
    public final ToyViewer toyViewer;

    public ToyController() {
        this.toyViewer = new ToyViewer();
        this.toyService = new ToyService();
    }


    public void addToyInBox(Toy toy){
        this.toyService.addToy(toy);

    }

    public List<Toy> whatInBox(){
        return toyService.getToyList();
    }

    public Toy choose() {
        return toyService.choosePrizeToy();
    }

    public void showToyBox(){
        toyViewer.showToyBox(
                this.toyService.getToyList()
        );
    };

    public void play(){
        Toy toy = choose();
        toyViewer.showPrizeToy(toy);
        toyService.deleteToyFromList(toy);
        toyViewer.showRemainingToys(whatInBox());
        toyService.savePrizeToysToFile(toy);

    };


}
