package stockexchange.domain;

import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;


public class StockRepository {

    private Map<String,Stock> stocks;

    public StockRepository() {
        this.stocks = new ImmutableMap.Builder<String,Stock>()
            .put("APINC",new Stock("APINC", "Apple, inc."))
            .put("KBC",new Stock("KBC", "KBC"))
            .put("AMAZ",new Stock("AMAZ", "AMAZON."))
            .build();
    }

    public Stock getStockInformation(String stockId) {
        return stocks.get(stockId);
    }
}
