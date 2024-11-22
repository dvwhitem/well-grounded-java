package sealedexp;

import java.time.LocalDateTime;

public record LimitOrder(
        int units,
        CurrencyPair pair,
        Side side,
        LocalDateTime sentAt,
        boolean allOrNothing,
        double price,
        int ttl
) implements FXOrder { }
