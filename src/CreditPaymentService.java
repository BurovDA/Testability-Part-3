public class CreditPaymentService {
    public int monthlyPayment(int loanAmount, double interestRate, int loanPeriod) {

        int quantityMonths = loanPeriod * 12;
        double rate = (interestRate / 100 / quantityMonths) * loanPeriod;
        double x1 = rate * Math.pow(1 + rate, quantityMonths);
        double x2 = Math.pow(1 + rate, quantityMonths) - 1;
        double P = loanAmount * (x1 / x2);


        return (int) P;
    }
}







