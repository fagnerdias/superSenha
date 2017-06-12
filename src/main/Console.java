package main;

import java.util.Scanner;
import java.util.Vector;

public class Console {
	private static Console instancia;
	private Scanner scanEntrada = new Scanner(System.in);
	
	public static Console getInstancia() {
		if (Console.instancia == null) 
			Console.instancia = new Console();
		return Console.instancia;
	}
	
	public String[] getTentativa(){
		String[] senha = new String[4];
		
		System.out.println("Informe uma senha com 4 cores.");
		for (int i = 0; i < 4; i++){
			System.out.println("Falta informar " + (4 - i) + " pinos.");
			senha[i] = scanEntrada.nextLine();
		}
		return senha;
	}
	
	public void infoRodada(int rodada){
		System.out.println("Rodada atual " + rodada + " de 10 rodadas.");
	}
	
	public void ganhou(){
		System.out.println("Parabens você ganhou.");
	}
	
	public void perdeu(){
		System.out.println("Infelizmente você perdeu.\n Tente novamente.");
	}
	
	public void pinos(Vector<String> pinos){
		System.out.println("Resposta do Jogo:");
		System.out.println("Pino 1: " + pinos.get(0));
		System.out.println("Pino 2: " + pinos.get(1));
		System.out.println("Pino 3: " + pinos.get(2));
		System.out.println("Pino 4: " + pinos.get(3));
		
	}
}
