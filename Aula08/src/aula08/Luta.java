package aula08;

public class Luta {

    // Atributos
    private String desafiado;
    private String desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos especiais

    Luta(){
        this.setDesafiado(this.desafiado);
        this.setDesafiante(this.desafiante);
        this.setRounds(this.rounds);
    }

    private String getDesafiado(){
        return this.desafiado;
    }

    private void setDesafiado(String desafiado){
        this.desafiado = desafiado;
    }

    private String getDesafiante(){
        return this.desafiante;
    }

    private void setDesafiante(String desafiante){
        this.desafiante = desafiante;
    }

    private int getRounds(){
        return this.rounds;
    }

    private void setRounds(Stirng rnd){
        this.rounds = rnd;
    }

    private boolean getAprovada(){
        return this.aprovada;
    }

    private void setAprovada(boolean apv){
        this.aprovada = apv;
    }
}
