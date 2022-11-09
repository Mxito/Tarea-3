package tarea3;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {
    private Comprador com; 
    private Expendedor exp;
    Moneda100 m3 = new Moneda100();
    public PanelPrincipal(){
        this.setBackground(Color.white);
        exp = new Expendedor(4, 1000);
        
        
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        exp.paint(g);
        
        
    }
}
