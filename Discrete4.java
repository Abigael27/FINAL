//PASCAL TRIANGLE ROW GENERATOR
import java.util.*;
import java.math.BigInteger;
    
class Discrete4 extends Discrete3{

    
    static void P(){ 
        Scanner sc= new Scanner(System.in);
                System.out.print("\nPASCAL TRIANGLE ROW GENERATOR");

        System.out.print("\nENTER # ROW : ");
        int IN= sc.nextInt();
        
        
        if(IN>=501){
                System.out.println("GREATER THAN 500 IS INVALID INPUT ");
            P();
        }
        
        else if(IN<0){
                System.out.println("NO ANSWER TRY AGAIN!! ");
            P();
        }
        
        else{
        System.out.print("ANSWER: ");
        BigInteger[] OUTCOME = PCOM(IN);
        for(BigInteger r: OUTCOME){
            System.out.print(r + " ");
        }System.out.println("\nTRY AGAIN = 0-NO 1-YES");
            System.out.print("ENTER A NUMBER: ");
            int ok;
            ok = sc.nextInt();
            if(ok==1){
                P();
             }
            else if(ok==0){
               MAINCLASS.okk();
            }
            else{
                System.out.println("OUT OF THE CHOICES TRY AGAIN!! "+"\n");
                P();
            }
        }
    
        }
    

    private static BigInteger[] PCOM(int IN) {
       BigInteger AAA = new BigInteger("1");
       BigInteger BBB = new BigInteger("1");
        
        BigInteger[] HERE = {AAA,BBB};
        for (int i= 0; i <= IN; i++){
            BigInteger[] next = new BigInteger[i+1];
            next[0] = AAA;
            for (int y = 1; y < i; y++){
                next [y] = HERE [ y -1 ].add(HERE[y]);
            }
            next[i] = AAA;
            HERE = next;
        }
        return HERE;
    } 
}
