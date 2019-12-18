import java.util.Scanner;



public class MAINCLASS {
     public static void main(String[]args){
         okk();
     }
     static void okk(){
       Discrete1 discrete1 = new Discrete1();
       Discrete2 discrete2 = new Discrete2();
       Discrete3 discrete3 = new Discrete3();
       Discrete4 discrete4 = new Discrete4();
       
       Scanner num = new Scanner(System.in);
       
       System.out.println("[1]--PERMUTATION AND COMBINATION WITHOUT REPITION");
        System.out.println("[2]--PERMUTATION AND COMBINATION WITH REPITION");
        System.out.println("[3]--STIRLING NUMBER 2ND CASE ");
        System.out.println("[4]--PASCAL TRIANGLE ROWS GENERATOR");
        System.out.print("\n ENTER A NUMBER: ");
        
        
        int choose = num.nextInt();
        if(choose==1){
            Discrete1.comperm();
        }
        else if (choose==2){
            Discrete2.with();
        }
        else if (choose ==3){
            Discrete3.stir();
        }
        else if (choose ==4){
            Discrete4.P();
        }
     }}
