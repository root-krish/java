//package com.mycompany.bank;

/**
 * @author root-krish
 */
import java.util.*;

class Custumer{
    int ac;
    String name;
}

class Sb extends Custumer{
    Scanner sc = new Scanner(System.in);
    
    int balence=0;
    int temp=0;
    
    //constructor for getting details of custumer 
    Sb(){
        System.out.print("Enter Account No- ");
        ac=sc.nextInt();    //get account Number
        sc.nextLine();
        System.out.print("Enter Account Holder Name- ");
        name=sc.nextLine();//get account holder name
    }
    Sb(String name){
        this.name=name;
        System.out.print("Enter Account No- ");
        ac=sc.nextInt();
    }
    
    int getbal(){
        System.out.print("Enter Amount: ");
        temp=sc.nextInt();
        return temp;
    }
    void debit(){
        int temp=this.getbal();
        if(balence>=temp){
            balence-=temp;
            this.showBal(balence);
        }else{
            System.out.println("Insufficent Balence");
        }
    }
    void credit(){
        int temp=0;
        temp=this.getbal();
        if(temp<=0){
            System.out.print("Invalid Credit Ammount\n");
        }else{
        balence+=temp;
        this.showBal(balence);
        }
    }
    
    void showBal(int a){
        System.out.println("Account- "+this.ac+"\nAvilable Balence= "+a);
    }
    void showBal(){
        
        System.out.println("\nname="+name +"\nAccount Number- "+ac+"\nBalence="+balence);
    }
}

//for Loan or cash credit account
class CC extends Custumer{
    
}

public class Main {

    public static void main(String[] args) {
        Sb sb1=new Sb();
        Scanner sc=new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("\n\n1.For Debit\t2.Credit\t3.Show Balece\n4.Exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:{
                    sb1.debit();
                    break;
                }
                case 2:{
                    sb1.credit();
                    break;
                }
                case 3:{
                    sb1.showBal();
                    break;
                }
                case 4:{
                    System.exit(0);
                }
                default:{
                    System.out.print("Choose the Correct Opetion--");
                    break;
                }
            }
        }
    }
}
