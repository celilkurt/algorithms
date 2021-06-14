package main.leetCode.recursion;

import java.util.HashMap;

public class RecursionPow {

    HashMap<Integer, Double> powMap = new HashMap<>();


    public double myPow(double x, int n) {
        double pow;
        if (n == 0) {
            return 1;
        } else if (n > 0) {

            if (!powMap.containsKey(n)) {
                int halfN = (int)Math.floor((n-1)/2);

                if (n%2 == 0) {
                    pow = x*myPow(x, halfN)*myPow(x, halfN+1);
                } else {
                    pow = x*myPow(x, halfN)*myPow(x, halfN);
                }
                powMap.put(n, pow);
                return pow;
            } else {
                return powMap.get(n);
            }

        } else {
            if (!powMap.containsKey(n)) {
                int halfN = (int)Math.floor((n+1)/2);
                if (n%2 == 0) {
                    pow = (1/x)*myPow(x, halfN)*myPow(x, halfN-1);
                } else {
                    pow = (1/x)*myPow(x, halfN)*myPow(x, halfN);
                }
                powMap.put(n, pow);
                return pow;
            } else {
                return powMap.get(n);
            }

        }
    }


}
