//STIRLING NUMBER OF 2ND CASE

import java.util.Scanner;
import java.math.BigInteger;

class Discrete3 extends Discrete2 {
    

   
 static void stir(){
         Scanner sc = new Scanner(System.in);
          System.out.print("\nSTIRLING NUMBER OF 2ND CASE");

        System.out.print("\nENTER # N : ");
        int N = sc.nextInt();
        System.out.print("ENTER # J: ");
        int J = sc.nextInt();
        
        if((N>500)||(J>500)){
                System.out.println("GREATER THAN 500 IS INVALID INPUT ");
                stir();
            }
        else if((N<0)||(J<0)){
                System.out.println("NO ANSWER TRY AGAIN ");
                stir();
            }
  
        else{
        System.out.print("ANSWER: ");

        BigInteger AAA = BigInteger.valueOf(-1);
        BigInteger BBB = BigInteger.valueOf(-1);
        
        BigInteger CCC = BigInteger.ZERO;
        BigInteger DDD = BigInteger.ZERO;
        BigInteger EEE = BigInteger.ZERO;
            for(int i=0;i<J;i++){
            
            AAA = (AAA).multiply(BBB);
            BigInteger COMB = FAC(J).divide(FAC(i).multiply(FAC(J-i)));
            CCC = BigInteger.valueOf(J).subtract(BigInteger.valueOf(i));
            DDD = BigInteger.valueOf(J).subtract(BigInteger.valueOf(i));
                
            for(int a=1;a<N;a++){
             CCC = CCC.multiply(DDD);
                }
             EEE = EEE.add((AAA).multiply(COMB).multiply(CCC));
            }
        System.out.println(EEE.divide(FAC(J)));
            System.out.println("\nTRY AGAIN? 0-NO 1-YES");
            System.out.print("ENTER A NUMBER: ");
            int ok;
            ok = sc.nextInt();
            if(ok==1){
                stir();
             }
            else if(ok==0){
                MAINCLASS.okk();
            }
            else{
                System.out.println("OUT OF THE CHOICES"+"\n");
                stir();
            }
        }
    }
    static BigInteger FAC(int N){
        BigInteger FC = new BigInteger("1");
        for(int b = 2; b < N; b++){
            FC = FC.multiply(BigInteger.valueOf(b));
        }
        return FC;
    }
}
