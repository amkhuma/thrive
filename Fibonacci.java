public class Fibonacci{
    public static String fibonacci(int maxNumber){
        String returnString = "";

        int num1 = 0;
        int num2 = 1;

        while (num1 <= maxNumber){

            if (num1 == 0)
                returnString = String.valueOf(num1);
            else
                returnString = String.join(", ", returnString , String.valueOf(num1));

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        return returnString;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(12));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(25));
        System.out.println(fibonacci(1000));

    }
}