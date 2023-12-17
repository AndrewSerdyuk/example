public class Main_example {
    public static void main(String[] args) {
        int n = 05;
        int result = factorial(n);
        result(result);
    }

    public static int factorial(int num){
        if (num < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer");
        }

        return calculate(num);
    }

    public static int calculate(int num){
        int factorial = 1;
        for (int i = 2; i <= num; i++)
            factorial *=i;

        return factorial;
    }

    public static void result(int data){
        if (data < 0)
            System.out.println("Warning!!! Result is negative");

        System.out.println("Result is: " + data);
    }
}

