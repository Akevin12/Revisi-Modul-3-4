package Model;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class MahasiswaMagister extends MahasiswaSarjana {

    private String judulTesis;

    public MahasiswaMagister(String judulTesis, ArrayList<MatkulAmbil> matkul, String nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(matkul, nim, jurusan, nama, alamat, ttl, telepon);
        this.judulTesis = judulTesis;
    }


    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }
    
}
