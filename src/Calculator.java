import CalculatoInterface.CalculatorInterface;

public class
Calculator implements CalculatorInterface {

    //Contructor
    public Calculator(){
    }

    public String Calculate(double number, char operator, double number2) {
        double result = 0.0;
        String output;
        //switch statement to perform mathematical operations based on the captured operator.
        label1:switch (operator) {
            //Arithmetic operations
            case '%':
                result = number % number2;
                output =("\nArithmetic-Operation:\n"+ number + " " + operator + " " + number2 + " = " + result);
                break;
            case '/':
                result = number / number2;
                output = ("\nArithmetic-Operation:\n"+number + " " + operator + " " + number2 + " = " + result);
                break;
            case '*':
                result = number * number2;
                output = ("\nArithmetic-Operation:\n"+number + " " + operator + " " + number2 + " = " + result);
                break;
            case '+':
                result = number + number2;
                output = ("\nArithmetic-Operation:\n"+number + " " + operator + " " + number2 + " = " + result);
                break;
            case '-':
                result = number - number2;
                output = ("\nArithmetic-Operation:\n"+number + " " + operator + " " + number2 + " = " + result);
                break;
            //<<End-Of-Arith-Ops>>

            // bitwise operators/operations.
             case '&':
                result = (int)number & (int)number2;
                output = ("\nBitwise-Operation: \n"+number + " " + operator + " " + number2 + " = " +  result);
                break;
            case '|':
                result = (int)number | (int)number2;
                output = ("\nBitwise-Operation: \n"+ number + " " + operator + " " + number2 + " = " + result);
                break;
            //<<End-Of-bitwise-Ops>>
            default:
                output = ("Provided an Invalid Arithmatic operator e.g: +, or -, or *, or %, or /");
                break label1;
        }
        return output ;
    }
}
