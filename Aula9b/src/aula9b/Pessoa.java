package aula9b;

public class Pessoa {
    
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    // Métodos especiais
    Pessoa(String nm, int ide, String sx){        
        this.setNome(nm);
        this.setIdade(ide);
        this.setSexo(sx);       
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    // Métodos especiais    
    void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    } 
    
}
