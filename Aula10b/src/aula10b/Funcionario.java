package aula10b;

public class Funcionario extends Pessoa {
    
    private String setor;
    private boolean trabalhando;
    
    // Métodos
    void mudarTrabalho(){
        
        if (this.getTrabalhando()){
            this.setTrabalhando(false);
        }
        else this.setTrabalhando(true);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
    
    
    
}
