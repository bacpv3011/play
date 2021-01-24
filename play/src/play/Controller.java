/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play;

import javax.swing.JDialog;
import play.CalPane;

/**
 *
 * @author Admin
 */
public class Controller {
    private CalPane pane;
    private JDialog changeDialog;
    
    private int base = 2;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    public Controller(){
        
    }
    void getCalPane(String[] name) {
        pane = new CalPane(this,name);
        pane.setVisible(true);
        pane.setBase(base);
    }

    void showChangeDialog() {
        changeDialog = new Change(pane,true,this);
        changeDialog.setVisible(true);
    }

    void closeChangeDialog(int base) {
        changeDialog.setVisible(false);
        this.setBase(base);
        pane.setBase(this.base);
        pane.updateMulti();
    }
    
}
