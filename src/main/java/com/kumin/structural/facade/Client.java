package com.kumin.structural.facade;

public class Client {
    public static void main(String[] args) {
        BrainFacade brainFacade = BrainFacade.getInstance();
        brainFacade.cookMeDinner();
        brainFacade.goToShoppingAndBuyClothes();
    }
}
