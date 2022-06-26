package Model;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class DosenTetap extends Dosen {

    private int salary;

    public DosenTetap(int salary, String departemen, ArrayList<MatkulAjar> matkul, String nik, String nama, String alamat, String ttl, String telepon) {
        super(departemen, matkul, nik, nama, alamat, ttl, telepon);
        this.salary = salary;
    }

    public ArrayList<MatkulAjar> getMatkul() {
        return matkul;
    }

    public void setMatkul(ArrayList<MatkulAjar> matkul) {
        this.matkul = matkul;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
