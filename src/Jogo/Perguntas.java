package Jogo;

class Perguntas{
	String[] perguntas = {
			"Como devemos lidar com lixo que produzimos no carro?",
			"Qual desses itens demoram mais tempo para decompor?",
			"A drestui��o do meio ambiente...",
			"Qual a Forma correta de descartar lixo eletr�nico?",
			"Qual lata serve para a reciclagem de papel?",
			"Que tipos de materiais podem ser reciclados?",
			"D� para reciclar mat�ria org�nica?",
			"O que � a reciclagem?",
			"Quais s�o os principais benef�cios da reciclagem?",
			"L�mpadas podem ser recicladas no ecoponto verde?"
		
			
	};
	String[][] escolhas = {
			{"Deixar uma sacola no carro para colocar o lixo.","Jogar pela janela do carro.","Deixar o lixo espalhado no carro.","Jogar em outro carro."},
			{"Jornal","Chiclete","Papel�o","Pneu"},
			{"Afeta apenas a vida dos seres humanos.","N�o afeta a vida de ningu�m.","Afeta apenas a vida dos animais.","Afeta a vida de todos os seres vivos."},
			{"lixo","Rio","Ecopontos","Lata de lixo Recicl�vel"},
			{"Azul","Verde","Amarelo","Marrom"},
			{"metal, o vidro, o pl�stico e o papel","Legumes, verduras, frutas e hortali�as","Papel, papel�o, guardanapo e folhas","Metal, papel, pano e madeira"},
			{"Sim, � poss�vel reutilizar mat�ria org�nica","Sim, pois a mat�ria org�nica pode servir de alimento","Sim, por meio de compostagem","N�o, pois n�o � poss�vel fazer a compostagem"},
			{"Processo de alimenta��o por compostagem","Processo de transforma��o dos materiais","Nome dado ao ciclo de compostagem","Processo de reutiliza��o"},
			{"Evita agress�es ao solo, ar e �gua","Evita a produ��o de novos produtos;","Redu��o da acumula��o de res�duos","Todas as anteriores"},
			{"N�o, pois cont�m merc�rio","Sim, pois vidro � recicl�vel","N�o, pois vidro n�o � recicl�vel","Sim, pois vai iluminar o lixo"}
			
						  	};
	char[] respostas = {
			'A',
			'D',
			'D',
			'C',
			'A',
			'A',
			'C',
			'B',
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
	

