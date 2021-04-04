package aula06;

public class ControleRemoto implements  Controlador {
    
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Métodos especiais
    ControleRemoto(){
        volume = 50;
        ligado = true;
        tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // Métodos Abstratos

    @Override
    public void ligar() {
        if(!getLigado()){
            this.setLigado(true);
        }
    }

    @Override
    public void desligar() {
        if(getLigado()){
            this.setLigado(false);
        }        
    }

    @Override
    public void abrirMenu() {
        
        if (!this.getLigado()) return;
        
            System.out.println("-- MENU --");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocanso? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
        
        for (int i = 0; i <= this.getVolume(); i += 10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
           this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossível diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
       if (this.getLigado() && this.getVolume() > 0){
           this.setVolume(0);
       } 
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        } else {
            System.out.println("Não foi possível reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Não foi possível pausar");
        }
    }   
}
