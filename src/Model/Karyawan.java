package Model;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Karyawan extends Staff {

    private int salary;
    private ArrayList<PresensiStaff> presensi;

    public Karyawan(int salary, ArrayList<PresensiStaff> presensi, String nik, String nama, String alamat, String ttl, String telepon) {
        super(nik, nama, alamat, ttl, telepon);
        this.salary = salary;
        this.presensi = presensi;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }

}
