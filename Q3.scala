object Q3 extends App{

    val ac1 = new Account("123456v",123456,90000);
    val ac2 = new Account ("54321V",54321,100000);
    
    //transfer money from acc1 to acc2
    ac1.transfer(ac2,10000);

    print("Account 1 : ");
    println(ac1.balance);
    print("Account 2 : ");
    println(ac2.balance);
}

class Account(id:String,n: Int, b: Double) {
    val nic:String = id
    val acnumber: Int = n;
    var balance: Double = b;

    override def toString = "["+nic+":"+acnumber +":"+ balance+"]";

    def withdraw(a:Double) ={
        this.balance= this.balance-a;
    } 

    def deposit(a:Double) ={
        this.balance=this.balance+a
    }

    def transfer(a:Account,b:Double)={
        a.balance = a.balance + b;
        this.balance=this.balance - b;
    }
}