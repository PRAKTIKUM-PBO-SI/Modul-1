/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package GUIDED1;

/**
 *
 * @author ACER NITRO
 */
public class Point {
    protected float x,y;
    
    public Point(float a, float b) {
        System.out.println("Konstruktor dijalankan");
        x = a;
        y = b;
    }
    
    public void cetakPoint()
    {
        System.out.println("Poin: ["+x+", "+y+"]");
}
}
