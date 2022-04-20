package br.edu.iftm.poo.classes;

public class Cliente {

    //atributos da classe
    private String nome;
    private String sobreNome;
    private String cpf;
    private int dia;
    private int mes;
    private int ano;
   

    //metodo construtor
    public Cliente(String cpf) {
        if(validaCPF(cpf)){
            this.cpf = cpf;
        }else{
            imprimeMensagem("CPF não é valido");
        }        
    }

    //metodo construtor com todos os atributos da classe
    public Cliente(String nome, String sobreNome, String cpf, int dia, int mes, int ano) {
        if(validaCPF(cpf)){
            this.nome = nome;
            this.sobreNome = sobreNome;
            this.cpf = cpf;
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            imprimeMensagem("CPF não é valido");
        }
        
    }

    //metodos da classe
    private void imprimeMensagem(String msg){
        System.out.println(msg);
    }

    private boolean validaCPF(String cpf){
        if(cpf.length() == 11){
            if(cpf.equals("00000000000")){
                return false;
            }else if(cpf.equals("11111111111")){
                return false;
            }else if(cpf.equals("22222222222")){
                return false;
            }else if(cpf.equals("3333333333")){
                return false;
            }else if(cpf.equals("44444444444")){
                return false;
            }else if(cpf.equals("55555555555")){
                return false;
            }else if(cpf.equals("666666666666")){
                return false;
            }else if(cpf.equals("77777777777")){
                return false;
            }else if(cpf.equals("88888888888")){
                return false;
            }else if(cpf.equals("99999999999")){
                return false;
            }
            return true;
        }else{
            return false;
        }
    }

    //metodos getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    
}
