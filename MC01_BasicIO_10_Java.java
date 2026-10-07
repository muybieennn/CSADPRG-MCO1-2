static Scanner sc = new Scanner(System.in);

static class Account {
    String name;
    double balance;

    public Account(String name) {
        this.name = name;
        this.balance = 1000.00;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double balance) {
        this.balance -= balance;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }
}

static class AccountManager {
    static DecimalFormat df = new DecimalFormat("0.00");
    static ArrayList<Account> accounts = new ArrayList<>();
    static double[] exchangeRate = {1, 62, 0.40, 84, 72, 9};

    public AccountManager() {
    }

    public static void registerAccount() {
        IO.println("Register Account Name");
        IO.print("Account Name: ");
        String name = sc.nextLine();
        accounts.add(new Account(name));
        IO.println("***");
        IO.println("Account Name = " + name);
        IO.println();
    }

    public static void deposit() {
        if (accounts.isEmpty()) {
            IO.println("Account List is Empty!");
            return;
        }
        IO.println("Deposit Amount");
        IO.print("Account Name: ");
        String name = sc.nextLine();

        boolean found = false;
        for (Account a : accounts) {
            if (a.getName().equals(name)) {
                double balance = a.getBalance();
                found = true;
                IO.println("Current Balance: " + df.format(balance));
                IO.println("Currency: PHP");
                IO.print("Deposit Amount: ");
                double depositAmount = sc.nextDouble();
                sc.nextLine();
                a.deposit(depositAmount);
                IO.println("***");
                IO.println("Account Name = " + name);
                IO.println("Deposit Amount = " + df.format(depositAmount));
                IO.println();
                break;
            }
        }
        if (!found) {
            IO.println("Account not found!");
        }
    }

    public static void withdraw() {
        if (accounts.isEmpty()) {
            IO.println("Account List is Empty!");
            return;
        }
        IO.println("Withdraw Amount");
        IO.print("Account Name: ");
        String name = sc.nextLine();
        boolean found = false;

        for (Account a : accounts) {
            if (a.getName().equals(name)) {
                double balance = a.getBalance();
                found = true;
                IO.println("Current Balance: " + df.format(balance));
                IO.println("Currency: PHP");
                IO.print("Withdraw Amount: ");
                double withdrawAmount = sc.nextDouble();
                sc.nextLine();
                a.withdraw(withdrawAmount);
                IO.println("***");
                IO.println("Account Name = " + name);
                IO.println("Withdraw Amount = " + df.format(withdrawAmount));
                IO.println();
                break;
            }
        }
        if (!found) {
            IO.println("Account not found!");
        }

    }

    public static void currencyExchange() {
        IO.println("Foreign Currency Exchange");
        IO.print("Source Amount (PHP): ");
        double amount = sc.nextDouble();
        sc.nextLine();
        double php = amount / exchangeRate[0];
        double usd = amount / exchangeRate[1];
        double jpy = amount / exchangeRate[2];
        double gbp = amount / exchangeRate[3];
        double eur = amount / exchangeRate[4];
        double cny = amount / exchangeRate[5];
        IO.println(
                "[1] Philippine Peso (PHP) = " + df.format(php) + "\n" +
                        "[2] United States Dollar (USD) = " + df.format(usd) + "\n" +
                        "[3] Japanese Yen (JPY) = " + df.format(jpy) + "\n" +
                        "[4] British Pound Sterling (GBP) = " + df.format(gbp) + "\n" +
                        "[5] Euro (EUR) = " + df.format(eur) + "\n" +
                        "[6] Chinese Yuan Renminni (CNY) = " + df.format(cny) + "\n"
        );
        IO.println("***");
        IO.println("Source Currency = Philippine Peso (PHP)");
        IO.println("Source Amount (PHP): " + df.format(amount));
        IO.println();
    }

    public static void recordExchangeRates() {
        IO.println("Record Exchange Rate");
        IO.println();
        IO.println(
                "[1] Philippine Peso (PHP)\n" +
                        "[2] United States Dollar (USD)\n" +
                        "[3] Japanese Yen (JPY)\n" +
                        "[4] British Pound Sterling (GBP)\n" +
                        "[5] Euro (EUR)\n" +
                        "[6] Chinese Yuan Renminni (CNY)"
        );
        IO.print("Select Foreign Currency: ");
        int input = sc.nextInt();
        sc.nextLine();
        IO.println("Exchange Rate: " + df.format(exchangeRate[input - 1]));

        IO.println("***");
        IO.println("Source Foreign Currency " + "[" + input + "]");
        IO.println("Exchange Rate: " + df.format(exchangeRate[input - 1]));
        IO.println();
    }

    public static void showInterestAmount() {
        IO.println("Show Interest Amount");
    }
}

void main() {
    new AccountManager();
    while (true) {
        IO.println(
                "Select Transaction:\n" +
                        "[1] Register Account Name\n" +
                        "[2] Deposit Amount\n" +
                        "[3] Withdraw Amount\n" +
                        "[4] Currency Exchange\n" +
                        "[5] Record Exchange Rates\n" +
                        "[6] Show Interest Amount"

        );
        IO.print("Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        IO.println("***");
        IO.println("Choice = " + choice);
        IO.println();
        switch (choice) {
            case 1:
                AccountManager.registerAccount();
                break;
            case 2:
                AccountManager.deposit();
                break;
            case 3:
                AccountManager.withdraw();
                break;
            case 4:
                AccountManager.currencyExchange();
                break;
            case 5:
                AccountManager.recordExchangeRates();
                break;
            case 6:
                AccountManager.showInterestAmount();
                break;
        }
    }
}