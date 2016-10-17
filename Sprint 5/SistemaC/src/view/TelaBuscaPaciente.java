package view;

import java.awt.Container;
import java.awt.GridLayout;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import app.App;
import model.Funcionario;
import model.Paciente;

public class TelaBuscaPaciente extends Tela {

	private static final long serialVersionUID = 1L;
	private JLabel cpf;
	private JTextField campoCpf;
	private JButton pesquisar;
	private MaskFormatter m1;
	private JTable tabela;
	private JScrollPane barraRolagem;
	private Object [][] dados;
	String [] colunas = {"Nome", "CPF", "Telefone"};
	
	
	public TelaBuscaPaciente() {

		setTitle("Busca de Paciente");
		
		preencherCabecalhoTabela();

		try {
			m1 = new MaskFormatter("###.###.###-##");
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		
		cpf = new JLabel("CPF: ");
		campoCpf = new JFormattedTextField(m1);

		pesquisar = new JButton("Pesquisar");

		Container c = new Container();
		c.setLayout(new GridLayout(1, 2));
		c.setSize(400, 20);
		c.setLocation(10, 10);
		c.add(cpf);
		c.add(campoCpf);
		
		
		add(barraRolagem);
		

		add(c);
		pesquisar.setBounds(450, 10, 100, 20);
		add(pesquisar);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);

	}
	
	
	public boolean pacienteBuscado(){
		
		DefaultTableModel df = (DefaultTableModel) tabela.getModel();
		
		for(int j = 0; j< tabela.getModel().getRowCount(); j++){
			if(tabela.getValueAt(j, 1).equals(campoCpf.getText())){
				return true;
			}
		}
		
		return false;
		
	}
	
	public void preencherCabecalhoTabela(){
		
		
		tabela = new JTable();
		tabela.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Nome", "CPF", "Telefone"
	            }
	    ));
		
		DefaultTableModel df = (DefaultTableModel) tabela.getModel();
		
		
		
	
		barraRolagem = new JScrollPane(barraRolagem);
		barraRolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		barraRolagem.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(10, 40, 575, 300);
	}

	public JLabel getCpf() {
		return cpf;
	}

	public void setCpf(JLabel cpf) {
		this.cpf = cpf;
	}

	public JTextField getCampoCpf() {
		return campoCpf;
	}

	public void setCampoCpf(JTextField campoCpf) {
		this.campoCpf = campoCpf;
	}

	public JButton getPesquisar() {
		return pesquisar;
	}

	public void setPesquisar(JButton pesquisar) {
		this.pesquisar = pesquisar;
	}

	public MaskFormatter getM1() {
		return m1;
	}

	public void setM1(MaskFormatter m1) {
		this.m1 = m1;
	}

	public JTable getTabela() {
		return tabela;
	}

	public void setTabela(JTable tabela) {
		this.tabela = tabela;
	}

	public JScrollPane getBarraRolagem() {
		return barraRolagem;
	}

	public void setBarraRolagem(JScrollPane barraRolagem) {
		this.barraRolagem = barraRolagem;
	}

	public Object[][] getDados() {
		return dados;
	}

	public void setDados(Object[][] dados) {
		this.dados = dados;
	}

	public String[] getColunas() {
		return colunas;
	}

	public void setColunas(String[] colunas) {
		this.colunas = colunas;
	}

}
