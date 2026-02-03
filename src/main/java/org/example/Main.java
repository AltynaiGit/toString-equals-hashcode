package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {
    static void main() {
        int[] num = new int[3];
        Random rnd = new Random();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            num[i] = rnd.nextInt(3);
            if (num[i] > max) {
                max = num[i];

            }
        }
        System.out.println("Random: " + Arrays.toString(num) + ". Max is " + max);
    }
}
