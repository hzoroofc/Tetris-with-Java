class BigIntegerConverter {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String number = scanner.nextLine();
        java.math.BigInteger bi1 = (java.math.BigInteger) getBigInteger(number);
        java.math.BigInteger bi2 = java.math.BigInteger.valueOf(200);
        java.math.BigInteger result = bi1.multiply(bi2);
        System.out.println(number + " multiplied by 200 is " + result);
    }

    /**
     * @param number string representing the number
     * @return BigInteger instance
     */
    public static Number getBigInteger(String number) {
        return new java.math.BigInteger(number);
    }
}
