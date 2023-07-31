public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000; // Сумма кредита
        double interestRate = 9.99; // Ежемесячная процентная ставка
        int loanPeriod = 3; // Срок кредитования
        int mpAmount = service.monthlyPayment(loanAmount, interestRate, loanPeriod);
        System.out.println("Сумма ежемесячного платежа по кредиту составляет " + mpAmount);
    }
}
