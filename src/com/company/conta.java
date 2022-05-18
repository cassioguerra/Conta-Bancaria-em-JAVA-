package com.company;

public class conta {
    private  int numero ;
    private  String Titular;
    private  double saldo ;

    static int qtcontas = 0 ;

    // construtor
    public  conta ( String pTitular ){
        this.Titular = pTitular;
        qtcontas++;
        // numero da conta auto incremental
        this.numero = qtcontas;
        this.saldo = 0;
    }

    public  void  DadosBancario(){
        System.out.println(" ");
        System.out.println(" -- Dados Bancario --");
        System.out.println(" -- Numero " + this.numero);
        System.out.println(" -- titular:  " + this.Titular);
        System.out.println("-- Saldo " + this.saldo);
        System.out.println( " -- fim dados Bancario ");
    }
    public void  Deposito( double pvalor ){
        System.out.println("");
        System.out.println("-- Realizar deposito-- ");
        System.out.println(" -- saldo anteriot: " +this.saldo);
        this.saldo = this.saldo + pvalor;       // this.saldo +=pvalor
        System.out.println( " saldo atual : " + this.saldo);
        System.out.println(" ---- Fim de Deposito --- ");

    }
public void sacar( double pvalor ){
    System.out.println("");
    System.out.println("-- Realizar saque -- ");
    System.out.println(" -- Saldo Anterior "+ this.saldo);
    if (pvalor <+ this.saldo){ // caso eu tenha saldo
        this.saldo -= pvalor;
        System.out.println(" -- saldo posterior " +this+saldo);
    } else { // caso eu não tenha saldo
        System.out.println(" -- saldo insuficiente -- ");
    }
    System.out.println(" -- FIM DO SALDO --");
    System.out.println("");
}
}
