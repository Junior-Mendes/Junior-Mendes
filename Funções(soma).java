import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {

        int A;
        int B;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a variável A :");
        A = sc.nextInt();

        System.out.println("Digite a variável B :");
        B = sc.nextInt();

        System.out.println(imprime() + soma(A , B));
    }
    
    public static int soma(int A, int B){
        return A + B;
    } 
    
    public static String imprime (){
        return "X =  " ;
    }
}
