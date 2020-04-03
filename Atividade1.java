import java.util.Scanner;

public class MyClass {
    
    public static void main(String args[]) {
        
        int produtoA;
        int produtoB;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o produto A :");
        produtoA = sc.nextInt();
        
        System.out.println("Digite o produto B :");
        produtoB = sc.nextInt();
        
        System.out.println("PROD = " + (produtoA * produtoB));
        
        
       
    }
}
