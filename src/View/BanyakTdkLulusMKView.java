/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class BanyakTdkLulusMKView {

    public BanyakTdkLulusMKView() {
        Controller con = new Controller();
        String kodeMK = JOptionPane.showInputDialog(null, "Masukkan kode mata kuliah");
        JOptionPane.showMessageDialog(null, con.banyakTdkLulus(kodeMK));
    }

}
