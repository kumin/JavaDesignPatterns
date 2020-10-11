package com.kumin.structural.facade;

public class BrainFacade {
    private static volatile BrainFacade instance;

    private OrderService orderService;
    private MovementService movementService;
    private ExecutionService executionService;
    private ShoppingService shoppingService;
    private CookService cookService;

    private BrainFacade() {
        orderService = new OrderService();
        movementService = new MovementService();
        executionService = new ExecutionService();
        cookService = new CookService();
        shoppingService = new ShoppingService();
    }

    public static BrainFacade getInstance() {
        if (instance == null) {
            synchronized (BrainFacade.class) {
                instance = new BrainFacade();
            }
        }
        return instance;
    }

    public void goToShoppingAndBuyClothes() {
        orderService.setOrders("buy for me a coat");
        movementService.setVehicle("plane");
        shoppingService.buyClothes("coat");
        executionService.executeOrder();
    }

    public void cookMeDinner() {
        orderService.setOrders("cook me a good meal");
        cookService.cookDinner("sausage, bacon, dumpling");
        executionService.executeOrder();
    }
}
