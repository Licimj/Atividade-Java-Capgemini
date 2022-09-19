
package Heranca;

import Heranca.Funcionario;
import java.util.Date;

public class Vendedor extends Funcionario {
    
    //Atributos
    private int totalItensVendidos;
    private float comisaoPorItem;
            
    
    
    //Metedo construtor 
    public Vendedor(){
     super();} // esse super é para ter os atributos do funcionario 
    
    
    
    public float calcularSlario(){
    
    return super.getSalario() + (this.comisaoPorItem + totalItensVendidos);
    
    
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComisaoPorItem() {
        return comisaoPorItem;
    }

    public void setComisaoPorItem(float comisaoPorItem) {
        this.comisaoPorItem = comisaoPorItem;
    }

   
    
    
    
    
}

