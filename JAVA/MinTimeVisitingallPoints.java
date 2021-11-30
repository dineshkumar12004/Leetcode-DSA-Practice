package JAVA;

import java.util.Arrays;

class MinTimeVisitingallPoints {

    public static void main(String[] args) {
        int[][] points = { { 1, 1 }, { 3, 4 }, { -1, 0 } };
        System.out.println(points.toString());
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        if (points.length == 1)
            return 0;
        int result = 0;
        int index[] = points[0];
        for (int i = 1; i < points.length; i++) {
            result += Math.max(Math.abs(points[i][0] - index[0]), Math.abs(points[i][1] - index[1]));
            index = points[i];
        }
        return result;
    }

}