public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000; // Сумма кредита
        double interestRate = 9.99; // Ежемесячная процентная ставка
        int quantityMonths = 36; // Количество месяцев кредитования
        int years = 3;
        int mpAmount = service.monthlyPayment(loanAmount, interestRate, quantityMonths, years);
        System.out.println("Сумма эжемесячного платежа по кредиту составляет " + mpAmount);
    }
}
