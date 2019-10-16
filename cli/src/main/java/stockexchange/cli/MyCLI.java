package stockexchange.cli;

import stockexchange.api.StockExchangeController;

public class MyCLI {

    public static void main(String[] args) {
        if (args.length == 1) {
            StockExchangeController stockExchangeController = new StockExchangeController();
            System.out.println(stockExchangeController.getStock(args[0]));
        } else {
            System.out.println("I can not process this order. Please specify exactly 1 stock ID.");
        }
    }
}
