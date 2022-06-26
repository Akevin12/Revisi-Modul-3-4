package View;

import Controller.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class MatkulAmbilView {

    public MatkulAmbilView() {
        Controller con = new Controller();
        String nim = JOptionPane.showInputDialog(null, "Masukkan Nim Mahasiswa");
        JOptionPane.showMessageDialog(null, con.matkulAmbilController(nim));
    }
}
