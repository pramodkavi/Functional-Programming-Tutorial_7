object Q1  extends App{

    var x= new Rational(3,4)
    var negX= x.neg;
    print(negX)

}

def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

class Rational(x: Int, y: Int) {
    def numer = x
    def denom = y
    
    def add(r: Rational) = new Rational(numer * r.denom + r.numer * denom,denom * r.denom)

    def neg = new Rational(-this.numer,this.denom);


    override def toString = this.numer + "/" + this.denom
}

