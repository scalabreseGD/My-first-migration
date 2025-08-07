// Program name: IFEVAL
// Original author: Dave Nicolette
//
// Demonstrates:
//
// The Java if/else statement and switch statement.
//
// This program performs various comparisons using if/else
// statements and switch statements. It does not emit any
// output. The source code is meant as a reference/guide.
public class IFEVAL {

    public static void main(String[] args) {
        // WORKING-STORAGE SECTION
        String resultOfCompare;
        String alpha1;
        String alpha2;
        int numeric1;
        // In COBOL, NUMERIC-2-X is a group that contains NUMERIC-2.
        // This is often used to check if a numeric field actually contains numeric data.
        // In Java, we can use a String to hold the value and then parse it.
        String numeric2X;
        long numeric2;

        // Example 1: IF statement, 2 alphanumeric items.
        alpha1 = "cucumber";
        alpha2 = "radish";

        // Compare two alphanumeric items, conventional style
        if (alpha1.equals(alpha2)) {
            resultOfCompare = "equal";
        }

        if (!alpha1.equals(alpha2)) {
            resultOfCompare = "different";
        }

        if (alpha1.equals(alpha2)) {
            resultOfCompare = "equal";
        } else {
            resultOfCompare = "different";
        }

        // Compare two alphanumeric items, traditional style
        if (alpha1.equals(alpha2)) {
            resultOfCompare = "equal";
        }

        if (alpha1.equals(alpha2)) {
            resultOfCompare = "equal";
        } else {
            resultOfCompare = "different";
        }

        // Compare two alphanumeric items, modern style
        if (alpha1.equals(alpha2)) {
            resultOfCompare = "equal";
        }

        // Example 2: IF statement, alphanumeric field vs literal
        if (alpha1.equals("foobar")) {
            resultOfCompare = "equal";
        } else {
            resultOfCompare = "different";
        }

        // Example 3: Verify a numeric item contains numeric data
        // (This is to avoid a NumberFormatException in Java)
        numeric2X = "garbage";
        try {
            numeric2 = Long.parseLong(numeric2X);
            numeric2 = numeric2 + 1;
        } catch (NumberFormatException e) {
            numeric2 = 1;
        }

        // Example 4: Verify a numeric item is greater than zero
        // (This is to avoid divide-by-zero exceptions)
        numeric1 = 0;
        numeric2 = 100;
        if (numeric1 > 0) {
            numeric2 = numeric2 / numeric1;
        } else {
            numeric2 = numeric2 - 1;
        }

        // Example 5: IF statement, two numeric fields
        numeric1 = 7;
        numeric2 = 36;
        if (numeric1 > numeric2) {
            resultOfCompare = "numeric-1";
        } else {
            resultOfCompare = "numeric-2";
        }

        // Example 6: EVALUATE statement
        numeric1 = 8;
        numeric2 = 13;

        if (numeric1 > numeric2) {
            resultOfCompare = "numeric-1";
        } else if (numeric1 < numeric2) {
            resultOfCompare = "numeric-2";
        } else {
            resultOfCompare = "equal";
        }

        // Example 6: EVALUATE statement, two conditions
        numeric1 = 8;
        numeric2 = 13;
        alpha1 = "THX-1138";
        alpha2 = "Terminator";

        if (numeric1 > numeric2 && alpha1.substring(0, 3).equals("THX")) {
            resultOfCompare = "THX and numeric-1";
        } else if (numeric1 < numeric2 && alpha1.substring(0, 3).equals("THX")) {
            resultOfCompare = "THX and numeric-2";
        } else if (numeric1 == numeric1 && alpha2.equals("Terminator")) {
            resultOfCompare = "Terminator and equal numbers";
        } else {
            resultOfCompare = "undefined";
        }
    }
}
