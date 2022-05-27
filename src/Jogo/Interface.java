package Jogo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Interface implements ActionListener{
	int resultado;
	int RC;
	int TP;
	int LAP=950;
	int Segundos;
	int Minutos;

	
	Perguntas Perguntas = new Perguntas();
	JFrame Frame = new JFrame("Quiz Ecologico");
	JTextArea textoTitulo = new JTextArea();
	JButton ButtonIniciar = new JButton();
	JTextArea TituloSobre = new JTextArea();
	JTextArea textoSobre = new JTextArea();
	JButton ButtonSobre = new JButton();
	JTextArea TituloCreditos = new JTextArea();
	JTextArea TextoCreditosAluno= new JTextArea();
	JTextArea TextoCreditosRA= new JTextArea();
	JTextArea TextoCreditosTurma= new JTextArea();
	JButton ButtonCreditos = new JButton();
	JButton ButtonOpcoes = new JButton();
	JButton ButtonSair = new JButton();
	JTextField textosuperiorPergunta = new JTextField();
	JTextArea textoareaPergunta = new JTextArea();
	JButton ButtonA = new JButton();
	JButton ButtonB = new JButton();
	JButton ButtonC = new JButton();
	JButton ButtonD = new JButton();
	JTextArea textoEscala = new JTextArea();
	JButton ButtonEscala1 = new JButton();
	JButton ButtonEscala2 = new JButton();
	JButton ButtonDesistir = new JButton();
	JLabel RespostaLabelA = new JLabel();
	JLabel RespostaLabelB = new JLabel();
	JLabel RespostaLabelC = new JLabel();
	JLabel RespostaLabelD = new JLabel();
	JLabel RespostaTextoIniciar = new JLabel();
	JLabel RespostaTextoSobre = new JLabel();
	JLabel RespostaTextoCredito = new JLabel();
	JLabel RespostaTextoSair = new JLabel();
	JLabel TextoCronometro = new JLabel();
	JTextArea textoResultado = new JTextArea();
	JTextField NumeroResultadoPorcentagem = new JTextField();
	JTextField NumeroResultado = new JTextField();
	JButton ButtonVoltarMenu = new JButton();
	public Interface(){
		
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setUndecorated(false);
		Frame.setSize(950,650);
		Frame.getContentPane().setBackground(new Color(117, 187, 103));
		Frame.setLayout(null);
		Frame.setResizable(false);
		
		textoTitulo.setBounds(320,30,950,50);
		textoTitulo.setBackground(new Color(117, 187, 103));
		textoTitulo.setForeground(new Color(141, 95, 19));
		textoTitulo.setFont(new Font("verdana",Font.BOLD,40));
		textoTitulo.setEditable(false);
		textoTitulo.setText("Quiz Ecologico");
		
		
		ButtonIniciar.setBounds(400,120,170,50);
		ButtonIniciar.setFont(new Font("verdana",Font.BOLD,20));
		ButtonIniciar.setFocusable(false);
		ButtonIniciar.addActionListener(this);
		ButtonIniciar.setText("Iniciar");
		
		ButtonSobre.setBounds(400,220,170,50);
		ButtonSobre.setFont(new Font("verdana",Font.BOLD,20));
		ButtonSobre.setFocusable(false);
		ButtonSobre.addActionListener(this);
		ButtonSobre.setText("Sobre");
		
		TituloSobre.setBounds(398,120,200,50);
		TituloSobre.setBackground(new Color(117, 187, 103));
		TituloSobre.setForeground(new Color(141, 95, 19));
		TituloSobre.setFont(new Font("verdana",Font.BOLD,40));
		TituloSobre.setEditable(false);
		TituloSobre.setText("Sobre");
		
		textoSobre.setBounds(75,205,800,200);
		textoSobre.setLineWrap(true);
		textoSobre.setWrapStyleWord(true);
		textoSobre.setBackground(new Color(9, 174, 81));
		textoSobre.setForeground(new Color(0, 0, 0));
		textoSobre.setFont(new Font("verdana",Font.BOLD,25));
		textoSobre.setBorder(BorderFactory.createBevelBorder(1));
		textoSobre.setEditable(false);
		textoSobre.setText("O quiz ecológico traz uma série de perguntas educativas sobre reciclagem e meio ambiente, visando educar crianças sobre a importância da educação ambiental e a preservação da natureza!");

		
		ButtonCreditos.setBounds(400,320,170,50);
		ButtonCreditos.setFont(new Font("verdana",Font.BOLD,20));
		ButtonCreditos.setFocusable(false);
		ButtonCreditos.addActionListener(this);
		ButtonCreditos.setText("Créditos");
		
		TituloCreditos.setBounds(378,120,200,50);
		TituloCreditos.setBackground(new Color(117, 187, 103));
		TituloCreditos.setForeground(new Color(141, 95, 19));
		TituloCreditos.setFont(new Font("verdana",Font.BOLD,40));
		TituloCreditos.setEditable(false);
		TituloCreditos.setText("Créditos");

		TextoCreditosAluno.setBounds(75,205,300,200);
		TextoCreditosAluno.setLineWrap(true);
		TextoCreditosAluno.setWrapStyleWord(true);
		TextoCreditosAluno.setBackground(new Color(117, 187, 103));
		TextoCreditosAluno.setForeground(new Color(141, 95, 19) );
		TextoCreditosAluno.setFont(new Font("verdana",Font.BOLD,20));
		TextoCreditosAluno.setEditable(false);
		TextoCreditosAluno.setText("Alunos:"
							 +"\nGabriel Souza "
							 +"\nLuiz Sousa"
							 +"\nBeatriz Vieira"
							 +"\nGuilherme leao"
							 +"\nEduardo Almeida");
		TextoCreditosRA.setBounds(450,205,120,200);
		TextoCreditosRA.setLineWrap(true);
		TextoCreditosRA.setWrapStyleWord(true);
		TextoCreditosRA.setBackground(new Color(117, 187, 103));
		TextoCreditosRA.setForeground(new Color(141, 95, 19) );
		TextoCreditosRA.setFont(new Font("verdana",Font.BOLD,20));
		TextoCreditosRA.setEditable(false);
		TextoCreditosRA.setText("     RA:"
							 +"\nN726288 "
							 +"\nN724AD0"
							 +"\nG3533A0"
							 +"\nG3694J5"
							 +"\nG2671E5");
		TextoCreditosTurma.setBounds(700,205,300,200);
		TextoCreditosTurma.setLineWrap(true);
		TextoCreditosTurma.setWrapStyleWord(true);
		TextoCreditosTurma.setBackground(new Color(117, 187, 103));
		TextoCreditosTurma.setForeground(new Color(141, 95, 19) );
		TextoCreditosTurma.setFont(new Font("verdana",Font.BOLD,20));
		TextoCreditosTurma.setEditable(false);
		TextoCreditosTurma.setText("Turma:"
							 +"\nCC2Q04 "
							 +"\nCC2Q04"
							 +"\nCC2Q04"
							 +"\nCC2Q04"
							 +"\nCC3P04");
		
		ButtonOpcoes.setBounds(400,420,170,50);
		ButtonOpcoes.setFont(new Font("verdana",Font.BOLD,20));
		ButtonOpcoes.setFocusable(false);
		ButtonOpcoes.addActionListener(this);
		ButtonOpcoes.setText("Opções");
		
		ButtonSair.setBounds(400,520,170,50);
		ButtonSair.setFont(new Font("verdana",Font.BOLD,20));
		ButtonSair.setFocusable(false);
		ButtonSair.addActionListener(this);
		ButtonSair.setText("Sair");
		
		textoEscala.setBounds(420,260,170,35);
		textoEscala.setBackground(new Color(117, 187, 103));
		textoEscala.setForeground(new Color(141, 95, 19));
		textoEscala.setFont(new Font("verdana",Font.BOLD,30));
		textoEscala.setEditable(false);
		textoEscala.setText("Escala");
		
		ButtonEscala1.setBounds(300,320,150,30);
		ButtonEscala1.setFont(new Font("verdana",Font.BOLD,16));
		ButtonEscala1.setFocusable(false);
		ButtonEscala1.addActionListener(this);
		ButtonEscala1.setText("950 650");
		
		ButtonEscala2.setBounds(500,320,150,30);
		ButtonEscala2.setFont(new Font("verdana",Font.BOLD,16));
		ButtonEscala2.setFocusable(false);
		ButtonEscala2.addActionListener(this);
		ButtonEscala2.setText("1500 800");
		
		textosuperiorPergunta.setBounds(0,0,950,50);
		textosuperiorPergunta.setBackground(new Color(9, 174, 81));
		textosuperiorPergunta.setForeground(new Color(0, 0, 0));
		textosuperiorPergunta.setFont(new Font("verdana",Font.BOLD,25));
		textosuperiorPergunta.setBorder(BorderFactory.createBevelBorder(1));
		textosuperiorPergunta.setHorizontalAlignment(JTextField.CENTER);
		textosuperiorPergunta.setEditable(false);
		
		textoareaPergunta.setBounds(0,50,950,50);
		textoareaPergunta.setLineWrap(true);
		textoareaPergunta.setWrapStyleWord(true);
		textoareaPergunta.setBackground(new Color(9, 174, 81));
		textoareaPergunta.setForeground(new Color(0, 0, 0));
		textoareaPergunta.setFont(new Font("verdana",Font.BOLD,25));
		textoareaPergunta.setBorder(BorderFactory.createBevelBorder(1));
		textoareaPergunta.setEditable(false);
		
		ButtonA.setBounds(10,135,50,40);
		ButtonA.setFont(new Font("verdana",Font.BOLD,19));
		ButtonA.setFocusable(false);
		ButtonA.addActionListener(Acaopergunta);;
		ButtonA.setText("A");
		
		ButtonB.setBounds(10,235,50,40);
		ButtonB.setFont(new Font("verdana",Font.BOLD,19));
		ButtonB.setFocusable(false);
		ButtonB.addActionListener(Acaopergunta);
		ButtonB.setText("B");
		
		ButtonC.setBounds(10,335,50,40);
		ButtonC.setFont(new Font("verdana",Font.BOLD,19));
		ButtonC.setFocusable(false);
		ButtonC.addActionListener(Acaopergunta);
		ButtonC.setText("C");

		ButtonD.setBounds(10,435,50,40);
		ButtonD.setFont(new Font("verdana",Font.BOLD,19));
		ButtonD.setFocusable(false);
		ButtonD.addActionListener(Acaopergunta);;
		ButtonD.setText("D");
		
		ButtonDesistir.setBounds(790,550,130,25);
		ButtonDesistir.setFont(new Font("verdana",Font.BOLD,20));
		ButtonDesistir.setFocusable(false);
		ButtonDesistir.addActionListener(this);
		ButtonDesistir.setText("Desistir");
		
		TextoCronometro.setBounds(400,530,500,60);
		TextoCronometro.setBackground(new Color(117, 187, 103));
		TextoCronometro.setForeground(new Color(70,70,70));
		TextoCronometro.setFont(new Font("verdana",Font.BOLD,30));
		
		RespostaLabelA.setBounds(80,105,900,100);
		RespostaLabelA.setBackground(new Color(117, 187, 103));
		RespostaLabelA.setForeground(new Color(20,140,0) );
		RespostaLabelA.setFont(new Font("verdana",Font.BOLD,20));
		
		
		RespostaLabelB.setBounds(80,205,500,100);
		RespostaLabelB.setBackground(new Color(117, 187, 103));
		RespostaLabelB.setForeground(new Color(20,140,0) );
		RespostaLabelB.setFont(new Font("verdana",Font.BOLD,20));
		
		RespostaLabelC.setBounds(80,305,500,100);
		RespostaLabelC.setBackground(new Color(117, 187, 103));
		RespostaLabelC.setForeground(new Color(20,140,0) );
		RespostaLabelC.setFont(new Font("verdana",Font.BOLD,20));
		
		RespostaLabelD.setBounds(80,405,500,100);
		RespostaLabelD.setBackground(new Color(117, 187, 103));
		RespostaLabelD.setForeground(new Color(20,140,0) );
		RespostaLabelD.setFont(new Font("verdana",Font.BOLD,20));
		
		
		ButtonVoltarMenu.setBounds(400,420,150,30);
		ButtonVoltarMenu.setFont(new Font("verdana",Font.BOLD,20));
		ButtonVoltarMenu.setFocusable(false);
		ButtonVoltarMenu.addActionListener(this);
		ButtonVoltarMenu.setText("Voltar");
		
		
		textoResultado.setBounds(390,70,170,50);
		textoResultado.setBackground(new Color(117, 187, 103));
		textoResultado.setForeground(new Color(141, 95, 19));
		textoResultado.setFont(new Font("verdana",Font.BOLD,30));
		textoResultado.setEditable(false);
		textoResultado.setText("Resultado");
		
		NumeroResultado.setBounds(390,320,170,50);
		NumeroResultado.setBackground(new Color(9, 174, 81));
		NumeroResultado.setForeground(new Color(0, 0, 0));
		NumeroResultado.setFont(new Font("verdana",Font.BOLD,30));
		NumeroResultado.setBorder(BorderFactory.createBevelBorder(1));
		NumeroResultado.setEditable(false);
		NumeroResultado.setHorizontalAlignment(JTextField.CENTER);
		
		NumeroResultadoPorcentagem.setBounds(390,220,170,50);
		NumeroResultadoPorcentagem.setBackground(new Color(9, 174, 81));
		NumeroResultadoPorcentagem.setForeground(new Color(0, 0, 0));
		NumeroResultadoPorcentagem.setFont(new Font("verdana",Font.BOLD,30));
		NumeroResultadoPorcentagem.setBorder(BorderFactory.createBevelBorder(1));
		NumeroResultadoPorcentagem.setEditable(false);
		NumeroResultadoPorcentagem.setHorizontalAlignment(JTextField.CENTER);
		
		Escala950();
		
		Frame.add(textoTitulo);
		Frame.add(textoResultado);
		Frame.add(ButtonIniciar);
		Frame.add(ButtonOpcoes);
		Frame.add(TituloSobre);
		Frame.add(ButtonSobre);
		Frame.add(textoSobre);
		Frame.add(ButtonCreditos);
		Frame.add(TituloCreditos);
		Frame.add(TextoCreditosAluno);
		Frame.add(TextoCreditosRA);
		Frame.add(TextoCreditosTurma);
		Frame.add(ButtonSair);
		Frame.add(textosuperiorPergunta);
		Frame.add(textoareaPergunta);
		Frame.add(ButtonA);
		Frame.add(ButtonB);
		Frame.add(ButtonC);
		Frame.add(ButtonD);
		Frame.add(ButtonDesistir);
		Frame.add(TextoCronometro);
		Frame.add(RespostaLabelA);
		Frame.add(RespostaLabelB);
		Frame.add(RespostaLabelC);
		Frame.add(RespostaLabelD);
		Frame.add(NumeroResultado);
		Frame.add(NumeroResultadoPorcentagem);
		Frame.add(ButtonVoltarMenu);
		Frame.add(textoEscala);
		Frame.add(ButtonEscala1);
		Frame.add(ButtonEscala2);
		
		
		CreditosDesativa();
		SobreDesativa();
		perguntasDesativar();
		ResultadoDesativar();
		OpcoesDesativa();
		Frame.setVisible(true);
	}
public void ProximaPergunta() {
		
		if(Perguntas.Index>=Perguntas.TotaldePerguntas) {
			perguntasDesativar();
			ResultadoAtivar();
			RC = Perguntas.RespostaCorreta;
			TP = Perguntas.TotaldePerguntas;
			NumeroResultado.setText(RC+"/"+TP);
			resultado = (int)((RC/(double)TP)*100);
			NumeroResultadoPorcentagem.setText(resultado+"%");
			Cronometro.stop();
		}
		else {
			textosuperiorPergunta.setText("Pergunta "+ (Perguntas.Index+1));
			textoareaPergunta.setText("  "+Perguntas.perguntas[Perguntas.Index]);
			if (Perguntas.perguntas[Perguntas.Index].length() >= 60 && LAP == 950) {
				textoareaPergunta.setBounds(0,50,LAP,53);
				textoareaPergunta.setFont(new Font("verdana",Font.BOLD,20));
			}
			else if(LAP == 950){
				textoareaPergunta.setBounds(0,50,LAP,50);
				textoareaPergunta.setFont(new Font("verdana",Font.BOLD,25));
			}
			else if (Perguntas.perguntas[Perguntas.Index].length() >= 90 && LAP == 1500) {
				textoareaPergunta.setBounds(0,50,LAP,53);
				textoareaPergunta.setFont(new Font("verdana",Font.BOLD,20));
			}
			else {
				textoareaPergunta.setBounds(0,50,LAP,50);
				textoareaPergunta.setFont(new Font("verdana",Font.BOLD,25));
			}
			RespostaLabelA.setText(Perguntas.escolhas[Perguntas.Index][0]);
			RespostaLabelB.setText(Perguntas.escolhas[Perguntas.Index][1]);
			RespostaLabelC.setText(Perguntas.escolhas[Perguntas.Index][2]);
			RespostaLabelD.setText(Perguntas.escolhas[Perguntas.Index][3]);
		}}
@Override
public void actionPerformed(ActionEvent a) {
	if(a.getSource() == ButtonIniciar){
	TextoCronometro.setForeground(new Color(70,70,70));
	Perguntas.Index = 0;
	Perguntas.RespostaCorreta = 0;
	Cronometro.start();
	Segundos = 30;
	Minutos = 1;
	if (Segundos<=9) {TextoCronometro.setText(Minutos+":0"+Segundos);}
	else {
	TextoCronometro.setText(Minutos+":"+Segundos);}
	Cronometro.start();
	perguntasAtivar();
	MenuDesativar();
	ProximaPergunta();
	}
	if(a.getSource() == ButtonDesistir) {
		Perguntas.Index = Perguntas.TotaldePerguntas;
		ProximaPergunta();
	
	}
	if(a.getSource() == ButtonEscala1) {
		Escala950();


	}
			
			
	if(a.getSource() == ButtonEscala2) {
		Escala1500();
	}
	if(a.getSource() == ButtonSobre) {
		MenuDesativar();
		SobreAtiva();
		
	}
	if(a.getSource() == ButtonCreditos) {
		MenuDesativar();
		CreditosAtiva();
		
	}
	if(a.getSource() == ButtonOpcoes) {
		MenuDesativar();
		OpcoesAtiva();
		
	}
	if(a.getSource() == ButtonSair) {
		System.exit(0);
		
		
	}
	if(a.getSource() == ButtonVoltarMenu) {
		Segundos = 10;
		perguntasDesativar();
		OpcoesDesativa();
		SobreDesativa();
		CreditosDesativa();
		ResultadoDesativar();
		MenuAtivar();}
}
	
ActionListener Acaopergunta = new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent a) {
		
		
		

	if(a.getSource() == ButtonA) {
		Perguntas.resposta = 'A';
		if (Perguntas.resposta == Perguntas.respostas[Perguntas.Index]) {
			Perguntas.RespostaCorreta++;
		}
	}
	if(a.getSource() == ButtonB) {
		Perguntas.resposta = 'B';
		if (Perguntas.resposta == Perguntas.respostas[Perguntas.Index]) {
			Perguntas.RespostaCorreta++;
		}
	}

	if(a.getSource() == ButtonC) {
		Perguntas.resposta = 'C';
		if (Perguntas.resposta == Perguntas.respostas[Perguntas.Index]) {
			Perguntas.RespostaCorreta++;
		}
	}

	if(a.getSource() == ButtonD) {
		Perguntas.resposta = 'D';
		if (Perguntas.resposta == Perguntas.respostas[Perguntas.Index]) {
			Perguntas.RespostaCorreta++;
		}
	}
	mostrarResposta();
			
	}
};

