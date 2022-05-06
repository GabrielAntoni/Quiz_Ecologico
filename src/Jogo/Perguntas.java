package Jogo;

class Perguntas{
	String[] perguntas = {
			"Como devemos lidar com lixo que produzimos no carro?",
			"Qual desses itens demoram mais tempo para decompor?",
			"A drestuição do meio ambiente...",
			"Qual a Forma correta de descartar lixo eletrônico?",
			"Qual lata serve para a reciclagem de papel?"
			
	};
	String[][] escolhas = {
			{"Deixar uma sacola no carro para colocar o lixo.","Jogar pela janela do carro.","Deixar o lixo espalhado no carro.","Jogar em outro carro."},
			{"Jornal","Chiclete","Papelão","Pneu"},
			{"Afeta apenas a vida dos seres humanos.","Não afeta a vida de ninguém.","Afeta apenas a vida dos animais.","Afeta a vida de todos os seres vivos."},
			{"lixo","Rio","Ecopontos","Lata de lixo Reciclável"},
			{"Azul","Verde","Amarelo","Marrom"}
			
						  	};
	char[] respostas = {
			'A',
			'D',
			'D',
			'C',
			'A'
			   
	};
	
	char UsuarioResposta;
	char resposta;
	int Index;
	int RespostaCorreta = 0;
	int TotaldePerguntas = perguntas.length;
	int resultado;
}
	

