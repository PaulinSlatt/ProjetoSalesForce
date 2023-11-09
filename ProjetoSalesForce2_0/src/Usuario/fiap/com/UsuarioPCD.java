package Usuario.fiap.com;

import java.util.Random;

public class UsuarioPCD extends Usuario{
	 
	private boolean isPCD;
	   //public UsuarioPCD(){
	    	
	    //}
	 
	    public UsuarioPCD(String nome, String email, long cpf, boolean isPCD) {
	        super(nome, email, cpf);
	        
	        this.isPCD = isPCD;
	    }

	    public boolean isPCD() {
	        return isPCD;
	    }

	    public void setPCD(boolean PCD) {
	        isPCD = PCD;
	    }

	    

	    
	    @Override
	    public String toString() {
	        return "UsuarioPCD [nome=" + getNome() + ", email=" + getEmail() + ", cpf=" + getCpf() + ", senha=" + ", isPCD=" + isPCD + "]";
	    }
	    
	    public void feedback(String mensagem) {
	    	//metodo para pessoas pcd darem feedback sobre acessibilidade
	    	System.out.println("Obrigado por fornecer seu feedback:\n" + mensagem);
	    	    }

	    	}

		
	    
	
