package aula05;
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;   
    
    public ContaBanco(){
        this.saldo = 0.0f;
        this.status = false;          
    }
    
    public void abrirConta(String tipo){
        
        this.setTipo(tipo);  
        this.setStatus(true);
               
        if(this.getTipo().equals("cc")){
            this.setSaldo(50.00f);
        }else 
            if(this.getTipo().equals("cp")){
                this.setSaldo(150.00f);
        }       
    }

   public void fecharConta(){
        
        if(this.getSaldo() == 0.0f && this.getStatus()){
            this.setStatus(false);
        }
    }
   
       public void depositar(float v){       
           
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);             
        }else
            System.out.println("É necessário abrir uma conta");
    }
    
    public void sacar(float v){
      
        if(this.getStatus()){
            if(v < this.getSaldo()){
                this.setSaldo(this.getSaldo() - v);
            }else{
                System.out.println("Não há saldo suficiente para esse saque"); 
            }
        }else{
            System.out.println("Não há uma conta aberta para saques"); 
        }        
    }
    
    public void pagarMensal(){
    
    float valor = 0;
    
        if(this.getTipo().equals("cc")){
            valor = 12.00f;
        }
        else if(this.getTipo().equals("cp")) valor = 20.00f;
    
        if(this.getStatus()){
            if(this.getSaldo() > valor){
                this.setSaldo(getSaldo() - valor);
            }
            else System.out.println("O saldo é insuficiente");
        }        
        else System.out.println("Não há uma conta aberta para pagamentos");       
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
