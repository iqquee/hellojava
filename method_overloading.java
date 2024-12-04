public class method_overloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 3, 5);
        System.out.printf("Addition: %d\n", sum);
    }
}

class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }
}