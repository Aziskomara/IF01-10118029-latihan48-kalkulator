/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan48.kalkulator;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Kalkulator
 */
public class IF0110118029Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        kalkulator kalkulator = new kalkulator();
        
        kalkulator.setValue1(7.0);
        kalkulator.setValue2(5.0);
        System.out.println("VALUE 1 = "+kalkulator.getValue1());
        System.out.println("VALUE 2 = "+kalkulator.getValue2());
        
        kalkulator.setNameProject();
        kalkulator.setNoteProject("");
        
        System.out.println("Result Add is = "+kalkulator.add());
        System.out.println("Result Minus is = "+kalkulator.minus());
        System.out.println("Result Multiple is = "+kalkulator.multiplication());
        System.out.println("Result Division is = "+kalkulator.division());
    }
    
}
