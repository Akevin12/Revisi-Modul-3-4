package Model;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class MahasiswaSarjana extends Mahasiswa {

    private ArrayList <MatkulAmbil> matkul;


    public MahasiswaSarjana(ArrayList<MatkulAmbil> matkul, String nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.matkul = matkul;
    }

    public ArrayList<MatkulAmbil> getMatkul() {
        return matkul;
    }

    public void setMatkul(ArrayList<MatkulAmbil> matkul) {
        this.matkul = matkul;
    }
    
}
