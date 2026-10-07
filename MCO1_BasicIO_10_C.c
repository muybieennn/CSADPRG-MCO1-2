#include <stdio.h>

void main() {
    int choice;
    printf("Select Transaction:\n"
           "[1] Register Account Name\n"
           "[2] Deposit Amount\n"
           "[3] Withdraw Amount\n"
           "[4] Currency Exchange\n"
           "[5] Record Exchange Rates\n"
           "[6] Show Interest Amount\n");
    printf("\nChoice: ");
    scanf("%d",&choice);
    printf("***\n");
    printf("Choice = %d\n", choice);
    printf("\n");

    char name[20];
    printf("Register Account Name\n");
    printf("Account Name: ");
    scanf(" %[^\n]",&name);

    printf("***\n");
    printf("Account Name = %s\n", name);
    printf("\n");

    double balance = 1000.00;
    printf("Deposit Amount \n");
    printf("Account Name: %s\n",name);
    printf("Current Balance: %.2f\n", balance);
    printf("Currency: PHP\n\n");

    double amount;
    printf("Deposit Amount: ");
    scanf(" %lf",&amount);


    printf("***\n");
    printf("Account Name = %s\n",name);
    printf("Deposit Amount = %.2f\n", amount);
    printf("\n");

    printf("Withdraw Amount \n");
    printf("Account Name: %s\n",name);
    printf("Current Balance: %.2f\n", balance);
    printf("Currency: PHP\n\n");

    printf("Withdraw Amount: ");
    scanf(" %lf",&amount);
    printf("***\n");
    printf("Account Name = %s\n",name);
    printf("Withdraw Amount = %.2f\n", amount);
    printf("\n");


    printf("Record Exchange Rate\n\n");
    printf("[1] Philippine Peso (PHP)\n");
    printf("[2] United States Dollar (USD)\n");
    printf("[3] Japanese Yen (JPY)\n");
    printf("[4] British Pound Sterling (GBP)\n");
    printf("[5] Euro (EUR)\n");
    printf("[6] Chinese Yuan Renminni (CNY)\n\n");
    printf("Select Foreign Currency: ");
    scanf("%d",&choice);

    double exchange;
    printf("Exchange Rate: ");
    scanf("%lf",&exchange);

    printf("***\n");
    printf("Select Foreign Currency = [%d]\n",choice);
    printf("Exchange Rate = %.2f\n",exchange);
    printf("\n");

    printf("Foreign Currency Exchange\n");
    printf("Source Amount (PHP): ");
    scanf(" %lf",&amount);


    double exchangeRate[6] = {1, 62, 0.40, 84, 72, 9};
    double php = amount*exchangeRate[0];
    double usd = amount*exchangeRate[1];
    double jpy = amount*exchangeRate[2];
    double gbp = amount*exchangeRate[3];
    double eur = amount*exchangeRate[4];
    double cny = amount*exchangeRate[5];
    printf("\nExchanged Currency\n");
    printf("[1] Philippine Peso (PHP) = %.2lf\n", php);
    printf("[2] United States Dollar (USD) = %.2lf\n", usd);
    printf("[3] Japanese Yen (JPY) = %.2lf\n", jpy);
    printf("[4] British Pound Sterling (GBP) = %.2lf\n", gbp);
    printf("[5] Euro (EUR) = %.2lf\n", eur);
    printf("[6] Chinese Yuan Renminni (CNY) = %.2lf\n\n", cny);
    printf("***\n");
    printf("Source Currency = Philippine Peso (PHP)\n");
    printf("Source Amount (PHP): %.2lf\n", amount);
}
