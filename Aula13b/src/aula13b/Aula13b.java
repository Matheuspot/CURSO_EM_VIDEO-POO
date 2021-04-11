package aula13b;

public class Aula13b {
   
    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        
        System.out.println("====== Reações por frase ======");
        c.reagir("Toma comida");
        c.reagir("Olá");
        c.reagir("Qualquer coisa diferente");
        
        System.out.println("\n ====== Reações por hora e minuto ======");
        c.reagir(11, 59);
        c.reagir(18,00);
        c.reagir(17,00);
        
        System.out.println("\n ====== Reações por dono ======");
        c.reagir(true);
        c.reagir(false);
        
        System.out.println("\n ====== Reações por idade e peso ======");
        c.reagir(2, 12.5f);
        c.reagir(4, 9.9f);
        c.reagir(17, 4.5f);    
        c.reagir(17, 11.5f);   
    }
    
}
