package JAVA;

class Max69Numbers {
    public static void main(String[] args) {
        int num = 9669;
        System.out.println(maximum69Number(num));
    }

    public static int maximum69Number(int num) {

        char[] numStr = String.valueOf(num).toCharArray();

        for (int i = 0; i < numStr.length; i++) {
            if (numStr[i] == '6') {
                numStr[i] = '9';
                break;
            }
        }

        return Integer.parseInt(String.valueOf(numStr));
    }

}