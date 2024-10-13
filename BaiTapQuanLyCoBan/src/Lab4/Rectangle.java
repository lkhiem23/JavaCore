/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab4;

import java.util.Scanner;

/**
 *
 * @author tung0
 */
public class Rectangle {
    private double width;
    private double height;
    protected String color;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    public Rectangle(){ }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }
        
    public double findArea(){
        return (this.height*this.height);
    }
    public double findPerimeter(){
        return (2*(this.height+this.width));
    }
    
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        this.width = scanner.nextDouble();
        System.out.print("Enter height: ");
        this.height = scanner.nextDouble();
        System.out.print("Enter color: ");
        this.color = scanner.next();
    }

    public void show() {
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Color: " + this.color);
        System.out.println("Area: " + findArea());
        System.out.println("Perimeter: " + findPerimeter());
    }
    
}
