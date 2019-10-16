package stockexchange.api;

import stockexchange.domain.Stock;
import stockexchange.service.StockService;

public class StockExchangeController {

    private StockService stockService;

    public StockExchangeController() {
        this.stockService = new StockService();
    }

    public StockDto getStock(String stockId) {
        Stock stock = stockService.getStock(stockId);
        return convertStockToStockDto(stock);
    }

    private StockDto convertStockToStockDto(Stock stock) {
        StockDto stockDto = new StockDto();
        stockDto.setStockId(stock.getId());
        stockDto.setStockName(stock.getName());
        stockDto.setStockPrice(stock.getStockPrice());
        return stockDto;
    }

}
