public class GrayCodeToDecimal {
    public static int grayToDecimal(String n) {
        int binary = Integer.parseInt(n, 2);
        int decimal = binary ^ (binary >> 1);
        return decimal;
    }

    public static void main(String[] args) {
        String grayCode = "1010";
        int decimal = grayToDecimal(grayCode);
        System.out.println(decimal); // Output: 5
    }
}
