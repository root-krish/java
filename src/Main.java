//linked List Code Implementation

import java.util.Scanner;

class Node{
    public int data;
    public Node next;
        Node(int val) {
            data=val;
            next = null;
        }
        Node(){
            System.out.print("Enter The Value:-");
            Scanner sc = new Scanner(System.in);
            int val=sc.nextInt();
            data=val;
            next=null;
        }
    }

class LinkedList{

    private Node head=null;
    public Node ptr=head;

    public void insertAtEnd() {
        Node temp =new Node();
        if(head==null){
            head=temp;
        }else {
            while (ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=temp;
        }
        ptr=head;
    }

    public int getVal(){
        int val;
        System.out.println("Enter The Value:-");
        Scanner scanner=new Scanner(System.in);
        val=scanner.nextInt();
        return val;
    }

    public void insertatBeging(){
        Node temp=new Node(this.getVal());
        if(ptr!=null){
            head=temp;
            temp.next=ptr;
        }
        else {
            insertAtEnd();
        }
        ptr=head;
    }

    public void display(){
        if(ptr!=null){
            System.out.println("\n");
            while (ptr!=null){
                System.out.print(ptr.data);
                System.out.print("->");
                ptr=ptr.next;
            }
            System.out.println("NULL");

        }else {
            System.out.println("List is Empty....");
        }
        ptr=head;
    }
}


class Main{

    public static void main(String[] args){
        LinkedList obj=new LinkedList();
        int ch;
        while (true){
            System.out.println("1.For Insert\t2.For display\t3.For Exit");
            System.out.print("Enter Your Choice:-");
            Scanner scanner =new Scanner(System.in);
            ch=scanner.nextInt();
            switch (ch){
                case 1:{
                    int choice;
                    System.out.println("1.For Insert at Begening\t2.For Insert At End");
                    Scanner scanner1=new Scanner(System.in);
                    choice=scanner1.nextInt();
                    if(choice==1){
                        obj.insertatBeging();
                        break;
                    }else if (choice==2){
                        obj.insertAtEnd();
                        break;
                    }else {
                        System.out.println("Wrong Choice...");
                        break;
                    }
                }

                case 2:{
                    obj.display();
                    break;
                }

                case 3:{
                    System.exit(0);
                }

                default:{
                    System.out.println("Wrong Choice...");
                }
            }
        }
    }
}