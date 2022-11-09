package tarea3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

class Comprador{
    private ArrayList<Moneda> M;
    private DepositoMonedas Cartera;
    private Bebida bebida;
    private int vueltoPendiente;
    public Comprador( int cualBebida, Expendedor maquina) throws customException{
        M = new ArrayList<>();
        Cartera = new DepositoMonedas();
        bebida = maquina.comprarBebida(Cartera.removeMoneda(), cualBebida);
        vueltoPendiente = maquina.valorVuelto(cualBebida);
        for(int i = vueltoPendiente; i > 0; i-=100){
            Cartera.addMoneda(maquina.getVuelto());
        }
        vueltoPendiente = 0;
    }
    public void paint(Graphics g){
       
        
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
