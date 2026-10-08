
import java.text.DecimalFormat;
import java.util.Scanner;

public class MC01_BasicIO_10_Java {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Select Transaction:\n" +
                        "[1] Register Account Name\n" +
                        "[2] Deposit Amount\n" +
                        "[3] Withdraw Amount\n" +
                        "[4] Currency Exchange\n" +
                        "[5] Record Exchange Rates\n" +
                        "[6] Show Interest Amount"
        );
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.println("***");
        System.out.println("Choice = " + choice);
        System.out.println();
        System.out.println("Register Account Name");
        System.out.print("Account Name: ");
        String name = sc.nextLine();
        System.out.println();
        System.out.println("***");
        System.out.println("Account Name = " + name);
        System.out.println();

        double balance = 1000.00;
        String currency = "PHP";
        System.out.println("Deposit Amount");
        System.out.println("Account Name: " + name);
        System.out.println("Current Balance: " + df.format(balance));
        System.out.println("Currency: " + currency);
        System.out.println();

        System.out.print("Deposit Amount: ");
        double depositAmount  = sc.nextDouble();
        sc.nextLine();
        System.out.println();
        System.out.println("***");
        System.out.println("Account Name = " + name);
        System.out.println("Deposit Amount: " + df.format(depositAmount));
        System.out.println();

        System.out.println("Withdraw Amount");
        System.out.println("Account Name: " + name);
        System.out.println("Current Balance: " + df.format(balance));
        System.out.println("Currency: " + currency);
        System.out.println();
        System.out.print("Withdraw Amount: ");
        double withdrawAmount = sc.nextDouble();
        sc.nextLine();
        System.out.println();
        System.out.println("***");
        System.out.println("Account Name = " + name);
        System.out.println("Withdraw Amount: " + df.format(withdrawAmount));
        System.out.println();

        System.out.println("Record Exchange Rate");
        System.out.println();
        System.out.println(
                "[1] Philippine Peso (PHP)\n" +
                "[2] United States Dollar (USD)\n" +
                "[3] Japanese Yen (JPY)\n" +
                "[4] British Pound Sterling (GBP)\n" +
                "[5] Euro (EUR)\n" +
                "[6] Chinese Yuan Renminni (CNY)"
        );
        System.out.println();
        System.out.print("Select Foreign Currency: ");
        int input = sc.nextInt();
        sc.nextLine();
        System.out.print("Exchange Rate: ");
        double rate = sc.nextDouble();
        sc.nextLine();
        System.out.println("***");
        System.out.println("Select Foreign Currency = [" + input + "]");
        System.out.println("Exchange Rate = " + df.format(rate));
        System.out.println();



        System.out.println("Foreign Currency Exhange");
        System.out.print("Source Amount (PHP): ");
        double amount = sc.nextDouble();
        sc.nextLine();
        double[] exchangeRate = {1, 62, 0.40, 84, 72, 9};
        double php = amount / exchangeRate[0];
        double usd = amount / exchangeRate[1];
        double jpy = amount / exchangeRate[2];
        double gbp = amount / exchangeRate[3];
        double eur = amount / exchangeRate[4];
        double cny = amount / exchangeRate[5];
        System.out.println();
        System.out.println("Exchanged Currency");
        System.out.println(
                "[1] Philippine Peso (PHP) = " + df.format(php) + "\n" +
                        "[2] United States Dollar (USD) = " + df.format(usd) + "\n" +
                        "[3] Japanese Yen (JPY) = " + df.format(jpy) + "\n" +
                        "[4] British Pound Sterling (GBP) = " + df.format(gbp) + "\n" +
                        "[5] Euro (EUR) = " + df.format(eur) + "\n" +
                        "[6] Chinese Yuan Renminni (CNY) = " + df.format(cny) + "\n"
        );

        String sourceCurrency = "Philippine Peso (PHP)";
        System.out.println("***");
        System.out.println("Source Currency = " + sourceCurrency);
        System.out.println("Source Amount (PHP) = " + df.format(php));


    }
}
