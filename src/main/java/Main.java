public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

// 5 = 101; 8 = 1000

        System.out.println(bins.sum("101", "1000") + " - это 13 в двоичной системе счисления");
//при сложении получим 13 = 1101

        System.out.println(bins.mult("101", "1000") + " - это 40 в двоичной системе счисления");
//при умножении получим 40 = 101000
    }
}
