// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double numMonth = numYears * 12;
        double monthRatePer = annualRate / 12 / 100; // Percentage each month
        double monthPay; // Monthly pavement
        monthPay = ((monthRatePer * Math.pow( 1 + monthRatePer, numMonth))/(Math.pow(1 + monthRatePer, numMonth) - 1)) * principal;

        double totalPay = monthPay * numMonth; // Total pavement

        double totalInterest = totalPay - principal; // Total Interest

        double pennyMonth = Math.round(monthPay % 1 * 100); // Rounded pennies
        double pennyMonthPuy = (int)monthPay + pennyMonth / 100; // Integer + rounded pennies

        double pennyTotal = Math.round(totalPay % 1 * 100);
        double pennyTotalPay = (int)totalPay + pennyTotal / 100;

        double pennyInterest = Math.round(totalInterest % 1 * 100);
        double pennyTotalInterest = (int)totalInterest + pennyInterest / 100;


        System.out.println("Principal:         " + principal);
        System.out.println("Annual Rate:       " + annualRate + "%");
        System.out.println("Number of Years:   " + numYears);
        System.out.println("Monthly Pavement:  " + pennyMonthPuy);
        System.out.println("Total Payments:    " + pennyTotalPay);
        System.out.println("Total Interest:    " + pennyTotalInterest);
        System.out.println();
    }
}

