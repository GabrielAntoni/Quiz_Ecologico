package Jogo;

class Perguntas{
	String[] perguntas = {
			"Como devemos lidar com lixo que produzimos no carro?",
			"Qual desses itens demoram mais tempo para decompor?",
			"A drestuição do meio ambiente...",
			"Qual a Forma correta de descartar lixo eletrônico?",
			"Qual lata serve para a reciclagem de papel?",
			"Que tipos de materiais podem ser reciclados?",
			"Dá para reciclar matéria orgânica?",
			"O que é a reciclagem?",
			"Quais são os principais benefícios da reciclagem?",
			"Lâmpadas podem ser recicladas no ecoponto verde?"
		
			
	};
	String[][] escolhas = {
			{"Deixar uma sacola no carro para colocar o lixo.","Jogar pela janela do carro.","Deixar o lixo espalhado no carro.","Jogar em outro carro."},
			{"Jornal","Chiclete","Papelão","Pneu"},
			{"Afeta apenas a vida dos seres humanos.","Não afeta a vida de ninguém.","Afeta apenas a vida dos animais.","Afeta a vida de todos os seres vivos."},
			{"lixo","Rio","Ecopontos","Lata de lixo Reciclável"},
			{"Azul","Verde","Amarelo","Marrom"},
			{"metal, o vidro, o plástico e o papel","Legumes, verduras, frutas e hortaliças","Papel, papelão, guardanapo e folhas","Metal, papel, pano e madeira"},
			{"Sim, é possível reutilizar matéria orgânica","Sim, pois a matéria orgânica pode servir de alimento","Sim, por meio de compostagem","Não, pois não é possível fazer a compostagem"},
			{"Processo de alimentação por compostagem","Processo de transformação dos materiais","Nome dado ao ciclo de compostagem","Processo de reutilização"},
			{"Evita agressões ao solo, ar e água","Evita a produção de novos produtos;","Redução da acumulação de resíduos","Todas as anteriores"},
			{"Não, pois contém mercúrio","Sim, pois vidro é reciclável","Não, pois vidro não é reciclável","Sim, pois vai iluminar o lixo"}
			
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
	

