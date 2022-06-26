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
public class GajiView {

    public GajiView() {
        Controller con = new Controller();
        String nik = JOptionPane.showInputDialog(null, "Masukkan NIK Staff");
        JOptionPane.showMessageDialog(null, con.hitungGajiStaff(nik));
    }
}
