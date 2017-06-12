package main;

import control.JogoManager;
import exceptions.SenhaInvalidaException;

public class Main {
	public static void main(String[] args) {
		JogoManager jogoManager = new JogoManager();
		Console console = Console.getInstancia();
		String[] tentativa = new String[4];
		
		for(int i = 0; i < 10; i++){
			tentativa = console.getTentativa();
			try {
				if(jogoManager.run(tentativa)){
					console.infoRodada(i + 1);
					console.ganhou();
					break;
				}else{
					console.infoRodada(i + 1);
					console.pinos(jogoManager.pinosBrancoPreto);
				}
				if(i == 9)
					console.perdeu();
			} catch (SenhaInvalidaException e) {
				System.out.println("Entrada Inválida");
				i--;
			}
		}
		
	}
	
}
