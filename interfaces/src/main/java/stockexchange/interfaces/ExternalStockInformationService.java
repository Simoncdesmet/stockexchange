package stockexchange.interfaces;

import java.math.BigDecimal;
import java.util.Random;

public class ExternalStockInformationService {

    public BigDecimal getPriceInEuroForStock(String stockId) {
        Random r = new Random();
        return new BigDecimal(r.nextInt(100 - 10) + 10);
    }
}
