object Q3 extends App{

    var ac1 = new Account("123456v",123456,90000);
    var ac2 = new Account ("54321V",54321,100000);
    
    ac1.transfer(ac2,10000);

    println(ac1)
    println(ac2)
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