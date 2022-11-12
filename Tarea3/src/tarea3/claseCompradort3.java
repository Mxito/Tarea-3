package tarea3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

class Comprador{
    private DepositoMonedas Cartera;
    private Bebida bebida;
    private int vueltoPendiente;
    private int saldo;
    private String saldoString;
    private Expendedor expCom;
    public Comprador(Expendedor exp) throws customException{
       Cartera = new DepositoMonedas();
       saldoString = "";
       saldo = 0;
       expCom = exp;
    }
    public String beber(){
        Bebida aux = bebida;
        bebida = null;
        return "Bebiendo: "+aux.tipoBebida()+"\nNumero de Serie: "+aux.getSerie()+"\n";
    }
    public void cuantoVuelto(){
        int cont = Cartera.getDMonedas().size();
        for (int i = cont; i > 0; i--){
            System.out.println("100");
        }
    } 
    public void saldo(){
        saldo = 0;
        for(int i=0; i< Cartera.getDMonedas().size(); i++){
            saldo += Cartera.getMoneda(i).getValor();
        }
        saldoString = saldo+"";   
    }
    public void quitarSaldo(){
        expCom.pagoCompra(Cartera);
        while(!Cartera.getDMonedas().isEmpty()){
            Cartera.removeMoneda();
        }
        saldo = 0;
    } 
    public void agregarSaldo(Moneda m){
        if(m != null){
            Cartera.addMoneda(m);
        }
    }
    public void paint(Graphics g){
       this.saldo();
       g.setColor(Color.black);
       g.fillRoundRect(60, 100, 130, 20, 30, 30);
       g.setColor(Color.white);
       Font font = new Font("Space Invaders",Font.BOLD,12);
       g.setFont(font);
       g.drawString("Saldo : $"+ saldoString, 66, 114);   
    }
}
