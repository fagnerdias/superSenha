package model;

public class Senha {
	
	String[] senha;
	
	public Senha(){
		this.senha = new String[4];
	}
	
	public String[] getSenha(){
		return this.senha;
	}
	
	public void setSenha(String[] senha){
		this.senha = senha;
	}

}
