package sealedexp;

import java.time.LocalDateTime;

public record MarketOrder(
        int units,
        CurrencyPair pair,
        Side side,
        LocalDateTime sentAt,
        boolean allOrNothing
) implements FXOrder {}
