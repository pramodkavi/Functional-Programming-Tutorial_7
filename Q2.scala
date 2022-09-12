object Q2 extends App{

    // x=3/4, y=5/8, z=2/7.

    var x = new Rational(3,4)
    var y = new Rational(5,8)
    var z = new Rational(2,7)

    //x-y-z
    print(x.sub(y.sub(z)))
    
}

class Rational(x:Int,y:Int){
    def numer = x;
    def denom = y;

    def sub(r:Rational)={
        new Rational(numer * r.denom - r.numer * denom,denom * r.denom);
    }

    override def toString = this.numer + "/" + this.denom

}