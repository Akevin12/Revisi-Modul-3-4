package Model;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class DosenHonorer extends Dosen {

    private int honorPerSKS;

    public DosenHonorer(int honorPerSKS, String departemen, ArrayList<MatkulAjar> matkul, String nik, String nama, String alamat, String ttl, String telepon) {
        super(departemen, matkul, nik, nama, alamat, ttl, telepon);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

}
