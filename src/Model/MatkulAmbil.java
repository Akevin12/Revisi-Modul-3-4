package Model;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class MatkulAmbil extends MataKuliah{

    MataKuliah matkul;
    ArrayList<Presensi> presensi;
    private int n1, n2, n3;
    
    
    public MatkulAmbil(MataKuliah matkul, ArrayList<Presensi> presensi, int n1, int n2, int n3) {
        this.matkul = matkul;
        this.presensi = presensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public MataKuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }

    public ArrayList<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<Presensi> presensi) {
        this.presensi = presensi;
    }
  
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }
    
    @Override
    public String toString() {
        String n = "";
        for (int i = 0; i < presensi.size(); i++) {
            Presensi x = presensi.get(i);
            n += x.toString();
        }
        return matkul.toString() + "\nPresensi=" + n + "\nn1=" + n1 + "\nn2=" + n2 + "\nn3=" + n3;

    }

}
