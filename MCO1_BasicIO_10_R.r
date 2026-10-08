#defaults
balance <- 1000.00
usd_rate <- 62.00
jpy_rate <- 0.40
gbp_rate <- 84.00
eur_rate <- 72.00
cny_rate <- 9.00

menu <-
  c(
    "Select Transaction:\n",
    "[1] Register Account Name\n",
    "[2] Deposit Amount\n",
    "[3] Withdraw Amount\n",
    "[4] Currency Exchange\n",
    "[5] Record Exchange Rates\n",
    "[6] Show Interest Amount\n")
writeLines(menu)
cat("Choice: ")
choice <- as.integer(readLines("stdin", n = 1))
writeLines(sprintf("\n***\nChoice = %d", choice))

writeLines("Register Account Name")
cat("Account Name: ")
account_name <- readLines("stdin", n = 1)

writeLines("\n***")
writeLines(sprintf("Account Name = %s\n", account_name))

writeLines("Deposit Amount")
writeLines(sprintf("Account Name: %s", account_name))
writeLines(sprintf("Current Balance: %.2f", balance))
writeLines("Currency: PHP\n")
cat("Deposit Amount: ")
deposit_amount <- as.numeric(readLines("stdin", n = 1))
writeLines("\n***")
writeLines(sprintf("Account Name = %s", account_name))
writeLines(sprintf("Deposit Amount = %.2f\n", deposit_amount))

writeLines("Withraw Amount")
writeLines(sprintf("Account Name: %s", account_name))
writeLines(sprintf("Current Balance: %.2f", balance))
writeLines("Currency: PHP\n")
cat("Withdraw Amount: ")
withdraw_amount <- as.numeric(readLines("stdin", n = 1))
writeLines("\n***")
writeLines(sprintf("Account Name = %s", account_name))
writeLines(sprintf("Withdraw Amount = %.2f\n", withdraw_amount))

rates_menu <-
  c(
    "Record Exchange Rate\n",
    "[1] Philippine Peso (PHP)",
    "[2] United States Dollar (USD)",
    "[3] Japanese Yen (JPY)",
    "[4] British Pound Sterling (GBP)",
    "[5] Euro (EUR)",
    "[6] Chinese Yuan Renminni (CNY)"
  )

writeLines(rates_menu)

cat("Select Foreign Currency: ")
currency_choice <- as.integer(readLines("stdin", n = 1))
cat("\nExchange Rate: ")
exchange_rate <- as.numeric(readLines("stdin", n = 1))

writeLines("\n***")
writeLines(sprintf("Select Foreign Currency = %s", currency_choice))
writeLines(sprintf("Exchange Rate = %.2f\n", exchange_rate))

writeLines("Foreign Currency Exchange")
cat("\nSource Amount(PHP): ")
source_amount <- as.numeric(readLines("stdin", n = 1))

usd_amount <- source_amount / usd_rate
jpy_amount <- source_amount / jpy_rate
gbp_amount <- source_amount / gbp_rate
eur_amount <- source_amount / eur_rate
cny_amount <- source_amount / cny_rate

writeLines("\nExchanged Currency")
writeLines(sprintf("[1] Philippine Peso (PHP): %.2f", source_amount))
writeLines(sprintf("[2] United States Dollar (USD): %.2f", usd_amount))
writeLines(sprintf("[3] Japanese Yen (JPY): %.2f", jpy_amount))
writeLines(sprintf("[4] British Pound Sterling (GBP): %.2f", gbp_amount))
writeLines(sprintf("[5] Euro (EUR): %.2f", eur_amount))
writeLines(sprintf("[6] Chinese Yuan Renminbi (CNY): %.2f", cny_amount))

writeLines("\n***")
writeLines(sprintf("Source Currency = Philippine Peso (PHP)"))
writeLines(sprintf("Source Amount = %.2f", source_amount))