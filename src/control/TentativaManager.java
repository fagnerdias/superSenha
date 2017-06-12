package control;

import exceptions.SenhaInvalidaException;
import model.Tentativa;

public class TentativaManager {
	public Tentativa tentativa;
	
	public TentativaManager(){
		this.tentativa = new Tentativa();
	}
	/**
	 * 
	 * @param tentativa
	 * @throws SenhaInvalidaException
	 */
	public void setTentativa(String tentativa[]) throws SenhaInvalidaException{
		if(this.senhaValida(tentativa))
			this.tentativa.setTentativa(tentativa);
		else
			throw new SenhaInvalidaException();		
	}
	
	/**
	 * Verifica se a senha e valida
	 * @param tentativa
	 * @return True  : Se a senha e valida
	 * @return False : Se a senha nao e valida
	 */
	public boolean senhaValida(String tentativa[]){
		if (tentativa.length != 4)
			return false;
		for(int i = 0; i < 4; i++){
			if(!this.corValida(tentativa[i]))
				return false;
			
			for(int j = i + 1; j < 4; j++){
				if(tentativa[i] == tentativa[j])
					return false;
			}
		}
		return true;	
	}
	
	/**
	 * Verifica se a cor passada por parametro e validade
	 * @param senhaCor
	 * @return True : se for valida
	 * @return False : se for invalida
	 */
	public boolean corValida(String pinoCor){
		return pinoCor.equals("vermelho") || pinoCor.equals("azul") || pinoCor.equals("rosa") || pinoCor.equals("amarelo")
					|| pinoCor.equals("roxo") || pinoCor.equals("verde") || pinoCor.equals("cinza") || pinoCor.equals("laranja");
	}

}
