 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package machdien;

import java.util.Scanner;

/**
 *
 * @author quant
 */
public class MachDien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        // Nhập thông tin mạch điện
        System.out.print("Nhập số lượng điện trở: ");
        int n = scanner.nextInt();
        Resistor[] resistors = new Resistor[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập thông tin điện trở thứ " + (i + 1) + ": ");
            System.out.print("Điện trở: ");
            double resistance = scanner.nextDouble();
            System.out.print("Loại điện trở (1: đơn, 2: nối tiếp, 3: song song): ");
            int type = scanner.nextInt();
            resistors[i] = new Resistor(resistance, type);
        } 

        // Tính tổng trở mạch điện
        double totalResistance = calculateTotalResistance(resistors);

        // Xuất kết quả
        System.out.println("Tổng trở mạch điện: " + totalResistance + " Ω");
    }

    private static double calculateTotalResistance(Resistor[] resistors) {
        double totalResistance = 0;
        for (Resistor resistor : resistors) {
            switch (resistor.getType()) {
                case 1: // Điện trở đơn
                    totalResistance += resistor.getResistance();
                    break;
                case 2: // Mạch nối tiếp
                    totalResistance += calculateTotalResistance(resistor.getChildResistors());
                    break;
                case 3: // Mạch song song
                    totalResistance += 1 / calculateTotalResistance(resistor.getChildResistors());
                    break;
                default:
                    break;
            }
        }
        return totalResistance;
    }
}

class Resistor {
    private double resistance;
    private int type;
    private Resistor[] childResistors;

    public Resistor(double resistance, int type) {
        this.resistance = resistance;
        this.type = type;
        if (type == 2 || type == 3) {
            childResistors = new Resistor[0];
        }
    }

    public double getResistance() {
        return resistance;
    }

    public int getType() {
        return type;
    }

    public Resistor[] getChildResistors() {
        return childResistors;
    }

    public void setChildResistors(Resistor[] childResistors) {
        this.childResistors = childResistors;
    } 
}
