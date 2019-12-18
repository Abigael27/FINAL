//WITHOUT REPITION

import java.math.BigInteger;
import java.util.Scanner;


class Discrete1 extends MAINCLASS {
 

static void comperm(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSELECTED NUMBERS \n 1.PERMUTATION  \n 2.COMBINATION \n");
        System.out.print("ENTER YOUR SELECT NUMBER: ");        
        int SELECT = sc.nextInt();
 
        if(SELECT==1){
            System.out.println("\tPERMUTATION WITHOUT REPITION");
        System.out.print("ENTER # N : ");
            int N = sc.nextInt();
        System.out.print("ENTER # R : ");
            int R = sc.nextInt();
            
            if((N>500)||(R>500)){
                System.out.println("GREATER THAN 500 IS INVALID INPUT ");
           comperm();
             }
            
            else if((N<0)||(R<0)){
                System.out.println("NO ANSWER");
                comperm();
            }
            
            else{
            int M = N-R;
            if(N>=R){
            System.out.println("ANSWER: "+ PERFC (N,R,M));
           
            System.out.println("\nTRY AGAIN? 0-NO 1-YES");
            System.out.print("ENTER A SELECT NUMBER: ");
            int ok;
            ok = sc.nextInt();
            if(ok==1){
                comperm();
             }
            else if(ok==0){
                 MAINCLASS.okk();
            }
                else{
                System.out.println("OUT OF THE CHOICES TRY AGAIN!! "+"\n");
                comperm();
            }
            }
         
            
            else if(N<R){
            System.out.println("N SHOULD BE  GREATER THAN R");
            System.out.println("\nTRY AGAIN? 0-NO 1-YES");
            System.out.print("ENTER A NUMBER: ");
            int ok;
            ok = sc.nextInt();
            if(ok==1){
                comperm();
             }
            else if(ok==0){
                 MAINCLASS.okk();
            }
            else{
                System.out.println("OUT OF THE CHOICES TRY AGAIN!! "+"\n");
                comperm();
            }
        }
            else{
            System.out.println("INVALID INPUT");
           System.out.println("\nTRY AGAIN? 0-NO 1-YES");
            System.out.print("ENTER A NUMBER: ");
            int ok;
            ok = sc.nextInt();
            if(ok==1){
                comperm();
            }
            else if(ok==0){
                 MAINCLASS.okk();
            }
            else{
                System.out.println("OUT OF THE CHOICES TRY AGAIN!! "+"\n");
                comperm();
            }
        }
    }
}

        
        else if(SELECT==2){
        System.out.println("\tCOMBINATION WITHOUT REPITION");
        System.out.print("ENTER # N : ");
        int N = sc.nextInt();
        System.out.print("ENTER # R : ");
        int R = sc.nextInt();
        
        if((N>500)||(R>500)){
                System.out.println("GREATER THAN 500 IS INVALID INPUT ");
            }
    else if((N<0)||(R<0)){
                System.out.println("NO ANSWER");
                comperm();
    }
        else{
        int M = N-R;
        if(N>=R){
            System.out.println("ANSWER: "+ COMFC (N,R,M));
              System.out.println("\nTRY AGAIN? 0-NO 1-YES");
            System.out.print("ENTER A NUMBER: ");
            int ok;
            ok = sc.nextInt();
            if(ok==1){
                comperm();
            }
            else if(ok==0){
                MAINCLASS.okk();
            }
            else{
                System.out.println("OUT OF THE CHOICES TRY AGAIN!! "+"\n");
                comperm();
            }
        }
        else if(N<R){
            System.out.println("N GREATER THAN R IS INVALID ");
              System.out.println("\nTRY AGAIN? 0-NO 1-YES");
            System.out.print("ENTER A NUMBER: ");
             int ok;
            ok = sc.nextInt();
            if(ok==1){
                comperm();
            }
            else if(ok==0){
                MAINCLASS.okk();
            }
               
            else{
                System.out.println("OUT OF THE CHOICES TRY AGAIN!!"+"\n");
                comperm();
        }
        }
            else{
            System.out.println("INVALID INPUT");
           System.out.println("\nTRY AGAIN? 0-NO 1-YES");
            System.out.print("ENTER A NUMBER: ");
            int ok;
            ok = sc.nextInt();
            if(ok==1){
                comperm();
            }
            else if(ok==0){
                 MAINCLASS.okk();
            }
            else{
                System.out.println("OUT OF THE CHOICES TRY AGAIN "+"\n");
                comperm();
}
}
}
}
}

    static BigInteger PERFC(int N, int R, int M){
        BigInteger AAA = new BigInteger("1");
        BigInteger BBB = new BigInteger("1");
        BigInteger ANSWER;
        
        for (int i = 2; i <=N; i++) {
            AAA = AAA.multiply(BigInteger.valueOf(i));
        }
        for (int x = 2; x <=M; x++) {
            BBB = BBB.multiply(BigInteger.valueOf(x));    
        }
        ANSWER = AAA.divide(BBB);

        return ANSWER;
    }    
    static BigInteger COMFC(int N, int R, int M){
        BigInteger AAA = new BigInteger("1");
        BigInteger CCC = new BigInteger("1");
        BigInteger NUM = new BigInteger("1");
        BigInteger RESULT;
        
        for (int i = 2; i <=N; i++) {
            AAA = AAA.multiply(BigInteger.valueOf(i));
            
        }
        for (int y = 2; y <=R; y++) {
            CCC = CCC.multiply(BigInteger.valueOf(y));
            
        }
        for (int x = 2; x <=M; x++) {
            NUM = NUM.multiply(BigInteger.valueOf(x));
            
        }
       
        RESULT = AAA.divide((CCC.multiply(NUM)));

        return RESULT;
}
}

