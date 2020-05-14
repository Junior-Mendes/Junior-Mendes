public class MyClass {
    
    public static void main(String args[]) {
      
       int[] vetor = new int[] {(1 + 30)*15};
    
          System.out.println("O Resultado da progressão Aritmética é: " + soma(vetor));
    }
    
    public static int soma(int vetor[]){
          int soma = 0;
         for(int i=0; i< vetor.length ; i++){
            soma = soma +  vetor[i];
        }
        
        return soma;
    }
    
}
