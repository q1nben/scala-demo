package me.q1nben.homework1

import java.time.temporal.TemporalAmount

object Homework02 {
    def main(args: Array[String]): Unit = {
        val account = new CheckingAccount(1000)
        println(account.deposit(100))
    }
}

class BankAccount(initialBalance: Double) {
    private var balance = initialBalance

    def deposit(amount: Double): Double = {
        balance += amount
        balance
    }

    def withdraw(amount: Double): Double = {
        balance -= amount
        balance
    }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    override def deposit(amount: Double): Double = {
        super.deposit(amount - 1)
    }

    override def withdraw(amount: Double): Double = {
        super.withdraw(amount + 1)
    }
}
