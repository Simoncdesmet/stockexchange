package stockexchange.api;

import stockexchange.domain.StockPrice;

 class StockDto {

    private String stockId;
    private String stockName;
    private StockPrice stockPrice;



    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public void setStockPrice(StockPrice stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getStockId() {
        return stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public StockPrice getStockPrice() {
        return stockPrice;
    }

     @Override
     public String toString() {
         return "Stock name = "+stockName+"\r\n"+
                 "Stock price = "+stockPrice;
     }
}
