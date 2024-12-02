public class class_object {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 3;

        Calculator calculator = new Calculator();
        int result = calculator.add(num1,   num2);

        System.out.println("Addition: " + result);
    }
}

class Calculator {
    public int add(int val1, int val2) {
        return val1 + val2;
    }
} 
