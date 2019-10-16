package stockexchange.domain;

import java.math.BigDecimal;

public class StockPrice {

    private BigDecimal price;
    private StockCurrency stockCurrency;


    public StockPrice(BigDecimal price, StockCurrency stockCurrency) {
        this.price = price;
        this.stockCurrency = stockCurrency;
    }

    @Override
    public String toString() {
        return ""+price+" "+stockCurrency;
    }
}
