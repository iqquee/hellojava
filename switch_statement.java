public class switch_statement {
    public static void main(String[] args){
        String day = "Saturday";
        String alarmTime = "";

        // old fashioned switch statement which required the addion of a break at the end of the cases
        switch (day){
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // if you wish to create a switch statement without using the break after each case
        switch (day){
            case "Monday" -> System.out.println("Today is Monday");
            case "Tuesday" -> System.out.println("Today is Tuesday");
            case "Wednesday" -> System.out.println("Today is Wednesday");
            case "Thursday" -> System.out.println("Today is Thursday");
            case "Friday" -> System.out.println("Today is Friday");
            case "Saturday" -> System.out.println("Today is Saturday");
            case "Sunday" -> System.out.println("Today is Sunday");
            default -> System.out.println("Invalid day");
        }

        // incase you want to return a value from your switch statement
        switch (day){
            case "Sunday" -> alarmTime = "7am";
            case "Saturday" -> alarmTime = "10am";
            default -> alarmTime = "9am";
        }

        System.out.printf("Alarm time: %s\n", alarmTime);

        // this is another way of retuning a value from a switch statement
        alarmTime =  switch (day) {
            case "Sunday" -> "7am";
            case "Saturday" ->  "10am";
            default -> "9am";
        };

        System.out.printf("Alarm time: %s\n", alarmTime);
    }
}
