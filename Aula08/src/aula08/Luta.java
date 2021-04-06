package aula08;

import java.util.Random;

public class Luta {   

    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    // Métodos públicos
    void marcarLuta(Lutador l1, Lutador l2){
        
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }
        else {
           this.setAprovada(false);
           this.setDesafiado(null);
           this.setDesafiante(null);
        }
    }
    
    void lutar(){
        if (this.getAprovada()){
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            System.out.println("====== RESULTADO DA LUTA ======");
            
            switch(vencedor){
                
                case 0: // Empate
                    System.out.println("Empatou!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                    
                case 1: // Desafiado vence
                    System.out.println("O " + this.getDesafiado().getNome() + " ganhou");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                    
                case 2: // Desafiante vence
                    System.out.println("O " + this.getDesafiante().getNome() + " ganhou");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }
            
             System.out.println("===============================");
        }
        else {
            System.out.println("A luta não pode acontecer");
        }
    }
}
