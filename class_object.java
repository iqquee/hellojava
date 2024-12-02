public class class_object {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.val1 = 5;
        calculator.val2 = 3;
        int result = calculator.add();

        System.out.println("Addition: " + result);
    }
}

class Calculator {
    int val1;
    int val2;

    public int add() {
        return val1 + val2;
    }
} 
