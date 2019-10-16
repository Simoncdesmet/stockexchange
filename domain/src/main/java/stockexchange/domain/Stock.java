package stockexchange.domain;

public class Stock {

private String id;
private String name;
private StockPrice stockPrice;

    public Stock(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setStockPrice(StockPrice stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getName() {
        return name;
    }

    public StockPrice getStockPrice() {
        return stockPrice;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Stock name = "+getName()+"\r\n"+
                "Stock price = "+getStockPrice();
    }
}

