import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int totalDias = sc.nextInt();
        
        int anos = totalDias / 365;
        totalDias = totalDias % 365;
        
        int meses = totalDias / 30;
        totalDias = totalDias % 30;
        
        int dias = totalDias;
        
        System.out.printf("%d ano(s)%n", anos);
        System.out.printf("%d mes(es)%n", meses);
        System.out.printf("%d dias(s)%n", dias);
    }
}
