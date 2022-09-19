
package Heranca;

import java.util.Date;

public class App {
    
  

    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
       
       v.setNome("Carlos");
       v.setCpf("06425635814");
       v.setSalario(3.000f);
       v.setDataNascimento(new Date());
       v.setComisaoPorItem(10.0f);
       v.setTotalItensVendidos(10);
       
       
        System.out.println("O salario do vendedor é"  + v.calcularSlario());
       
        
        Motorista m = new Motorista();
      
        m.setNome("Mario");
        m.setDataNascimento(new Date());
        
    }
}
