/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bai3;

/**
 *
 * @author ADMIN
 */
public class Bai3 {
     private String name;
        private String position;
        private double salary;

        public Bai3(String name, String position, double salary) {
            this.name = name;
            this.position = position;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double calculateBonus() {
            if (position.equals("Giám đốc")) {
                return salary * 0.2;
            } else if (position.equals("Nhân viên")) {
                return salary * 0.1;
            } else {
                return 0;
            }
        }

        public double getTotalSalary() {
            return salary + calculateBonus();
        }

        public String xuat() {
            return "Ten: " + name + "\n" +
                    "Chuc vu: " + position + "\n" +
                    "Muc luong: " + salary + "\n" +
                    "Thuong: " + calculateBonus() + "\n" +
                    "Tong luong: " + getTotalSalary();
        }
    
public static void main(String[] args) {
        Bai3 employee1 = new Bai3("Nguyen Van Quan", "Giam doc", 1000000);
        Bai3 employee2 = new Bai3("Tran Thi Nhon", "Nhan vien", 500000);

        System.out.println(employee1.xuat() + "\n");
        System.out.println(employee2.xuat());

        if (employee1.getTotalSalary() > employee2.getTotalSalary()) {
            System.out.println("Nhan vien co muc luong cao nhat la : " + employee1.getName());
        } else {
            System.out.println("Nhan vien co muc luong cao nhat la : "  + employee2.getName());
        }
    
    }
}
