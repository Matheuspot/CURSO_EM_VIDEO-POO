package aula11b;

public class Aula11b {   
    public static void main(String[] args) {
       // Pessoa p1 = new Pessoa();
       /*Visitante v1 = new Visitante();
       v1.setNome("Juvenal");
       v1.setIdade(22);
       v1.setSexo("M");
       System.out.println(v1.toString());*/
       Aluno a1 = new Aluno();
       a1.setNome("Cláudio");
       a1.setMatricula(1111);
       a1.setCurso("Informática");
       a1.setIdade(16);
       a1.setSexo("M");
       a1.pagarMensalidade();
       
       Bolsista b1 = new Bolsista();
       b1.setMatricula(1112);
       b1.setNome("Jubileu");
       b1.setBolsa(12.5f);
       b1.setSexo("M");
       b1.pagarMensalidade();
       
       Tecnico t1 = new Tecnico();
       t1.setMatricula(1112);
       t1.setNome("Jubileu");      
       t1.setSexo("M");
       t1.pagarMensalidade();
       t1.praticar();
       t1.setRegistroProfissional(true);
       t1.praticar();
       System.out.println(t1.toString());
       
       Visitante v1 = new Visitante();      
       v1.setNome("Matheus");      
       v1.setSexo("M");   
       v1.setIdade(24);
       System.out.println(v1.toString());
     
       Professor p1 = new Professor();      
       p1.setNome("Tombi");      
       p1.setSexo("M");   
       p1.setIdade(40);       
       p1.receberAumento(100);
       p1.receberAumento(20);
       System.out.println(p1.toString());
       
      
       
    }
    
}
