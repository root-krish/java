import java.util.Scanner;
class Fraction{
    public static Scanner sc=new Scanner(System.in);
    int num,denom;
    
    Fraction (){
        
    }
    Fraction(int num,int denom){
        this.denom=denom;
        this.num=num;
    }
        void GetValue(String arg){
        System.out.print("Enter Numerator Value of "+arg+"- ");
        this.num=sc.nextInt();
        System.out.print("Enter Denominator Value of "+arg+"- ");
        this.denom=sc.nextInt();
    }
    
    void showfraction(Fraction Result){
        if(Result.num==Result.denom)
            System.out.println("The final Value is-1");
        else
            System.out.println("The final Value is-"+Result.num+"/"+Result.denom);
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
        void SubFractin(Fraction B){
            Fraction R=new Fraction();
            R.num=(num*B.denom)-(B.num*denom);
            R.denom=(B.denom)*(denom);
            this.showfraction(R);
        }
}
class Main {
    public static void main(String[] args){
        Fraction f1=new Fraction();
       
        while(true){
            System.out.print("\n1.For ADD\t2.SUB\t3.MULT\t4.DIV\nEnter Your Choice- ");
            int choice=Fraction.sc.nextInt();
            switch(choice){
                case 1:{
                    f1.GetValue("f1");
                    f1.showfraction(f1);
                    break;
                }
                case 2:{
                    Fraction f2=new Fraction();
                    f2.GetValue("f2");
                    f2.showfraction(f2);
                    f1.SubFractin(f2);
                    break;
                }
                case 4:{
                    System.out.print("Exiting....");
                    f1.sc.close();
                    System.exit(0);
                }
                default:{
                    System.out.println("Wrong input");
                    break;
                }
            }
        }
    }
    
}