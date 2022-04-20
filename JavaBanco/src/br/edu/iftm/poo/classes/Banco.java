package br.edu.iftm.poo.classes;

import javax.swing.JOptionPane;

public class Banco {

    //atributos da classe
    private int indice;

    private String nome;
    private Conta[] vetorContas;

    //metodos construtores
    public Banco(){
        vetorContas = new Conta[10];
    }

    public Banco(String nome, int numeroDeContas){
        this.nome = nome;
        vetorContas = new Conta[numeroDeContas];        
    }

    //metodos da classe
    public void abrirConta(Cliente cliente){
        Conta conta = new Conta(cliente);
        conta.setNumero(Conta.getTotaldeContas());
        this.vetorContas[indice] = conta;
        indice++;        
    }

    public Conta buscarConta(int numero){
        if(vetorContas[0] != null){
            for (Conta conta : vetorContas) {
                if(conta != null && conta.getNumero() == numero){
                    return conta;
                }
            }
        }
        imprimeMensagem("Conta inexistente");
        return null;
    }
    
    public boolean operacaoSaque(Conta conta, double valor){
        conta = buscarConta(conta.getNumero());
        if(conta != null){
            return conta.sacar(valor);
        }        
        return false;
    }

    public boolean operacaoDeposito(Conta conta, double valor){
        conta = buscarConta(conta.getNumero());
        if(conta != null){
            return conta.depositar(valor);            
        }
        return false;
    }

    public boolean operacaoTransferir(Conta origem, Conta destino, double valor){
        origem = buscarConta(origem.getNumero());
        destino = buscarConta(destino.getNumero());
        if(origem != null && destino != null){
            return origem.transferir(destino, valor);
        }
        return false;
    }

    private void imprimeMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }


    //metodos getter e setter
    public int getIndice() {
        return indice;
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta[] getVetorContas() {
        return vetorContas;
    }

    public void setVetorContas(Conta[] vetorContas) {
        this.vetorContas = vetorContas;
    }

    
    
}
