package aula08;
public class Aula08 {
    public static void main(String[] args) {
       Lutador[] lu = new  Lutador[6];
       lu[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
       lu[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
       lu[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
       lu[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
       lu[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
       lu[5] = new Lutador("Nerdart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

       Luta UEC01 = new Luta();
       UEC01.marcarLuta(lu[0], lu[1]);
       UEC01.lutar();
       lu[0].status();
       lu[1].status();
       


    }   
}
