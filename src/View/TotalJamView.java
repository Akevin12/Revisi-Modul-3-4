package View;

import Controller.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class TotalJamView {

    public TotalJamView() {
        Controller con = new Controller();
        String nik = JOptionPane.showInputDialog(null, "Masukkan NIK Dosen");
        JOptionPane.showMessageDialog(null, con.totalJamStaff(nik));
    }
}
