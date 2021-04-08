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
        this.paginaAtual = 0;
    }
    
    public int getPaginaAtual(){
        return this.paginaAtual;
    }
    
    void setPaginaAtual(int paginaAtual){
        this.paginaAtual = paginaAtual;
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
        System.out.println(this.getLeitor().getNome()   + ", leitor de sexo " + this.getLeitor().getSexo() + " com " + this.getLeitor().getIdade() 
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
            this.setPaginaAtual(0);
            
            System.out.println("\n====== Livro fechado! =====");
            System.out.println("Você está na página " + this.getPaginaAtual() + "/" + this.getTotPaginas());
            System.out.println("==========================================\n");
        }
        else {
            System.out.println("Não há como fechar um livro que já está fechado.");
        }
    }

    @Override
    public void folhear(int paginaAtual) {     
        if (this.getAberto()){            
            if (paginaAtual > 0 && paginaAtual < this.getTotPaginas()){
                this.setPaginaAtual(paginaAtual);
                System.out.println("\n========  Folhando... ========");
                System.out.println("Foi avançado diretamente para a página " + this.getPaginaAtual() + "/" + this.getTotPaginas());
            }
            else if (paginaAtual <= 0){
                System.out.println("Números iguais ou menores que zero não são permitidos");
            }
            else 
                System.out.println("O número " + paginaAtual + " inserido é maior que o número total de páginas " + this.getTotPaginas());
        }
        else    
            System.out.println("O livro precisa estar aberto para ser folheado.");
    }

    @Override
    public void avancarPag() {        
        if (this.getAberto()){
            if (this.getPaginaAtual() < this.getTotPaginas()){
                this.setPaginaAtual(this.getPaginaAtual() + 1);
                System.out.println("\n====== Foi avançada uma página ======");
                System.out.println("Você está na página " + this.getPaginaAtual() + "/" + this.getTotPaginas()); 
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
            if (this.getPaginaAtual() > 1){
                this.setPaginaAtual(this.getPaginaAtual() - 1);
                System.out.println("\n====== Foi voltada uma página ======");
                System.out.println("Você está na página " + this.getPaginaAtual() + "/" + this.getTotPaginas());  
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
