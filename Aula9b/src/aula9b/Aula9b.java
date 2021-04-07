package aula9b;

public class Aula9b {
    public static void main(String[] args) {
        
        // Instânciando livros
        Livro[] lvr = new Livro[2];
        lvr[0] = new Livro("A menina que roubava livros", "Markus Zusak", 5);
        lvr[1] = new Livro("Cartas de um diabo a seu aprendiz","C. S. Lewis", 208);
        
        // Instânciando pessoas
        Pessoa[] person = new Pessoa[2];
        person[0] = new Pessoa("Matheus", 24, "Masculino");
        person[1] = new Pessoa("Haaland", 20, "Masculino");
        
        // Atribuindo leitor e livro 1
        lvr[0].setLeitor(person[0]);
        lvr[0].detalhes();
        lvr[0].abrir();
        lvr[0].avancarPag();
        lvr[0].avancarPag();
        lvr[0].avancarPag();
        lvr[0].avancarPag();    
        lvr[0].fechar();       
         person[0].fazerAniver();
        lvr[0].detalhes();
        
        
        //Atribuindo leitor e livro 2
        lvr[1].setLeitor(person[1]);
        lvr[1].detalhes();
       //   person[1].fazerAniver();
      //  lvr[1].detalhes();
    }    
}
