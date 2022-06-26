
package View;

import Controller.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class UserDataView {

    public UserDataView() {
        Controller con = new Controller();
        String nama = JOptionPane.showInputDialog(null, "Masukkan nama user yang ingin di print");
        JOptionPane.showMessageDialog(null, con.userData(nama));
    }
}
