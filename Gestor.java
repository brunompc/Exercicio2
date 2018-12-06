
package empresaxpto.p2;

public class Gestor extends FuncionarioComTarefas {
    
    public Gestor(String nome, int salarioBase) {
        super(nome, salarioBase);
    }
    
    double calcularSalario(String mes) {
        int nrTarefasGeridas = 0;
        for(Tarefa tarefa : tarefas) {
            String mesTarefa = tarefa.getMes();
            if(mesTarefa.equals(mes)) {
                nrTarefasGeridas++;
            }
        }
        return salarioBase + 0.5 * nrTarefasGeridas;
    }
    
}
