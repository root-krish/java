import java.util.Scanner;
class Fraction{
    int num,denom;
    Scanner sc=new Scanner(System.in);
    Fraction (){
        
    }
    Fraction(int num,int denom){
        denom=denom;
        num=num;
    }
        void GetValue(String arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Numerator Value of "+arg+"- ");
        this.num=sc.nextInt();
        System.out.print("Enter Denominator Value of "+arg+"- ");
        this.denom=sc.nextInt();
    }
    
    void showfraction(Fraction Result){
        if(Result.num==Result.denom)
            System.out.println("The Value is-1");
        else
            System.out.println("The Value is-"+Result.num+"/"+Result.denom);
    }
    

    void addFraction(Fraction B){
        Fraction R =new Fraction();
        R.num = num*B.denom+B.num*denom;
        R.denom = denom*B.denom;
        int divisor = gcd(R.num, R.denom);
        R.num=R.num/divisor;
        R.denom=R.denom/divisor;
        showfraction(R);
        
    }
        static int gcd(int num, int denom) {
            if (denom == 0) {
                return num; 
             }
            if (num % denom == 0) {
                return denom;
        } else {
            return gcd(denom, num % denom);
        }
    }
}
class Main{
    public static void main(String[] args){
        Fraction f1=new Fraction();
        f1.GetValue("f1");
        f1.showfraction(f1);
        
        Fraction f2=new Fraction();
        f2.GetValue("f2");
        f2.showfraction(f2);
        
        f1.addFraction(f2);
        f1.sc.close();
    }
    
}