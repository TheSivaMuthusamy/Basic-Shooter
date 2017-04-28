/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shooter;
import java.awt.*;
/**
 *
 * @author Siva
 */
public class Bullet {
    private double x, y, dx, dy, rad, speed;
    private int r;
    private Color color1;
    
    public Bullet(double angle, int x, int y) {
        this.x = x;
        this.y = y;
        
        r = 2;
        rad = Math.toRadians(angle);
        speed = 10;
        dx = Math.cos(rad) * speed;
        dy = Math.sin(rad) * speed;
        
        
        color1 = Color.yellow;
    }
    
    public double getX() { return x;}
    public double getY() { return y;}
    public double getR() { return r;}
    
    public boolean update() {
        x += dx;
        y += dy;
        
        if(x < -r || x > GamePanel.WIDTH + r || y < -r ||
                y > GamePanel.HEIGHT + r) {
            return true;
            
        }
        
        return false;
    }
    
    public void draw(Graphics2D g) {
        g.setColor(color1);
        g.fillOval((int) x - r, (int) y - r, (int) 2 * r, (int) 2 * r);
    }

 
}
