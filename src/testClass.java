import java.util.Scanner;

public class testClass {

    public static void main(String[] args) {

        double number;
        double number2;
        char operator;

        System.out.println("Use any of the allowed operators from below:" +
                "\n\t1. % -> (mudolo/modulus)" +
                "\n\t2. / -> (Division)" +
                "\n\t3. * -> (Multiplication)" +
                "\n\t4. + -> (Addition)" +
                "\n\t5. - -> (Subtraction)" +
                "\n\t6. | -> (Logical-bitwise OR) " +
                "\n\t7. & -> (Logical-bitwise AND)\n");

        try{

            Scanner userInput = new Scanner(System.in);

            System.out.print("Please enter your First number:\n");
            //assigning/ storing the double value scanned using scanner object to number
            number = userInput.nextDouble();

            System.out.print("Please enter Arithmetic Operator/sign:\n");
            operator = userInput.next().charAt(0);

            System.out.print("Please enter your Second number:\n");
            number2 = userInput.nextDouble();

            String calcResult = new Calculator().Calculate(number,operator,number2);
            System.out.print(calcResult);
        }catch(ArithmeticException e){
            new ArithmeticException(e.getMessage());
        }

    }
}
