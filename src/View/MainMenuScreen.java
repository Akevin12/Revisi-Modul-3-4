package View;

import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class MainMenuScreen {

    public MainMenuScreen() {
        showMainMenu();
    }

    private void showMainMenu() {
        Boolean menu = true;
        while (menu) {
            int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Menu: "
                    + "\n1.Print User Data "
                    + "\n2.Print Nilai Akhir "
                    + "\n3.Print Rata-Rata nilai Akhir "
                    + "\n4.Print Mahasiswa Tdk Lulus "
                    + "\n5.Print Matkul Mahasiswa "
                    + "\n6.Print Total Jam Ajar"
                    + "\n7.Print Gaji"
                    + "\n8.Exit"));
            switch (choosen) {
                case 1:
                    new UserDataView();
                    break;
                case 2:
                    new NilaiAkhirView();
                    break;
                case 3:
                    new RataNAView();
                    break;
                case 4:
                    new BanyakTdkLulusMKView();
                    break;
                case 5:
                    new MatkulAmbilView();
                    break;
                case 6:
                    new TotalJamView();
                    break;
                case 7:
                    new GajiView();
                    break;
                case 8:
                    menu = false;
                    break;
            }
        }
    }
}
