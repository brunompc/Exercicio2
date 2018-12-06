
package empresaxpto.p2;

public class TecnicoInformatico extends Funcionario {
    
    TecnicoInformatico(String nome, int salarioBase) {
        super(nome, salarioBase);
    }
 
    @Override
    double calcularSalario(String mes) {
        return salarioBase;
    }
    
}
