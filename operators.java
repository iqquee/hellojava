public class operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Addition
        int sum = a + b;
        System.out.printf("Addutions: %d\n", sum);

        // Subtraction
        int sub = a - b;
        System.out.printf("Subtraction: %d\n", sub);

        // Division
        int div = a / b;
        System.out.printf("Division: %d\n", div);

        // Modulus
        int mod = a % b;
        System.out.printf("Modulus: %d\n",mod);

        // Post Increment
        a++;
        System.out.printf("Post Increment a: %d\n", a);

        // Pre Increment
        ++a;
        System.out.printf("Pre Increment a: %d\n", a);


        // create a function that takes a number as argument and check if it is devisible by 2 and return true else return false
        int devisibleBy2 = 4;
        boolean isDevisibleBy2 = isDevisibleBy2(devisibleBy2);
        System.out.printf("Is %d devisible by 2?: %b\n", devisibleBy2, isDevisibleBy2);
    }

    // private static method isDevisibleBy2 checks if a number is devisible by 2
    private static boolean isDevisibleBy2(int val) {
        return val % 2 == 0; 
    }
}
