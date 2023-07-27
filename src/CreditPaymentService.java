public class CreditPaymentService {
    public int monthlyPayment(int loanAmount, double interestRate, int quantityMonths, int years) {
        double rate = (interestRate / 100 / quantityMonths) * years;
        double x1 = rate * Math.pow(1 + rate, quantityMonths);
        double x2 = Math.pow(1 + rate, quantityMonths) - 1;
        double P = loanAmount * (x1 / x2);
        return (int) P;
    }
}
