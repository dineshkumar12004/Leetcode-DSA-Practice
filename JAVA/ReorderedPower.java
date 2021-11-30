package JAVA;

import java.util.Arrays;

class ReorderedPower {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = x + y * i;
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public boolean reorderedPowerOf2(int N) {
        int[] countN = count(N);

        int num = 1;

        for (int i = 0; i < 31; i++) {
            if (Arrays.equals(countN, count(num))) {
                return true;
            }
            num = num << 1;
        }

        return false;
    }

    int[] count(int N) {
        int[] arr = new int[10];
        while (N > 0) {
            arr[N % 10]++;
            N /= 10;
        }
        return arr;
    }

}