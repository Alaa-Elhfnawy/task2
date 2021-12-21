/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author NoteBook
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MultiplyInterface anInterface = new Multiplier();
        System.out.println(anInterface.multiply(5));
        DivideInterface anInterface1 = new Divider();
        System.out.println(anInterface1.divide(10));
        MultiplyInterface anInterface2 = new DividerAdapter(new Divider());
        System.out.println(anInterface2.multiply(20));
    }

}
