package View;

import Controller.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class NilaiAkhirView {

    public NilaiAkhirView() {
        Controller con = new Controller();
        String nim = JOptionPane.showInputDialog(null, "Masukkan Nim Mahasiswa");
        String kodeMK = JOptionPane.showInputDialog(null, "Masukkan Kode Mata Kuliah");
        JOptionPane.showMessageDialog(null, con.hitungNA(nim, kodeMK));
    }
}
