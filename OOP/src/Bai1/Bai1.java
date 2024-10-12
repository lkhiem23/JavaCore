/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bai1;

public class Bai1{

   private String name;
        private String breed;

        public Bai1(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public String getName() {
            return name;
        }

        public String getBreed() {
            return breed;
        }

        
        public String xuat() {
            return "Ten: " + name + "\nGiong: " + breed;
        }
    
/**
 *
 * @author ADMIN
 */
     public static void main(String[] args){
            Bai1 dog1 = new Bai1("chiwawa", "pitbull");
            Bai1 dog2 = new Bai1("Phoc", "cho ta");
            
            System.out.println("Thong tin ban dau: ");
            
            dog1.setName("Cam");
            dog2.setName("Muc");
            
            System.out.println("Thong tin sau khi cap nhat:" );
            System.out.println("Bai1 1: Name - "+ dog1.getName() + ", Breed - " + dog1.getBreed());
            System.out.println("Bai1 1: Name - "+ dog2.getName() + ", Breed - " + dog2.getBreed());
            
        }
}
