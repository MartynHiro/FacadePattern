public class BinOps {
    public String sum(String a, String b) {
        int firstNumber = Integer.parseInt(a, 2);
        int secondNumber = Integer.parseInt(b, 2);

        int intResult = firstNumber + secondNumber;

        return Integer.toBinaryString(intResult);
    }

    public String mult(String a, String b) {
        int firstNumber = Integer.parseInt(a, 2);
        int secondNumber = Integer.parseInt(b, 2);

        int intResult = firstNumber * secondNumber;

        return Integer.toBinaryString(intResult);
    }
}