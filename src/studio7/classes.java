public class Rectangle {
    private double length;
    private double width;

    public void Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public void Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea () {
       return (this.length * this.width);
    }

    public double getPerimeter () {
       return (2*(this.length) + 2*(this.width));
    }

    public boolean isSquare() {
        return this.length == this.width;
    }

    public boolean compareRectangle(Rectangle a) {
        return ((this.length*this.width) >= (a.getLength()*a.getWidth()));
    }

}

public class Die {
    private int sides;

    public void Die() {
        this.sides = 6;
    }

    public void Die(int n) {
        this.sides = n;
    }

    public int rollDie() {
        creturn (int)(Math.random()*sides) +1;
    }

}

public class Fraction {
    private int numerator;
    private int denominator;

    public void Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    public void Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator () {
       return this.numerator;
    }

    public int getDenominator () {
       return this.denominator;
    }

    private int gcd (int num, int denom) {
        if(denom==0){
            return num;
        }
        return gcd(denom,num%denom);
    }

    public Fraction simplify(){
        Fraction frac = new Fraction(this.numerator/gcd(this.numerator, this.denominator), denominator(this.numerator,this.denominator));
        return frac;
    }

    public Fraction multiplication(Fraction a) {
        int newNum = this.numerator * a.getNumerator();
        int newDenom = this.denominator * a.getDenominator();
        Fraction frac = new Fraction(newNum, newDemon);
        return(frac.simplify()); 
    }

    public Fraction addition(Fraction a) {
        int n1 = this.numerator * a.getDenominator();
        int n2 = this.denominator * a.getNumerator();
        int d1 = this.denominator * a.getDenominator();
        Fraction frac = new Fraction((n1+n2), d1);
        return (frac.simplify());
    }

    public Fraction reciprocal() {
        Fraction frac = new Fraction(this.denominator, this.numerator);
        return (frac.simplify());
    }
}

public class Complex {
    private double real;
    private double imaginary;

    public void Complex() {
        this.real = 1;
        this.imaginary = 1;
    }

    public void Complex(double real, double imaginary) {
        this.real = real;
        this.real = imaginary;
    }

    public double getReal () {
       return this.real;
    }

    public double getImaginary () {
       return this.imaginary;
    }

    public Complex addition(Complex a) {
        int newreal = this.real + a.getReal();
        int newimaginary = this.imaginary + a.getImaginary();
        Complex comp = new Complex(newreal, newimaginary);
        return comp;
    }
    
    public Complex product(Complex a) {
        int r1 = this.real*a.getReal();
        int r2 = this.imaginary*a.getImaginary();
        int i1 = this.real*a.getImaginary();
        int i2 = this.imaginary*a.getReal();
        Complex comp = new Complex(r1-r2, i1+i2);
        return(comp);
    }
}

public class HockeyPlayer {
    private String name;
    private int number;
    private String hand;
    private String shot;
    private int goal;
    private int assists;
    private int games;

    public void HockeyPlayer() {
        this.goal = 0;
        this.assists = 0;
        this.shot = "Right";
        this.hand = "Right";
        this.name = "Gritty";
        this.number = 1;
        this.games = 0
    }

    public void HockeyPlayer(String name, String hand, String shot, int games, int number, int goals, int assists) {
        this.goal = goal;
        this.assists = assists;
        this.shot = shot;
        this.hand = hand;
        this.name = name;
        this.number = number;
        this.games = games;
    }

    public int points(){
        return this.goal+this.assists;
    }

    public void game(int goals, int assists) {
        this.goal += goals;
        this.assists +=assists;
        this.games++;
    }
    
}