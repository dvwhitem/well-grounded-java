package sealedexp;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        CurrencyPair currencyPair = new CurrencyPair("USD", "EUR");

        FXOrder marketOrder = new MarketOrder(
                1000,
                currencyPair,
                Side.BUY,
                LocalDateTime.now(),
                true
        );

        FXOrder limitOrder = new LimitOrder(
                500,
                currencyPair,
                Side.SELL,
                LocalDateTime.now(),
                true,
                2.12,
                5000
        );

        System.out.println(marketOrder);
        System.out.println(limitOrder);
    }
}


