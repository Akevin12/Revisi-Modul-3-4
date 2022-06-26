package Model;

/**
 *
 * @author kevin
 */
public class MahasiswaDoktor extends Mahasiswa {

    private String judulDisertasi;
    private float nilaiS1;
    private float nilaiS2;
    private float nilaiS3;

    public MahasiswaDoktor(String judulDisertasi, float nilaiS1, float nilaiS2, float nilaiS3, String nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.judulDisertasi = judulDisertasi;
        this.nilaiS1 = nilaiS1;
        this.nilaiS2 = nilaiS2;
        this.nilaiS3 = nilaiS3;
    }
    
    public String getJudulDisertasi() {
        return judulDisertasi;
    }

    public void setJudulDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }

    public float getNilaiS1() {
        return nilaiS1;
    }

    public void setNilaiS1(float nilaiS1) {
        this.nilaiS1 = nilaiS1;
    }

    public float getNilaiS2() {
        return nilaiS2;
    }

    public void setNilaiS2(float nilaiS2) {
        this.nilaiS2 = nilaiS2;
    }

    public float getNilaiS3() {
        return nilaiS3;
    }

    public void setNilaiS3(float nilaiS3) {
        this.nilaiS3 = nilaiS3;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + "\njudulDisertasi=" + judulDisertasi + "\nnilaiSidang1=" + nilaiS1 + "\nnilaiSidang2=" + nilaiS2 + "\nnilaiSidang3=" + nilaiS3;
    }

}
