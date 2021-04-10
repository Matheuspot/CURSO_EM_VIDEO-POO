package aula11b;

public class Professor extends Pessoa {
     
     private String especialidade;
     private float salario;
     
     void receberAumento(float aumento) { 
         
        if (aumento > 0) {
            float antesAumento = this.getSalario();
            this.setSalario(this.getSalario() + aumento);
            System.out.println("Salário aumentado de " + antesAumento 
                                                       + " para " + this.getSalario());
        }
        else System.out.println("É necessário especificar um aumento maior que zero");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor {" + "especialidade = " + especialidade + ", salario = " + salario + '}';
    }
    
    
}
