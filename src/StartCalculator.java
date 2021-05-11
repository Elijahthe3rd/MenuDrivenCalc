import java.util.Scanner;
import java.util.logging.Logger;

public class StartCalculator {

    Scanner input = new Scanner(System.in);
    String term="";

    private String calcResult = null;
    private double number;
    private double number2;
    private char operator;

    public StartCalculator() {
        starter();
    }

    private String starter() {
        System.out.println("Starting Calculator\n");

        try {

            StringBuilder dots = new StringBuilder();

            new Thread(() -> { // Lambda Expression
                for (int i = 1; i <= 5; i++) {
                    try {
                        Thread.sleep(500);

                        dots.append(".");
                        System.out.flush();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                for (int j = 1; j <= 5; j++) {

                    try {
                        if(j==1)
                        System.out.print("Loading"+dots+" ");
                        Thread.sleep(500);
                        System.out.print(dots);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("!!!Loaded!!! (*_*) -> :)");
                System.out.println("\nokay you are now good to go.");
                try {
                    Calculator calc=new Calculator();
                    do {
                        System.out.print("Please enter your First number:\n");
                        //assigning/ storing the double value scanned using scanner object to number
                        number = input.nextDouble();
                        System.out.print("Please enter Arithmetic Operator/sign:\n");
                        operator = input.next().charAt(0);

                        System.out.print("Please enter your Second number:\n");
                        number2 = input.nextDouble();

                        calcResult = calc.Calculate(number, operator, number2);

                        System.out.print(calcResult);

                        System.out.println("\n(N.B)To Exit/close the Program Enter X");
                        System.out.println("\nDo wish to continue with calculations? Y/N\n");

                        term = input.next();


                        if (term =="x") {
                            System.out.println("Good Bye.");
////                            break;
                        }
                    } while (!(term.equalsIgnoreCase("n")));

                }catch (ArithmeticException e){
                    e.printStackTrace();
                }

            }).start();

            new Thread().stop();
            Calculator calc = new Calculator();


        } catch (Exception e) {
            e.getMessage();
        }

        return calcResult;
    }
}

