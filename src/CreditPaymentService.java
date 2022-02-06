public class CreditPaymentService {
    public double calculate(double amount, double months, double percent) {

        double percentMonth = percent / 12 / 100;
        double a = 1 + percentMonth;
        double b = months;
        double c = Math.pow(a, b);
        double d = percentMonth * c;
        double f = c - 1;
        double coefficient = d / f;
        int monthlyPayment = (int) (coefficient * amount);

        return monthlyPayment;
    }
}
