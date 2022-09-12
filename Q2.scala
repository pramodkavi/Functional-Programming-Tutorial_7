object Q2 extends App{

    // x=3/4, y=5/8, z=2/7.

    var x = new Rational(3,4)
    var y = new Rational(5,8)
    var z = new Rational(2,7)

    //x-y-z
    print(x-y-z)
    
}

def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

class Rational(x:Int,y:Int){
    private val g = gcd(Math.abs(x), y);
    def numer = x / g;
    def denom = y / g;


    def neg = new Rational(-this.numer, this.denom)
    def add(r:Rational) = new Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
    def -(r:Rational) = this.add(r.neg)

    private def gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y);
    
    override def toString = this.numer + "/" + this.denom

}