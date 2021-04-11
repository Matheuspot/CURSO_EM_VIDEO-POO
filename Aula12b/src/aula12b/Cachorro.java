package aula12b;

public class Cachorro extends Mamifero {
    
    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }
    
    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }
    
    public void setMembros(int membros) {
        this.membros = membros;
    }
}
