object Code {
    def main(args: Array[String]) = {
        val bank1 = new Bank()

        val acc1 = new Account("12345", 10000)
        val acc2 = new Account("67890", 30000)
        val acc3 = new Account("45632", 40000)
        val acc4 = new Account("13243", 25000)

        bank1.addAccount(acc1)
        bank1.addAccount(acc2)
        bank1.addAccount(acc3)
        bank1.addAccount(acc4)

        acc3.withdraw(40000)
        acc4.withdraw(30000)
        acc2.transfer(acc1, 32000)

        // 4.1
        println("Negative account balances are ") 
        bank1.listNegativeAccounts
        println()

        // 4.2
        print("Sum of all balances is ") 
        println(bank1.sumOfAllAccounts)
        println()

        //4.3
        println("List of all balances after interest is ") 
        bank1.interest
        bank1.listAccounts
    }
}

class Bank {
    var accounts: List[Account] = List()

    def addAccount(account: Account) = {
        accounts = account :: accounts
    }

    def listAccounts = {
        accounts.foreach(println)
    }

    def listNegativeAccounts = {
        accounts.filter(_.balance < 0).foreach(println)
    }

    def sumOfAllAccounts = {
        accounts.map(_.balance).sum
    }

    def interest = {
    accounts.filter(_.balance < 0).foreach(_.balance *= 1.1)
    accounts.filter(_.balance > 0).foreach(_.balance *= 1.05)
    }
}

class Account(id: String, initialBalance: Double) extends Bank{
    val accNo = id
    var balance = initialBalance

    def deposit(amount: Double) = {
        balance += amount
    }
    def withdraw(amount: Double) = {
        balance -= amount
    }
    def transfer(account: Account, amount: Double) = {
        this.withdraw(amount)
        account.deposit(amount)
    }

    override def toString(): String = {
        return "Account: " + id + " Balance: " + balance
    }
}