
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahel12
 */
public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;

    CalculatorController() {
            System.out.println("Am trying to connect...");
                this.theView = new CalculatorView();
                this.theModel =new CalculatorModel();

    }

public int passTheValues(int x,int y){
                    return theModel.addTwoNumbers(x,y);
}

}
