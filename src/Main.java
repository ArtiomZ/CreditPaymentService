public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double paymentMonth = service.calculate(1_000_000, 12, 9.99);
        System.out.println("Ежемесячный платёж: " + paymentMonth);

        double paymentMonth2 = service.calculate(1_000_000, 24, 9.99);
        System.out.println("Ежемесячный платёж: " + paymentMonth2);

        double paymentMonth3 = service.calculate(1_000_000, 36, 9.99);
        System.out.println("Ежемесячный платёж: " + paymentMonth3);
    }
}
