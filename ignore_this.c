#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
struct Account {
    char name[50];
    double balance;
};

struct Account accounts[100];
int accountCount = 0;
double exchangeRate[6] = {1, 62, 0.40, 84, 72, 9};

void registerAccount(char name[50]){
    struct Account a;
    strcpy(a.name,name);
    a.balance = 1000.00;
    accounts[accountCount] = a;
    accountCount++;
}

void depositAccount(int idx, double amount) {
    accounts[idx].balance += amount;
}
void withdrawAccount(int idx, double amount) {
    accounts[idx].balance -= amount;
}
void currencyExchange(double amount) {

    double php = amount/exchangeRate[0];
    double usd = amount/exchangeRate[1];
    double jpy = amount/exchangeRate[2];
    double gbp = amount/exchangeRate[3];
    double eur = amount/exchangeRate[4];
    double cny = amount/exchangeRate[5];
    printf("\nExchanged Currency\n", php);
    printf("[1] Philippine Peso (PHP) = %.2lf\n", php);
    printf("[2] United States Dollar (USD) = %.2lf\n", usd);
    printf("[3] Japanese Yen (JPY) = %.2lf\n", jpy);
    printf("[4] British Pound Sterling (GBP) = %.2lf\n", gbp);
    printf("[5] Euro (EUR) = %.2lf\n", eur);
    printf("[6] Chinese Yuan Renminni (CNY) = %.2lf\n", cny);
    printf("***\n");
    printf("Source Currency = Philippine Peso (PHP)\n");
    printf("Source Amount (PHP): %.2lf\n\n", amount);

}

void showIntrestAmount() {
    printf("Show intrest amount.");
}
void mainMenu() {
    while (true) {
        int choice;
        printf("Select Transaction:\n[1] Register Account Name\n[2] Deposit Amount\n[3] Withdraw Amount\n[4] Currency Exchange\n[5] Record Exchange Rates\n[6] Show Interest Amount");
        printf("\nChoice: ");
        scanf("%d",&choice);
        printf("***\n");
        printf("Choice = %d\n", choice);
        char name[50];
        switch (choice) {
            case 1:

                printf("\nRegister Account Name\n");
                printf("Account Name: ");
                scanf(" %[^\n]",name);
                registerAccount(name);
                printf("***\n");
                printf("Account Name = %s\n", name);
                break;
            case 2:
                if (accountCount == 0) {
                    printf("Account List is Empty!\n");
                    continue;
                }
                printf("Deposit Amount \n");
                printf("Account Name: ");
                scanf(" %[^\n]",name);
                bool found = false;
                for (int i = 0; i < accountCount; i++) {
                    if (strcmp(accounts[i].name, name) == 0) {
                        found = true;
                        double amount;
                        printf("Current Balance: %.2f\n", accounts[i].balance);
                        printf("Currency: PHP\n");
                        printf("Deposit Amount: ");
                        scanf("%lf",&amount);
                        depositAccount(i, amount);
                        printf("\n");
                        printf("***\n");
                        printf("Account Name = %s\n", name);
                        printf("Deposit Amount = %.2lf\n", amount);
                    };
                }
                if (!found) {
                    printf("Account Name Not Found!\n");
                }
                break;
            case 3:
                if (accountCount == 0) {
                    printf("Account List is Empty!\n");
                    continue;
                }
                printf("Withdraw Amount\n");
                printf("Account Name: ");
                scanf(" %[^\n]",name);
                found = false;
                for (int i = 0; i < accountCount; i++) {
                    if (strcmp(accounts[i].name, name) == 0) {
                        found = true;
                        double amount;
                        printf("Current Balance: %.2f\n", accounts[i].balance);
                        printf("Currency: PHP\n");
                        printf("Withdraw Amount: ");
                        scanf("%lf",&amount);
                        withdrawAccount(i, amount);
                        printf("***\n");
                        printf("Account Name = %s\n", name);
                        printf("Withdraw Amount = %.2lf\n", amount);
                    };
                }
                if (!found) {
                    printf("Account Name Not Found!\n");
                }
                break;
            case 4:
                double amount;
                printf("Foreign Currency Exchange\n");
                printf("Source Amount (PHP): ");
                scanf("%lf",&amount);
                currencyExchange(amount);
                break;
            case 5:
                int choice;
                printf("Record Exchange Rate\n\n");
                printf("[1] Philippine Peso (PHP)\n");
                printf("[2] United States Dollar (USD)\n");
                printf("[3] Japanese Yen (JPY)\n");
                printf("[4] British Pound Sterling (GBP)\n");
                printf("[5] Euro (EUR)\n");
                printf("[6] Chinese Yuan Renminni (CNY)\n\n");
                printf("Select Foreign Currency: ");
                scanf("%d",&choice);
                printf("Exchange Rate: %.2lf\n", exchangeRate[choice-1]);

                printf("***");
                printf("\nSource Foreign Currency = [%d]\n", choice);
                printf("Exchange Rate = %.2lf\n\n", exchangeRate[choice-1]);

                break;
            case 6:
                showIntrestAmount();
                break;
        }
    }
}

int main() {
    mainMenu();
    return 0;
}
