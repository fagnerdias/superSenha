package control;

import java.util.Vector;

import exceptions.SenhaInvalidaException;

public class JogoManager {
	private SenhaManager senhaManager;
	private TentativaManager tentativaManager;
	public Vector<String> pinosBrancoPreto;
		
	public JogoManager(){
		this.senhaManager = new SenhaManager();
		this.tentativaManager = new TentativaManager();
		this.pinosBrancoPreto = new Vector<String>(4);
	}
	
	private boolean verificaSenha(){
		return (senhaManager.getSenha().getSenha()[0].equals(tentativaManager.tentativa.getTentativa()[0])) && (senhaManager.getSenha().getSenha()[1].equals(tentativaManager.tentativa.getTentativa()[1])) && (senhaManager.getSenha().getSenha()[2].equals(tentativaManager.tentativa.getTentativa()[2])) && (senhaManager.getSenha().getSenha()[3].equals(tentativaManager.tentativa.getTentativa()[3]));		
	}
	
	private void definePinosBrancoPreto(){
		String[] senha = senhaManager.getSenha().getSenha();
		String[] tentativa = tentativaManager.tentativa.getTentativa();
		
		for(int i = 0; i < 4; i++){
			if(tentativa[i].equals(senha[i])){
				pinosBrancoPreto.add("preto");
			}
		}
		
		if(pinosBrancoPreto.size() == 4)
			return;
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				if(senha[i].equals(tentativa[j]) && i != j){
					pinosBrancoPreto.add("branco");
				}
			}
		}
		
		for(; pinosBrancoPreto.size() < 4; )
			pinosBrancoPreto.add("nenhum");
		
	}
	public boolean run(String[] tentativa) throws SenhaInvalidaException{
		this.pinosBrancoPreto.clear();
		this.tentativaManager.setTentativa(tentativa);
		
		if(this.verificaSenha()) 
			return true;
		else{
			this.definePinosBrancoPreto();
			return false;
		}
	}

}
