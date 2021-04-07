package aula9b;

public class Livro implements Publicacao {
    
    // Atributos     
    private String titulo;
    private String autor;
    private int totPaginas;
    private boolean aberto;
    private Pessoa leitor;
    private int paginaAtual;
    
    // Métodos especiais    
    Livro(String title, String author, int totPg){
        
        this.setTitulo(title);
        this.setAutor(author);
        this.setTotPaginas(totPg);
        this.setAberto(false);    
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    // Métodos públicos    
    void detalhes() {
        
        System.out.println("====== Descrição do Livro ======");
        System.out.println("Título do Livro: "          + this.getTitulo());
        System.out.println("Autor do Livro: "           + this.getAutor());
        System.out.println("Qtd. de Páginas: "          + this.getTotPaginas());
        System.out.println(this.getLeitor().getNome()   + ", leitor com " + this.getLeitor().getIdade() 
                                                        + " anos de idade está lendo o livro \"" 
                                                        + this.getTitulo() +"\"");
        System.out.println("==========================================");
    
    }
    
    // Métodos abstratos
    
    @Override
    public void abrir() {        
        if (this.getTotPaginas() > 0){
            if (!this.getAberto()){
                this.setAberto(true);                
                this.paginaAtual = 1;
                System.out.println("\n====== Livro aberto! =====");
                System.out.println("Você está na página " + this.paginaAtual + "/" + this.getTotPaginas());
                 System.out.println("==========================================\n");
            } 
            else {
                System.out.println("Não há como abrir um livro que já está aberto.");
            }        
        } 
        else {
            System.out.println("Isso é mesmo um livro? Não há páginas!");
        }        
    }

    @Override
    public void fechar() {        
        if (this.getAberto()){
            
            this.setAberto(false);
            this.paginaAtual = 0;
            
            System.out.println("\n====== Livro fechado! =====");
            System.out.println("Você está na página " + this.paginaAtual + "/" + this.getTotPaginas());
            System.out.println("==========================================\n");
        }
        else {
            System.out.println("Não há como fechar um livro que já está fechado.");
        }
    }

    @Override
    public void folhear() {     
        if (this.getAberto()){
            System.out.println("Você está na página " + this.paginaAtual + "/" + this.getTotPaginas());
        }       
    }

    @Override
    public void avancarPag() {        
        if (this.getAberto()){
            if (this.paginaAtual < this.getTotPaginas()){
                this.paginaAtual++;
                System.out.println("\n====== Foi avançada uma página ======");
                this.folhear();   
            } 
            else {
                System.out.println("\nVocê está na última página!\n");
            } 
        } 
        else{
            System.out.println("Abra o livro para poder avançar as páginas");
        } 
    }

    @Override
    public void voltarPag() {
        if (this.getAberto()){
            if (this.paginaAtual > 1){
                this.paginaAtual--;
                System.out.println("\n====== Foi voltada uma página ======");
                this.folhear();   
            } 
            else {
                System.out.println("\nVocê está primeira página\n");
            } 
        } 
        else{
            System.out.println("Abra o livro para poder avançar as páginas");
        } 
    }   
}
