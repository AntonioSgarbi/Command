package tech.antoniosgarbi.main;

import tech.antoniosgarbi.Broker;
import tech.antoniosgarbi.BuyStock;
import tech.antoniosgarbi.SellStock;
import tech.antoniosgarbi.Stock;

public class Main {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock( abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
