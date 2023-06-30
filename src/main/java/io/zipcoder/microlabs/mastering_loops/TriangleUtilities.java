package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i ++) {
            for (int j = 1; j <= i; j++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String getRow(int numberOfStars) {
        String row = "";
        for (int i = 1; i <= numberOfStars; i++) {
            row += "*";
        }

        return row;
    }

    public static String getSmallTriangle() {

        return getTriangle(4);
    }

    public static String getLargeTriangle() {

        return getTriangle(9);
    }
}
