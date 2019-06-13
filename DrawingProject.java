
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


public class DrawingProject extends JComponent{

	public void paintComponent(Graphics g){ 
		Graphics2D g2 = (Graphics2D) g;
        
        drawGrid(g2);

		Rectangle rectangle = new Rectangle (1, 1, 1430, 870);
        g2.setColor(Color.blue);
        g2.draw(rectangle);
        g2.fill(rectangle);

        //ljhcjhfxjyxj

        g2.setColor(Color.yellow);
		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200);
		g2.fill(circle);

        //iydkutfc;iyfv

        g2.setColor(Color.black);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(900, 680, 10, 10);
        g2.setColor(Color.black);
        g2.fill(circle2);

        //ljfvkutdfkuyt
        
        Rectangle box = new Rectangle (600, 400, 400, 400);
        g2.setColor(Color.white);
		g2.draw(box);
        g2.fill(box);

        //hguyuigigyv
        
        Rectangle box1 = new Rectangle (650, 410, 110, 110);
        g2.setColor(Color.black);
        g2.draw(box1);
        
        //debvrtsbrd
        
        Rectangle box2 = new Rectangle (850, 410, 110, 110);
        g2.setColor(Color.black);
       
        g2.draw(box2);
        
        //cefrgerheyku
       
        Rectangle box3 = new Rectangle (820, 580, 110, 165);
        g2.setColor(Color.black);
        g2.draw(box3);
    
        //bjhvgkhghjkbkjhkjgh
       
        int x2Points[] = {150, 100, 125};
        int y2Points[] = {115, 0, 135};
        
        Polygon p = new Polygon(x2Points, y2Points, 3);
        
        g2.fillPolygon(p);
        
        g2.setColor(new Color(255,255,0));
   
        //jkhkjhkjhkjhkhkjhk
       
        int x3Points[] = {250, 200, 225};
        int y3Points[] = {215, 2, 235};
        
        Polygon p2 = new Polygon(x3Points, y3Points, 3);
        
        g2.fillPolygon(p2);
        
        g2.setColor(new Color(255,255,0));
        
        //dgnmrymnrymrymrayy
        
        int x4Points[] = {350, 300, 325};
        int y4Points[] = {315, 4, 335};
        
        Polygon p3 = new Polygon(x4Points, y4Points, 3);
        
        g2.fillPolygon(p3);
        
        g2.setColor(new Color(255,255,0));
     
        //tukdkgcjhvkfu
       
        int x5Points[] = {300, 320, 325};
        int y5Points[] = {335, 40, 315};
        
        Polygon p4 = new Polygon(x5Points, y5Points, 3);
        
        g2.fillPolygon(p4);
        
        g2.setColor(new Color(255,255,0));
      
        //kutckyxkytckugc
        
        g.drawPolygon(new int[] {600, 1000, 800}, new int[] {400, 400, 200}, 3);
        

        //gycyucgivbiucicytk
        
    }
    
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < 1500; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < 1500; y += 50){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
            
       
        }
        
    }
}



