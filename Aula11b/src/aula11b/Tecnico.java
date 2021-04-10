package aula11b;

public class Tecnico extends Aluno{
    
    private boolean registroProfissional;    
    
    void praticar(){
        if (this.getRegistroProfissional()) {
            System.out.println("Pode praticar, registro profissional ativo");
        }
        else System.out.println("Não pode praticar, registro profissional inativo");    
    }

    public boolean getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(boolean registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Técnico {" + "Nome = " + this.getNome() + " Situação do registro profissional = " + registroProfissional + '}';
    }
    
    
}
