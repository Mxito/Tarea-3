package tarea3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

class Comprador{
    private ArrayList<Moneda> M;
    private DepositoMonedas Cartera;
    private Bebida bebida;
    private int vueltoPendiente;
    public Comprador(Moneda coin) throws customException{
       Cartera = new DepositoMonedas();
       Cartera.addMoneda(coin);
       
    }
    public void paint(Graphics g){
       Cartera.paint(g);
        
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

    
}
