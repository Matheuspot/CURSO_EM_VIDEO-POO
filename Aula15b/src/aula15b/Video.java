package aula15b;

public class Video implements AcoesVideo {
    
    // Atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    // Método
    public String getVideo() {
        return titulo;
    }

    // Métodos especiais
    public Video(String titulo) {
        this.setTitulo(titulo);
        this.avaliacao = 1;
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        
        int nova;
        nova = (int)((this.avaliacao + avaliacao) / this.getViews());
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if (!this.getReproduzindo()) {
            this.setReproduzindo(true);
            System.out.println("Vídeo em reprodução");
        } 
        else {
            System.out.println("O vídeo já está em reprodução");
        }
    }

    @Override
    public void pause() {
        if (this.getReproduzindo()) {
            this.setReproduzindo(false);
            System.out.println("Vídeo em pausa");
        }
        else {
            System.out.println("O vídeo já está em pausa");
        }
        
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }   

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", "
                        + "avaliacao=" + avaliacao 
                        + ", views=" + views + ", "
                        + "curtidas=" + curtidas 
                        + ", reproduzindo=" + reproduzindo + '}';
    }    
}
