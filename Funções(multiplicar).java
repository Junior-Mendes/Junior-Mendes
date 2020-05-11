  
import java.util.Scanner;

public class MyClass {
    
    public static void main(String args[]) {
        
        int A;
        int B;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o produto A :");
        A = sc.nextInt();
        
        System.out.println("Digite o produto B :");
        B = sc.nextInt();
        
        System.out.println(imprime() + multiplicacao(A , B));
    }
    
    
    public static int multiplicacao(int A, int B){
        return A * B;
    }
     public static String imprime (){
          return "PROD =  " ;
     }
         
   
}
