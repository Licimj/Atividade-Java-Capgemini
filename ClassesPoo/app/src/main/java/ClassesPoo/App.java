
package ClassesPoo;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
       Pessoa objetoPessoa = new Pessoa(70f,1.70f); // chamar a classe pessoa 
      
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o peso da pessoa ");
        
        objetoPessoa.setPeso(leitor.nextFloat());
        
        System.out.println("Digite a Altura da pessoa");
        
         objetoPessoa.setAltura(leitor.nextFloat());
          
         System.out.println("IMC = " + objetoPessoa.calcularIMC());
        
    }
}
