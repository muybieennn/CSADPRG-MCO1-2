/*
*     Last Names: Manoos, Bien Gabriel L.
*     Language: Kotlin
*     Paradigm: A standard basic input and output operation
*     for Banking and Currency Exchange Application (MCO1)
*/

fun registerAccName () {
    println("Register Account Name")
    print("Account Name: ")
    var accName: String = readln()

    println("\n***")
    println("Account Name = " + accName)
}

fun depositAmount () {
    var currBalance: Double = 1000.0
    var currency: String = "PHP"

    println("Deposit Amount")
    print("Account Name: ")
    var accName: String = readln()
    println("Current Balance: " + "%.2f".format(currBalance))
    println("Currency: " + currency)

    print("\nDeposit Amount: ")
    var depAmount: Double = readln().toDouble()

    println("\n***")
    println("Account Name = " + accName)
    println("Deposit Amount = " + "%.2f".format(depAmount))
}

fun withdrawAmount () {
    var currBalance: Double = 1000.0
    var currency: String = "PHP"

    println("Withdraw Amount")
    print("Account Name: ")
    var accName: String = readln()
    println("Current Balance: " + "%.2f".format(currBalance))
    println("Currency: " + currency)

    print("\nWithdraw Amount: ")
    var withAmount: Double = readln().toDouble()

    println("\n***")
    println("Account Name = " + accName)
    println("Withdraw Amount = " + "%.2f".format(withAmount))
}

fun currencyExchange () {
    var usdRate: Double = 62.0
    var jpyRate: Double = 0.40
    var gbpRate: Double = 84.0
    var eurRate: Double = 72.0
    var cnyRate: Double = 9.0

    println("Foreign Currency Exchange")
    print("Source Amount (PHP): ")
    var srcAmount: Double = readln().toDouble()

    println("\nExchanged Currency")
    println("[1] Philippine Peso (PHP) = " + "%.2f".format(srcAmount))
    println("[2] United States Dollar (USD) = " + "%.2f".format(srcAmount / usdRate))
    println("[3] Japanese Yen (JPY) = " + "%.2f".format(srcAmount / jpyRate))
    println("[4] British Pound Sterling (GBP) = " + "%.2f".format(srcAmount / gbpRate))
    println("[5] Euro (EUR) = " + "%.2f".format(srcAmount / eurRate))
    println("[6] Chinese Yuan Renminni (CNY) = " + "%.2f".format(srcAmount / cnyRate))

    println("\n***")
    println("Source Currency = Philippine Peso (PHP)")
    println("Source Amount (PHP) = " + "%.2f".format(srcAmount))
}

fun exchangeRates () {
    println("Record Exchange Rate\n")
    println("[1] Philippine Peso (PHP)")
    println("[2] United States Dollar (USD)")
    println("[3] Japanese Yen (JPY)")
    println("[4] British Pound Sterling (GBP)")
    println("[5] Euro (EUR)")
    println("[6] Chinese Yuan Renminni (CNY)")

    print("\nSelect Foreign Currency: ")
    var currChoice: Int = readln().toInt()
    print("Exchange Rate: ")
    var exRate: Double = readln().toDouble()

    println("\n***")
    println("Select Foreign Currency = [" + currChoice + "]")
    println("Exchange Rate = " + "%.2f".format(exRate))
}

fun showInterestAmount () {
    // no specs for this yet
}

fun main() {
    println("Select Transaction:")
    println("[1] Register Account Name")
    println("[2] Deposit Amount")
    println("[3] Withdraw Amount")
    println("[4] Currency Exchange")
    println("[5] Record Exchange Rates")
    println("[6] Show Interest Amount")
    print("\nChoice: ")

    var num: Int = readln().toInt()

    println("\n***")
    println("Choice = " + num)

    println()
    registerAccName()
    println()
    depositAmount()
    println()
    withdrawAmount()
    println()
    exchangeRates()
    println()
    currencyExchange()
}
