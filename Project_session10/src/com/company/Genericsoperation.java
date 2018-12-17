package com.company;

public class Genericsoperation <T extends Number>
{
        private T number1, number2;
        double sum,product,difference,divide;
        public void AddNumbers(T number1, T number2){
            this.number1 = number1;
            this.number2 = number2;
        }
        public double getSum(){
            sum = number1.doubleValue() + number2.doubleValue();
            return sum;
        }
        public void MultNumbers (T number1, T number2){
            this.number1 = number1;
            this.number2 = number2;
        }
        public double getProd (){
            product = number1.doubleValue() * number2.doubleValue();
            return product;
        }
        public void subtractNumbers (T number1, T number2){
            this.number1 = number1;
            this.number2 = number2;
        }
        public double getDifference(){
            if (number2.doubleValue() > number1.doubleValue()) {
                difference = number2.doubleValue() - number1.doubleValue();
                return difference;
            }
            else{
                difference = number1.doubleValue() - number2.doubleValue();
                return difference;
            }
        }
    public void DivideNumbers(T number1, T number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public double getDivide(){
        divide = number1.doubleValue() / number2.doubleValue();
        return divide;
    }
}
