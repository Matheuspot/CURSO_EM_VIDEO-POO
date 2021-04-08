package aula10b;

public class Aula10b {
   
    public static void main(String[] args) {
        
       // Instanciando pessoas
       Pessoa      p1 = new Pessoa();
       Aluno       p2 = new Aluno();
       Professor   p3 = new Professor();
       Funcionario p4= new Funcionario();
       
       // Atribuindo valores
       p1.setNome("Matheus");
       p1.setIdade(24);
       p1.setSexo("Masculino");

       p2.setNome("Maria");
       p2.setIdade(20);
       p2.setSexo("Feminino");
       
       p3.setNome("Claúdio");
       p3.setIdade(30);
       p3.setSexo("Masculino");
       
       p4.setNome("Fabiana");
       p3.setIdade(19);
       p3.setSexo("Feminino");
       
       System.out.println(p1.toString());
       System.out.println(p2.toString());
       System.out.println(p3.toString());
       System.out.println(p4.toString());
       
       p2.setCurso("Informática");
       p3.setSalario(2500.75f);
       p4.setSetor("Estoque");
       
       p3.receberAumento(550.20f);
       p4.mudarTrabalho();
       p2.cancelarMatr();
    
       
       
    }
    
}
