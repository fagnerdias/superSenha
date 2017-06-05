package control;

import java.util.Random;

import model.Senha;

public class SenhaManager {
	Senha senha;
	String[] cores;
	
	
	
	public SenhaManager(){
		this.senha = new Senha();
		this.cores = new String[3];
		this.cores[0] = "vermelho";
		this.cores[1] = "verde";
		this.cores[2] = "amarelo";
		this.cores[3] = "roxo";
	}
	
	public Senha getSenha(){
		return this.senha;
	}
	
	public String[] gerarSenha(){
		Random gerador = new Random();
		for(int i =0; i < 4; i++){
			senha.getSenha()[i] = this.cores[gerador.nextInt(4)];
		}
		return senha.getSenha();
	}
}
