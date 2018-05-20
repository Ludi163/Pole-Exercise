package com.ludi.maths;

public class Main {

    //todo change levels if u want to know another amount of combination for it.
    static int levels = 10;
    //===========================================================================

    public static void main(String[] args) {

        for (int i = 0; i < levels +1; i++) {
            long combinations = combination(i);
            System.out.println("Amount of the combination for " + i + " level(s) pole equals: " + combinations);
        }
    }

    static int combination(int levels) {
        if (levels == 0) {
            return 0;
        }
        int maxLongEl = levels / 2; //max amount of long elements -> n level pole.
        int totalResult = 0;
        int actLongEl; // actual amount of Long elements

        for (actLongEl = 0; actLongEl <= maxLongEl; actLongEl++) {
            long subResult = factorial(levels - actLongEl) / (factorial(actLongEl) * factorial((levels - actLongEl) - actLongEl));
            totalResult += subResult;
        }

        return totalResult;
    }

    static long factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is the product of all POSSITIVE INTEGERS only!!!");
            return -1;
        }

        long fractorialResult = 1;

        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                fractorialResult *= i;
            }
            return fractorialResult;
        }
    }
}