public void mostrarResposta() {
	ButtonA.setEnabled(false);
	ButtonB.setEnabled(false);
	ButtonC.setEnabled(false);
	ButtonD.setEnabled(false);
	
	
	if(Perguntas.respostas[Perguntas.Index] !='A') {
		RespostaLabelA.setForeground(new Color (180,0,0));			
	}
	if(Perguntas.respostas[Perguntas.Index] !='B') {
		RespostaLabelB.setForeground(new Color (180,0,0));			
	}
	if(Perguntas.respostas[Perguntas.Index] !='C') {
		RespostaLabelC.setForeground(new Color (180,0,0));			
	}
	if(Perguntas.respostas[Perguntas.Index] !='D') {
		RespostaLabelD.setForeground(new Color (180,0,0));			
	}
	Timer pause = new Timer(2000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			RespostaLabelA.setForeground(new Color (20,140,0));
			RespostaLabelB.setForeground(new Color (20,140,0));
			RespostaLabelC.setForeground(new Color (20,140,0));
			RespostaLabelD.setForeground(new Color (20,140,0));
			
			Perguntas.resposta= ' ';
			ButtonA.setEnabled(true);
			ButtonB.setEnabled(true);
			ButtonC.setEnabled(true);
			ButtonD.setEnabled(true);
			Perguntas.Index++;
			ProximaPergunta();

		}
	});
	pause.setRepeats(false);
	pause.start();
}
		public void perguntasDesativar(){
			textosuperiorPergunta.setVisible(false);
			textoareaPergunta.setVisible(false);
			ButtonA.setVisible(false);
			ButtonB.setVisible(false);
			ButtonC.setVisible(false);
			ButtonD.setVisible(false);
			TextoCronometro.setVisible(false);
			RespostaLabelA.setVisible(false);
			RespostaLabelB.setVisible(false);
			RespostaLabelC.setVisible(false);
			RespostaLabelD.setVisible(false);
			ButtonDesistir.setVisible(false);
			
		}
		public void perguntasAtivar(){
			textosuperiorPergunta.setVisible(true);
			textoareaPergunta.setVisible(true);
			ButtonA.setVisible(true);
			ButtonB.setVisible(true);
			ButtonC.setVisible(true);
			ButtonD.setVisible(true);
			TextoCronometro.setVisible(true);
			RespostaLabelA.setVisible(true);
			RespostaLabelB.setVisible(true);
			RespostaLabelC.setVisible(true);
			RespostaLabelD.setVisible(true);
			ButtonDesistir.setVisible(true);
			
		}
		public void MenuDesativar(){
			textoTitulo.setVisible(false);
			ButtonIniciar.setVisible(false);
			ButtonSobre.setVisible(false);
			ButtonCreditos.setVisible(false);
			ButtonOpcoes.setVisible(false);
			ButtonSair.setVisible(false);
			
		}
		public void MenuAtivar(){
			textoTitulo.setVisible(true);
			ButtonIniciar.setVisible(true);
			ButtonSobre.setVisible(true);
			ButtonCreditos.setVisible(true);
			ButtonOpcoes.setVisible(true);
			ButtonSair.setVisible(true);
			
		}
		public void ResultadoDesativar(){
			textoResultado.setVisible(false);
			ButtonVoltarMenu.setVisible(false);
			NumeroResultado.setVisible(false);
			NumeroResultadoPorcentagem.setVisible(false);
			
		}
		public void ResultadoAtivar(){
			textoResultado.setVisible(true);
			ButtonVoltarMenu.setVisible(true);
			NumeroResultado.setVisible(true);
			NumeroResultadoPorcentagem.setVisible(true);
			
		}
		public void SobreDesativa(){
			TituloSobre.setVisible(false);
			textoSobre.setVisible(false);
			ButtonVoltarMenu.setVisible(false);
			
		}
		public void SobreAtiva(){
			TituloSobre.setVisible(true);
			textoSobre.setVisible(true);
			ButtonVoltarMenu.setVisible(true);	
		}
		public void CreditosDesativa(){
			TituloCreditos.setVisible(false);
			TextoCreditosAluno.setVisible(false);
			TextoCreditosRA.setVisible(false);
			TextoCreditosTurma.setVisible(false);
			ButtonVoltarMenu.setVisible(false);
		}
		public void CreditosAtiva(){
			TituloCreditos.setVisible(true);
			TextoCreditosAluno.setVisible(true);
			TextoCreditosRA.setVisible(true);
			TextoCreditosTurma.setVisible(true);
			ButtonVoltarMenu.setVisible(true);	
		}
		public void OpcoesDesativa(){
			textoEscala.setVisible(false);
			ButtonEscala1.setVisible(false);
			ButtonEscala2.setVisible(false);
			ButtonVoltarMenu.setVisible(false);
			
		}
		public void OpcoesAtiva(){
			textoEscala.setVisible(true);
			ButtonEscala1.setVisible(true);
			ButtonEscala2.setVisible(true);
			ButtonVoltarMenu.setVisible(true);
			
		}
		public void Escala1500() {
			LAP = 1500;
			Frame.setSize(1500,800);
			textoEscala.setBounds(690,345,170,35);
			ButtonEscala1.setBounds(570,405,150,30);
			ButtonEscala2.setBounds(770,405,150,30);
			ButtonVoltarMenu.setBounds(665,495,150,30);
			textoTitulo.setBounds(590,90,950,50);
			ButtonIniciar.setBounds(665,195,170,50);
			TituloSobre.setBounds(668,120,200,50);
			textoSobre.setBounds(350,205,800,200);
			ButtonSobre.setBounds(665,295,170,50);
			TituloCreditos.setBounds(643,120,200,50);
			TextoCreditosTurma.setBounds(1025,255,300,200);
			TextoCreditosRA.setBounds(775,255,120,200);
			TextoCreditosAluno.setBounds(350,255,300,200);
			ButtonCreditos.setBounds(665,395,170,50);
			ButtonOpcoes.setBounds(665,495,170,50);
			ButtonSair.setBounds(665,595,170,50);
			textosuperiorPergunta.setBounds(0,0,1500,50);
			textoareaPergunta.setBounds(0,50,1500,50);
			ButtonA.setBounds(10,135,50,40);
			ButtonB.setBounds(10,235,50,40);
			ButtonC.setBounds(10,335,50,40);
			ButtonD.setBounds(10,435,50,40);
			RespostaLabelA.setBounds(125,100,900,100);
			RespostaLabelB.setBounds(125,200,500,100);
			RespostaLabelC.setBounds(125,300,500,100);
			RespostaLabelD.setBounds(125,400,500,100);
			TextoCronometro.setBounds(655,680,500,60);
			ButtonDesistir.setBounds(1340,700,130,25);
			textoResultado.setBounds(655,70,170,50);
			NumeroResultado.setBounds(655,320,170,50);
			NumeroResultadoPorcentagem.setBounds(655,220,170,50);
		}
		public void Escala950() {
			LAP = 950;
			Frame.setSize(LAP,650);
			textoEscala.setBounds(420,260,170,35);
			ButtonEscala1.setBounds(300,320,150,30);
			ButtonEscala2.setBounds(500,320,150,30);
			textoTitulo.setBounds(320,30,950,50);
			ButtonVoltarMenu.setBounds(400,420,150,30);
			ButtonIniciar.setBounds(400,120,170,50);
			TituloSobre.setBounds(398,120,200,50);
			textoSobre.setBounds(75,205,800,200);
			ButtonSobre.setBounds(400,220,170,50);
			TituloCreditos.setBounds(378,120,200,50);
			TextoCreditosTurma.setBounds(700,205,300,200);
			TextoCreditosRA.setBounds(450,205,120,200);
			TextoCreditosAluno.setBounds(75,205,300,200);
			ButtonCreditos.setBounds(400,320,170,50);
			ButtonOpcoes.setBounds(400,420,170,50);
			ButtonSair.setBounds(400,520,170,50);
			textosuperiorPergunta.setBounds(0,0,950,50);
			textoareaPergunta.setBounds(0,50,950,50);
			ButtonA.setBounds(10,135,50,40);
			ButtonB.setBounds(10,235,50,40);
			ButtonC.setBounds(10,335,50,40);
			ButtonD.setBounds(10,435,50,40);
			RespostaLabelA.setBounds(80,105,900,100);
			RespostaLabelB.setBounds(80,200,900,100);
			RespostaLabelC.setBounds(80,300,900,100);
			RespostaLabelD.setBounds(80,400,900,100);
			TextoCronometro.setBounds(400,530,500,60);
			ButtonDesistir.setBounds(790,550,130,25);
			textoResultado.setBounds(390,70,170,50);
			NumeroResultado.setBounds(390,320,170,50);
			NumeroResultadoPorcentagem.setBounds(390,220,170,50);
		}
		Timer Cronometro = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Segundos--;
				if (Minutos == 0 && Segundos <= 10) {
					TextoCronometro.setForeground(new Color(180,0,0));
				}
				else {
					TextoCronometro.setForeground(new Color(70,70,70));
				}
				if (Segundos<=9) {TextoCronometro.setText(Minutos+":0"+Segundos);}
				else {
				TextoCronometro.setText(Minutos+":"+Segundos);}
				
				if(Segundos <= 0 && Minutos <= 0) {
					Perguntas.Index = Perguntas.TotaldePerguntas;
					ProximaPergunta();
					Cronometro.stop();
				}
				if (Segundos <= 0 && Minutos > 0) {
					Minutos --;
					Segundos = 60;
				}
				
				
			}
		});
}	
