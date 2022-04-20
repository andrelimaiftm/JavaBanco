package br.edu.iftm.poo.classes;

import javax.swing.JOptionPane;

public class Conta {

    //atritubuto estatico
    private static int totaldeContas;
    
    //atributos de classe
    private int numero;
    private double saldo;
    private double limite;
    private Cliente cliente;

    //Metodo Construtores
    public Conta(){
        Conta.totaldeContas += 1;
    }

    public Conta (Cliente cliente){
        this();
        this.cliente = cliente;        
    }

    public Conta(int numero, Cliente cliente){
        this(cliente);
        this.numero = numero;
    }

    //metodos da classe
    public boolean sacar(double valorSaque){
        if(verificaSaldo(valorSaque)){
            //saldo = saldo - valorSaque
            this.saldo -= valorSaque;
            return true;
        }
        return false;
    }

    public boolean depositar(double ValorDeposito){
        if(ValorDeposito > 0){
            //saldo = saldo  + valorDeposito
            this.saldo += ValorDeposito;
            return true;
        }
        return false;
    }

    public boolean verificaSaldo(double valor){
        double saldoTotal = this.saldo + this.limite;
        if(saldoTotal >= valor){
            return true;
        }
        imprimeMensagem("Saldo insuficiente");
        return false;
    }

    public boolean transferir(Conta destino, double valorTransferencia){
        if(verificaSaldo(valorTransferencia)){
            saldo -= valorTransferencia;
            destino.depositar(valorTransferencia);
            return true;
        }
        return false;
    }
    
    private void imprimeMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }

    //metodos getter e setter
    public static int getTotaldeContas() {
        return totaldeContas;
    }

    public static void setTotaldeContas(int totaldeContas) {
        Conta.totaldeContas = totaldeContas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
