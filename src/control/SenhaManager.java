package control;

import java.util.Random;
import java.util.Vector;

import model.Senha;

public class SenhaManager {
	public Senha senha;
	
	public SenhaManager(){
		this.senha = new Senha();
		this.senha.setSenha(this.gerarSenha());		
	}
	
	/**
	 * Funcao responsavel por gerar uma string representando a senha, contendo quatro cores validas
	 * @return Array de cores que forma a nova senha
	 */
	private String[] gerarSenha(){
		Vector<String> cores = new Vector<String>();
		cores.add("vermelho");
		cores.add("azul");
		cores.add("rosa");
		cores.add("amarelo");
		cores.add("roxo");
		cores.add("verde");
		cores.add("cinza");
		cores.add("laranja");
				
		String[] senha= new String[4];
		int pos = 0;
		
		Random gerador = new Random();
		for(int i = 0; i < 4; i++){
			pos = gerador.nextInt(cores.size());
			senha[i] = cores.get(pos);
			cores.remove(pos);
		}
		return senha;
	}
	
	public Senha getSenha(){
		return this.senha;
	}
}
