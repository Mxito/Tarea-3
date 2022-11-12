package tarea3;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {
    private Expendedor exp;
    private Comprador com;;
    private JButton m100;
    private JButton m500;
    private JButton m1000;
    private JButton receptorMonedas;
    private JButton fantaBoton;
    private JButton spriteBoton;
    private JButton cocaBoton;
    private JButton sacarBebida;
    public JButton sacarVuelto;
    public PanelPrincipal() throws customException{
        this.setBackground(Color.darkGray);
        this.setLayout(null);
        exp = new Expendedor(9, 1500);
        Botones();
        com = new Comprador(exp);
        clickSaldo();
        elegirBebida();
    }
    public void Botones(){
        m500 = new JButton();
        m500.setBounds(50, 200, 50, 50);
        ImageIcon m500i = new ImageIcon("moneda500.png");
        m500.setIcon(new ImageIcon(m500i.getImage().getScaledInstance(m500.getWidth(), m500.getHeight(), Image.SCALE_SMOOTH)));
        this.add(m500);
        
        m100 = new JButton();
        m100.setBounds(50, 140, 50, 50);
        ImageIcon m100i = new ImageIcon("moneda100.png");
        m100.setIcon(new ImageIcon(m100i.getImage().getScaledInstance(m100.getWidth(), m100.getHeight(), Image.SCALE_SMOOTH)));
        this.add(m100);
        
        m1000 = new JButton();
        m1000.setBounds(50, 260, 50, 50);
        ImageIcon m1000i = new ImageIcon("moneda1000.png");
        m1000.setIcon(new ImageIcon(m1000i.getImage().getScaledInstance(m1000.getWidth(), m1000.getHeight(), Image.SCALE_SMOOTH)));
        this.add(m1000);
        
        fantaBoton = new JButton();
        fantaBoton.setBounds(547, 360, 80, 30);
        ImageIcon fantaImage = new ImageIcon("fanta-etiqueta.png");
        fantaBoton.setIcon(new ImageIcon(fantaImage.getImage().getScaledInstance(fantaBoton.getWidth(), fantaBoton.getHeight(), Image.SCALE_SMOOTH)));
        this.add(fantaBoton);
          
        cocaBoton = new JButton();
        cocaBoton.setBounds(547, 395, 80, 30);
        ImageIcon cocaImage = new ImageIcon("coca-etiqueta.jpg");
        cocaBoton.setIcon(new ImageIcon(cocaImage.getImage().getScaledInstance(cocaBoton.getWidth(), cocaBoton.getHeight(), Image.SCALE_SMOOTH)));
        this.add(cocaBoton);
        
        spriteBoton = new JButton();
        spriteBoton.setBounds(547, 430, 80, 30);
        ImageIcon spriteImage = new ImageIcon("sprite-etiqueta.png");
        spriteBoton.setIcon(new ImageIcon(spriteImage.getImage().getScaledInstance(spriteBoton.getWidth(), spriteBoton.getHeight(), Image.SCALE_SMOOTH)));
        this.add(spriteBoton);
        
        receptorMonedas = new JButton();
        receptorMonedas.setBounds(556, 285, 64, 58);
        this.add(receptorMonedas);
        receptorMonedas.setOpaque(false);
        receptorMonedas.setContentAreaFilled(false);
        receptorMonedas.setBorderPainted(false);
        
        sacarBebida = new JButton();
        sacarBebida.setBounds(230, 500, 25, 55);
        this.add(sacarBebida);
        sacarBebida.setOpaque(false);
        sacarBebida.setContentAreaFilled(false);
        sacarBebida.setBorderPainted(false);
        
        sacarVuelto = new JButton();
        sacarVuelto.setBounds(260, 500, 50, 50);
        this.add(sacarVuelto);
        sacarVuelto.setOpaque(false);
        sacarVuelto.setContentAreaFilled(false);
        sacarVuelto.setBorderPainted(false);
    
    }
      
   public void clickSaldo(){
       MouseAdapter ma1 = new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
                com.agregarSaldo(new Moneda100());
                repaint();
            }
       };m100.addMouseListener(ma1);
       
       MouseAdapter ma2 = new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
                com.agregarSaldo(new Moneda500());
                repaint();
            }
       };m500.addMouseListener(ma2);
       
       MouseAdapter ma3 = new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
                com.agregarSaldo(new Moneda1000());
                repaint();
            }
       };m1000.addMouseListener(ma3);
       
       MouseAdapter ma4 = new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e){
               com.quitarSaldo();
               repaint();
           }
       };receptorMonedas.addMouseListener(ma4);
   }

   public void elegirBebida(){
       MouseAdapter ma1 = new MouseAdapter() {
          @Override
           public void mouseClicked(MouseEvent e) {
              try {
                  exp.comprarBebida(1);
              } catch (customException ex) {
                  Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
              }
                repaint();
            }
       };fantaBoton.addMouseListener(ma1);
       MouseAdapter ma2 = new MouseAdapter() {
          @Override
           public void mouseClicked(MouseEvent e) {
              try {
                  exp.comprarBebida(2);
              } catch (customException ex) {
                  Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
              }
                repaint();
            }
       };cocaBoton.addMouseListener(ma2);
       MouseAdapter ma3 = new MouseAdapter() {
          @Override
           public void mouseClicked(MouseEvent e) {
              try {
                  exp.comprarBebida(3);
              } catch (customException ex) {
                  Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
              }
                repaint();
            }
       };spriteBoton.addMouseListener(ma3);
       MouseAdapter ma4 = new MouseAdapter() {
          @Override
           public void mouseClicked(MouseEvent e) {
                exp.getaBebida();
                repaint();
            }
       };sacarBebida.addMouseListener(ma4);
       
       MouseAdapter ma5 = new MouseAdapter() {
          @Override
           public void mouseClicked(MouseEvent e){
                exp.retornarVuelto();
                com.agregarSaldo(new Moneda100());
                repaint();
            }
       };sacarVuelto.addMouseListener(ma5);   
   }  
    @Override
    public void paint(Graphics g){
        super.paint(g);
        exp.paint(g);
        com.paint(g);
    }        
}