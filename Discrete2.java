//WITH REPITION
import java.math.BigInteger;
import java.util.Scanner;


class Discrete2 extends Discrete1 {


    
 static void with() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSELECTED NUMBERS \n 1.PERMUTATION  \n 2.COMBINATION \n");
       
        System.out.print("ENTER YOUR SELECT NUMBER: ");        
        int SELECT;
        SELECT = sc.nextInt();
        
        if(SELECT==1){
           PER();
            
            System.out.println("\nTRY AGAIN? 0-NO 1-YES");
            System.out.print("ENTER A NUMBER: ");
            int ok;
            ok = sc.nextInt();
        
          if(ok==0){
                MAINCLASS.okk();
            }
            else if(ok==1){
                with();
            }
            else{
                System.out.println("OUT OF THE CHOICES TRY AGAIN!!");
                with();
            }
        }     
        
        else if(SELECT==2){
            COMBI();
        }
        
        }
    
    public static void PER(){
        Scanner SC = new Scanner(System.in);
        System.out.println("\tPERMUTATION");
        System.out.print("ENTER # N : ");
        BigInteger N = SC.nextBigInteger();
        int IN = 500;
        System.out.print("ENTER # R : ");
        int R = SC.nextInt();
        
        if ((BigInteger.valueOf(IN).compareTo(N)<0)||(R > 500)){
                System.out.println("GREATER THAN 500 IS INVALID INPUT ");
                PER();
            }
        
        else{
        BigInteger OUTCOME = N.pow(R);
        System.out.println("ANSWER: "+OUTCOME);
        }
    }
    
    public static void COMBI(){
        Scanner PERMOTO = new Scanner(System.in);
        System.out.println("\tCOMBINATION");
        System.out.print("ENTER # N : ");
        int NNN = PERMOTO.nextInt();
        System.out.print("ENTER # R : ");
        int RRR = PERMOTO.nextInt();
        
        if ((NNN > 500)||(RRR > 500)){
                System.out.println("GREATER THAN 500 IS INVALID");
                COMBI();
                
        }
        else if(NNN<RRR){
            System.out.println("N GREATER THAN R IS INVALID ");
        
            }
        else{
        if(RRR <= NNN){
            int NUM = NNN + (RRR - 1);
            int NUM2 = NUM - RRR;
            
            System.out.println("ANSWER : "+PCFAC(NUM,RRR,NUM2));
            
            }
        
            }
    }    
    static BigInteger PCFAC(int N, int R, int M){
        BigInteger AAA = new BigInteger("1");
        BigInteger BBB = new BigInteger("1");
        BigInteger CCC = new BigInteger("1");
        BigInteger OUTCOME;
        
        for (int i = 2; i <=N; i++) {
            AAA = AAA.multiply(BigInteger.valueOf(i));
            
        }
        for (int y = 2; y <=R; y++) {
            BBB = BBB.multiply(BigInteger.valueOf(y));
            
        }
        for (int x = 2; x <=M; x++) {
            CCC = CCC.multiply(BigInteger.valueOf(x));
            
        }
       
        OUTCOME = AAA.divide((BBB.multiply(CCC)));

        return OUTCOME;
}}


