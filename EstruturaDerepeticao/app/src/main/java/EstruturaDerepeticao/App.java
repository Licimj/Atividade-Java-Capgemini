
package EstruturaDerepeticao;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        
        
        
        
        String nomePorduto;
        float precoVenda;
        float precoCusto;
        float totalCusto = 0.0f;
        float totalVenda =0.0f;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        int i = 0;
        for (; i < 3; i++) {
            
            System.out.println("Digite o nome do produto");
            
            nomePorduto = leitorScanner.nextLine();
            
             System.out.println("Digite o preço de custo");
            
            precoCusto = leitorScanner.nextFloat();
            
             System.out.println("Digite o preço de venda do produto");
            
            precoVenda = leitorScanner.nextFloat();
            
            
            totalCusto = totalCusto + precoCusto;
            
            totalVenda = totalVenda + precoVenda;
            
            
            if (precoCusto == precoVenda){
                System.out.println("houve empate enre preço de custo e de venda");}
            else{ 
            if(precoCusto > precoVenda){
                System.out.println("houve prejuizo ");}
            
             else{ System.out.println("houve lucro");
            }
            
           
            
        }
        
            System.out.println(nomePorduto +" preço de custo" + precoCusto + "preço venda = " + precoVenda);
        }
        
        System.out.println("A media preço de custo é" + (totalCusto/i));
        System.out.println("A media do preco de venda é" +(totalVenda/i));
        
    }
}
       
