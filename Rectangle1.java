/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle1;

public class Rectangle1 {
    private double width;
    private double height;

    public Rectangle1(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public void setWidth(double w) {
        if (w <= 0) {
            throw new IllegalArgumentException("abc0");
        }
        this.width = w;
    }

    
    public String toString() {
        return "Rectangle[width=" + width + ", height=" + height + "]";
    }
}
