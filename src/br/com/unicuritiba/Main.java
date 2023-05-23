package br.com.unicuritiba;

import java.util.Random;
import java.util.Scanner;
import br.com.unicuritiba.model.Jogada;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo ao JokenPo");
		System.out.println();
		
		Jogada[] jogadas = new Jogada[3];
		jogadas[0] = new Jogada("Pedra", 1);
		jogadas[1] = new Jogada("Papel", 2);
		jogadas[2] = new Jogada("Tesoura", 3);
		
		System.out.println("Digite a jogada que deseja: ");
		System.out.println();
		System.out.println("1 = Pedra");
		System.out.println();
		System.out.println("2 = Papel");
		System.out.println();
		System.out.println("3 = Tesoura");
		System.out.println();
		System.out.println("R: ");
		
		
		int jogadorJogadaPosicao = scanner.nextInt();
		int computadorJogadaPosicao = new Random().nextInt(3);

		Jogada jogadaComputador = jogadas[computadorJogadaPosicao];

		if (jogadorJogadaPosicao > 3) {
			System.out.println("Numero inválido, digite um numero entre 1 e 3");
		}

		else if (jogadorJogadaPosicao < 1) {
			System.out.println("Numero inválido, digite um numero entre 1 e 3");
		}
		                           
		//EMPATE
		if (jogadorJogadaPosicao == jogadaComputador.getValor()) {
			System.out.println("Empate!");
		}
		//JOGADOR GANHOU
		else if (jogadorJogadaPosicao != 3 && jogadaComputador.getValor() != 3) {
			
			if (jogadorJogadaPosicao > jogadaComputador.getValor()) {
				System.out.println("Jogador ganhou");
			}
			//COMPUTADOR GANHOU
			else {
				System.out.println("Computador ganhou");
			}
		}
		else {
			
			if(jogadorJogadaPosicao == 3 && jogadaComputador.getValor() == 1) {
				System.out.println("Computador ganhou");
			}else if (jogadorJogadaPosicao == 1 && jogadaComputador.getValor() == 3) {
				System.out.println("Jogador ganhou");
			}else {
				if (jogadorJogadaPosicao > jogadaComputador.getValor()) {
					System.out.println("Jogador ganhou");
				} else {
					System.out.println("Computador ganhou");
				}
			}
		}
		System.out.println("Escolha do computador: " + jogadaComputador.getNome());
		scanner.close();
	}
}
