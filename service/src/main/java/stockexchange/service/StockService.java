package stockexchange.service;

import stockexchange.domain.Stock;
import stockexchange.domain.StockCurrency;
import stockexchange.domain.StockPrice;
import stockexchange.domain.StockRepository;
import stockexchange.interfaces.ExternalStockInformationService;


public class StockService {

    private StockRepository stockRepository;
    private ExternalStockInformationService externalStockInformationService;

    public StockService() {
        this.stockRepository = new StockRepository();
        this.externalStockInformationService = new ExternalStockInformationService();
    }

    public Stock getStock(String stockId) {
        Stock requestedStock = stockRepository.getStockInformation(stockId);
        requestedStock.setStockPrice(
                new StockPrice(externalStockInformationService.getPriceInEuroForStock(stockId),
                        StockCurrency.EUR));

        return requestedStock;
    }
}
