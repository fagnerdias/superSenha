package model;

public class Resultado {
	
	String[] resultado;
	
	public Resultado(){
		this.resultado = new String[4];
	}
	
	public void setResultado(String[] resultado){
		this.resultado = resultado;
	}
	
	public String[] getResultado(){
		return this.resultado;
	}

}
