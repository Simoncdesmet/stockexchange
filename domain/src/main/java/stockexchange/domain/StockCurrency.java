package stockexchange.domain;

import java.util.Currency;
import java.util.Locale;

public enum StockCurrency {
    EUR("euro", Currency.getInstance(Locale.FRANCE).getSymbol()),
    USD("dollar",Currency.getInstance(Locale.US).getSymbol()),
    GBP("pounds",Currency.getInstance(Locale.UK).getSymbol());

    private String label;
    private String symbol;

    StockCurrency(String label, String symbol) {
        this.label = label;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return label;
    }
}
