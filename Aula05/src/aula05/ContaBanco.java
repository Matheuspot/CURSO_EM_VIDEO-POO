package aula05;
public class ContaBanco {
    
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;   
    
    // Métodos personalizados    
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: "    + this.getNumConta());
        System.out.println("Tipo: "     + this.getTipo());
        System.out.println("Dono: "     + this.getDono());
        System.out.println("Saldo: "    + this.getSaldo());
        System.out.println("Status: "   + this.getStatus());
    }
    
    
    public void abrirConta(String tipo){
        
        this.setTipo(tipo);  
        this.setStatus(true);
               
        if (this.getTipo().equals("CC")){
            this.setSaldo(50.00f);
        }else 
            if(this.getTipo().equals("CP")){
                this.setSaldo(150.00f);
        }
        System.out.println(this.getDono() + " sua conta foi aberta com sucesso!");
    }

   public void fecharConta(){
       
       if (this.getSaldo() > 0){
           System.out.println("Conta com dinheiro!");
       }
       else if (this.getSaldo() < 0){
           System.out.println("A conta em débito!");
       }
       else{ 
           this.setStatus(false);
            System.out.println(this.getDono() + " sua conta foi fechada com sucesso!"); 
       }  
       
    }
   
    public void depositar(float v){       
           
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);     
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
        else
            System.out.println("Impossível depositar em uma conta fechada!");        
        
    }
    
    public void sacar(float v){
      
        if (this.getStatus()){
            if (v <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado de R$" + v + " na conta de " + this.getDono());
            }
            else
                System.out.println("Não há saldo suficiente para esse saque");           
        } 
        else
            System.out.println("Impossível sacar de uma conta fechada!"); 
        
    }
    
    public void pagarMensal(){
    
    float valor = 0;
    
        if (this.getTipo().equals("CC")){
            valor = 12.00f;
        }
        else if(this.getTipo().equals("CP")) valor = 20.00f;
    
        if(this.getStatus()){
            if(this.getSaldo() > valor){
                this.setSaldo(getSaldo() - valor);
            }
            else System.out.println("O saldo é insuficiente");
        }        
        else System.out.println("Não há uma conta aberta para pagamentos");       
    }  
    
    // Métodos especiais
    public ContaBanco(){
        this.saldo = 0.0f;
        this.status = false;          
    }
    
    public int getNumConta(){
        return this.numConta;
    } 
    
    void setNumConta(int n){
        this.numConta = n;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    void setTipo(String t){
        this.tipo = t;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    void setDono(String d){
        this.dono = d;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    void setSaldo(float s){
        this.saldo = s;
    } 

    public boolean getStatus(){
        return this.status;
    }
    
    void setStatus(boolean s){
        this.status = s;
    }
}
