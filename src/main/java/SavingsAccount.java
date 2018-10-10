public class SavingsAccount {
    //the interest rate
    public static double annualInterestRate;

    private double savingsBalance;

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double result = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += result;
    }

    public static void modifyInterestRate(double newValue){
        annualInterestRate = newValue;
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("case1");
        System.out.println("saver1 "+ saver1.getSavingsBalance());
        System.out.println("saver2 "+ saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("case2");
        System.out.println("saver1 "+ saver1.getSavingsBalance());
        System.out.println("saver2 "+ saver2.getSavingsBalance());
    }
}
