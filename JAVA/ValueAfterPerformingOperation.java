class ValueAfterPerformingOperation {
    public static void main(String[] args) {
        String[] operations = { "--X", "X++", "X++" };
        int result = finalValueAfterOperations(operations);
        System.out.println(result);

    }

    public static int finalValueAfterOperations(String[] operations) {
        int count = 0;

        for (String middle : operations) {
            if (middle.charAt(1) == '+') {
                count++;
            } // it is only necessary to check the middle character, as it covers any
              // situation (x++, ++x, --x, x--)
            else {
                count--;
            }
        }

        return count;
    }
}