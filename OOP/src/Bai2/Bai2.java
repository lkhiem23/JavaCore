/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bai2;
public static class Bai2 {
        private double width;
        private double height;

        public Bai2(double width, double height) {
            this.width = width;
            this.height = height;
        }

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

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }

        public String xuat() {
            return "Hinh chu nhat:\n" +
                    "- Chieu rong: " + width + "\n" +
                    "- Chieu cao: " + height + "\n" +
                    "- Dien tich: " + getArea() + "\n" +
                    "- Chu vi: " + getPerimeter();
        }
    
    public static void main(String[] args) {
        Bai2 rectangle = new Bai2(5.8, 3.2);
        System.out.println(rectangle.xuat());
    }
}