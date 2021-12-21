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
public class DividerAdapter implements MultiplyInterface {

    private final Divider divider;

    public DividerAdapter(Divider divider) {
        this.divider = divider;
    }

    @Override
    public long multiply(long BigDecimal) {
         return divider.divide(BigDecimal);//To change body of generated methods, choose Tools | Templates.
    }

}
