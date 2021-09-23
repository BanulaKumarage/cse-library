package it.uom.cse;

import java.util.Arrays;


public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }

    public static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }return n*factorial(n-1);
    }


    public static int sumOfPrimes(int n) {
        int cnt = 0;
        int sum = 0;
        boolean flag;
        for (int i = 2; ; ++i) {
            flag = true;
            for (int j = 2; j <= i / 2; ++j) {
                if (i %j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sum += i;
                cnt++;
                if(cnt > n) break;
            }
        }
        return sum;
    }

}
