public class Main {
    public static void main(String[] args) {
        int monthNum = 12;

        String message = switch (monthNum) {
            case 1,2,12 -> "Winter";
            case 3,4,5 -> "Spring";
            case 6,7,8 -> "Summer";
            case 9,10,11 -> "Autumn";
            default -> {
                throw new IllegalArgumentException("Oops! Something wrong:)");
            }
        };

        System.out.println("Message: " + message);

        Months monthConst = Months.NOVEMBER;

        String month = switch (monthConst) {
            case JANUARY, FEBRUARY, DECEMBER -> "Winter";
            case MARCH, APRIL, MAY -> "Spring";
            case JUNE, JULY, AUGUST -> "Summer";
            case SEPTEMBER, OCTOBER, NOVEMBER -> "Autumn";
        };

        System.out.println("Month: " + month);

        FXOrder fxOrder = new FXOrder(0, 2.2, -1);
    }
}


record FXOrder(int units, double price, int ttl) {
    FXOrder {
        if(units < 1) {
            throw new IllegalArgumentException("FXOrder units must be positive");
        }
        if(ttl < 0) {
            throw new IllegalArgumentException("FXOrder TTL must be positive, or 0 for market orders");
        }
        if(price <= 0.0) {
            throw new IllegalArgumentException("FXOrder price must be positive");
        }
    }
}

enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}