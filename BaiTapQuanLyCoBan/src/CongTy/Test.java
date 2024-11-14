/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3_bai4;

/**
 *
 * @author tung0
 */
public class Test 
{
    public static void main(String[] args) 
    {
        Employee[] arr = new Employee[3];
        System.out.println("\tNHAP THONG TIN BOSS: ");
        arr[0] = new Boss();
        arr[0].nhap();

        System.out.println("\tNHAP THONG TIN PIECEWORKER ");
        arr[1] = new PieceWorker();
        arr[1].nhap();

        System.out.println("\tNhap thong tin CommisstionWorker ");
        arr[2] = new CommissionWorker();
        arr[2].nhap();

        System.out.println("\tThong tin boss");
        arr[0].display();
        System.out.println("\tThong tin PieceWorked");
        arr[1].display();
        System.out.println("\tThong tin CommisstionWorked");
        arr[2].display();
    }
}
