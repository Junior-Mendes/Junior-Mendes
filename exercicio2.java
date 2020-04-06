public class MyClass {
    
    public static void main(String args[]) {
      
       int[] vetor = new int[] {(1 + 30)*15}; 
       System.out.println("inicio = 1; fim = 30; inicio + fim = 31; (fim/2 = 15); 31*15 = 465");
       
       System.out.println("----------------------------------------------------------------");
    
    int soma = 0;

    for(int i=0; i< vetor.length ; i++){
        soma = soma +  vetor[i];
    }

      System.out.println("O Resultado da progressão Aritmética é: " + soma);
      
      
    }
    
    
}
