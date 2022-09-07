public class Main {
    public static void main(String[] args) {
        // float myMinFloatValue = Float.MIN_VALUE;
        // float myMaxFloatValue = Float.MAX_VALUE;
        // System.out.println(myMinFloatValue);
        // System.out.println(myMaxFloatValue);

        //double enterPound = 200d;
        //double Kg = enterPound * 0.45359237d ;
        //System.out.println(Kg);

        //double format = 3_000_987.5_567_324d;
        //System.out.println(format);
        // note: when precise calculations are performed we use BigDecimal

        //char myChar = 'A';
        //65535 charactes in unicode
        //char UnicodeChar = '\u0088';
        //System.out.println(UnicodeChar);

        //boolean myTrue = true;
        // use 'is' to name the variable
        //boolean isCustomer = false;

        // String is not a primitive data type. It is a class and have properties and functions
        //String myString = "Ashu";
        //System.out.println(myString);
//        String numberString = "250.20";
//        String secondNumber = "22.80";
//        System.out.println(numberString+secondNumber);
//
//        int thirdNumber = 10;
//        System.out.println(secondNumber+thirdNumber);

        //String in java is immutable we cannot change the string
        //StringBuffer is used instead

        //OPERATORS
        //Operands : describe any object that is manipulated by an operator

        int result = 1+2; //3
        System.out.println(result);
        result = 5*10;
        System.out.println(result);
        result = 10/2;
        System.out.println(result);
        result = 15%3;
        System.out.println(result);

        //Shortcuts using operators
        //result = result +1;
        result++;
        System.out.println(result);
        // result = result + 2;
        result+=2;
        System.out.println(result);
        //result*= 10; result /= 10;

    }
}