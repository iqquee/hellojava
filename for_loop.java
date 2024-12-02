public class for_loop {
    public static void main(String[] args) {
        int num = 7;
        for (int i = 1; i <= num; i++) {
            String day = "";
            day = switch (i) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid day";
            };
    
            System.out.printf("Day %d: %s\n", i, day);
            // every day of the week have 24 hrs in each day. As such, log the hours in each day
            for (int j = 1;j <= 24; j++) {
                System.out.printf("Time is %d O'clock\n", j);
            }
        }
    }
}
