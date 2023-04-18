package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class Teste {

	public static void main(String[] args) {

		
		Empresa objEmpresa = new Empresa (JOptionPane.showInputDialog("Nome da empresa: "),
				JOptionPane.showInputDialog("Tipo da empresa: "),
				JOptionPane.showInputDialog("CNPJ: "));
		
		
		Endereco objEndereco = new Endereco (JOptionPane.showInputDialog("Logradouro: "),
				Integer.parseInt(JOptionPane.showInputDialog("Número: ")),
				JOptionPane.showInputDialog("CEP: "),
				JOptionPane.showInputDialog("Bairro: "),
				JOptionPane.showInputDialog("Município: "),
				JOptionPane.showInputDialog("Estado: "));
		
		
		Produto objProduto = new Produto (JOptionPane.showInputDialog("Tipo de produto: "),
				JOptionPane.showInputDialog("Marca: "),
				Integer.parseInt(JOptionPane.showInputDialog("Quantidade: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Valor: ")));
		
		
	objEmpresa.setEndereco(objEndereco);
	
	
	// ================ SAÍDA ================
	
	System.out.println("========= EMPRESA =========" +
			"\nNome da Empresa: " + objEmpresa.getNome() + 
			"\nTipo da Empresa: " + objEmpresa.getTipo() + 
			"\nCNPJ: " + objEmpresa.getCnpj() + 
			"\n========= ENDEREÇO =========" + 
			"\nLogradouro: " + objEmpresa.getEndereco().getLogradouro() +
			"\nNúmero: " + objEmpresa.getEndereco().getNumero() + 
			"\nCEP: " + objEmpresa.getEndereco().getCep() + 
			"\nBairro: " + objEmpresa.getEndereco().getBairro() + 
			"\nMunicípio: " + objEmpresa.getEndereco().getMunicipio() + 
			"\nEstado: " + objEmpresa.getEndereco().getEstado() + 
			"\n========= PRODUTO =========" + 
			"\nTipo do produto: " + objProduto.getTipo() + 
			"\nMarca: " + objProduto.getMarca() + 
			"\nQuantidade: " + objProduto.getQuantidade() +
			"\nValor: " + objProduto.getValor());

  }
}
