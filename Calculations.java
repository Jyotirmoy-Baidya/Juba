import mathCal.FactGCD;
import mathCal.mathCheck.Prime;

public class Calculations{
    public static void main(String[] args){
        FactGCD f = new FactGCD();
        Prime p = new Prime();
        f.Factorial();
        f.GCD();
        p.isPrime();
    }
}