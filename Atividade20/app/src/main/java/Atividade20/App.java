
package Atividade20;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        
        int anoFrabicacao = 0;
        float valorCarro = 0.0f;
        float porcetagemrDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        
        
        Scanner leitor = new Scanner(System.in);
        
        char desejaRepetir = 's';
        
        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            
            System.out.println("Digite o ano de fabracação do veiculo");
            anoFrabicacao = leitor.nextInt();
            
            System.out.println("Digite o valor  do veiculo");
            
            valorCarro = leitor.nextFloat();
            
            
            if(anoFrabicacao <= 200) {
                porcetagemrDesconto = 0.12f;
            } else { 
            porcetagemrDesconto = 0.07f;
            totalCarrosSemiNovos++;
            }
            
            totalCarros++; // incremento do carro 
            
            valorDesconto = valorCarro * porcetagemrDesconto;
            valorPagar = valorCarro * valorDesconto;
            
            
            System.out.println("O valor do Desconto foi de " + valorDesconto);
            System.out.println("O valor a pagar é " + valorPagar );
            
            System.out.println("Deseja fazer mais cadastro S/N ?"); //
            desejaRepetir = leitor.next().charAt(0);
            
        }
        
        System.out.println("Total de carros" + totalCarros);
        
        System.out.println("Tital de carros semi-novos" + totalCarrosSemiNovos);
        
        
        
        
    }
}
