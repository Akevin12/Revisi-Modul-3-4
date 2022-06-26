package Model;

/**
 *
 * @author kevin
 */
public class MatkulPilihan extends MataKuliah {

    private int minimumMahasiswa;

    public MatkulPilihan(int minimumMahasiswa, String kode, int SKS, String nama) {
        super(kode, SKS, nama);
        this.minimumMahasiswa = minimumMahasiswa;
    }
}
