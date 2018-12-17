package com.company;

public class Main {

    public static void main(String[] args) {
        {
            Genericsoperation<Integer> integerNumbers = new Genericsoperation<>();

            try {

                integerNumbers.AddNumbers(100, 100);
                integerNumbers.subtractNumbers(100, 200);
                integerNumbers.MultNumbers(5, 6);
                integerNumbers.DivideNumbers(10, 2);

                System.out.println("The addition of two numbers is: " + integerNumbers.getSum());
                System.out.println("The difference between two numbers is: " + integerNumbers.getDifference());
                System.out.println("The product of two numbers is: " + integerNumbers.getProd());
                System.out.println("The division of two Number is" + integerNumbers.getDivide());

                Genericsoperation<Double> doubleNumber = new Genericsoperation<Double>();

                doubleNumber.AddNumbers(150.00, 250.00);
                doubleNumber.subtractNumbers(250.00, 150.00);
                doubleNumber.MultNumbers(10.5, 15.5);
                doubleNumber.DivideNumbers(10.0, 2.0);

                System.out.println("The sum of two numbers is: " + doubleNumber.getSum());
                System.out.println("The difference between two numbers is: " + doubleNumber.getDifference());
                System.out.println("The product of two numbers is: " + doubleNumber.getProd());
                System.out.println("The division of two number is" + doubleNumber.getDivide());

                Genericsoperation<Number> floatNumber = new Genericsoperation<>();

                floatNumber.AddNumbers(100.5, 150.235);
                floatNumber.subtractNumbers(99, 199.89);
                floatNumber.MultNumbers(5, 89.5);

                System.out.println("The sum of two numbers is: " + floatNumber.getSum());
                System.out.println("The difference between two numbers is: " + floatNumber.getDifference());
                System.out.println("The product of two numbers is: " + floatNumber.getProd());

            }
            catch(Exception E){
                System.out.println("Illegal Argument Exception");
            }
        }
    }

    }
