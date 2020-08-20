public class Bonus {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1900;
        if (refill > 1000) {
            balance = balance + refill + refill/100;
        } else {
            balance = balance + refill;
        }
        System.out.println(balance);
    }
}
