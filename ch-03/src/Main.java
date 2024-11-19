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