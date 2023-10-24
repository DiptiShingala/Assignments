package InheritanceAsssignment.Problem1;

import InheritanceAsssignment.Problem1.Adder;

public class Main {
    public static void main(String[] args){
        int num1 = 42;
        int num2 = 13;
        Adder adder = new Adder();
        System.out.println("My SuperClass is:Arithmetic");
        System.out.println(num1 + " " + num2 + " " + adder.add(num1, num2));
    }
}
