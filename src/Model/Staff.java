package Model;

/**
 *
 * @author kevin
 */
public abstract class Staff extends User {

    private String nik;

    public Staff(String nik, String nama, String alamat, String ttl, String telepon) {
        super(nama, alamat, ttl, telepon);
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    

    @Override
    public String toString() {
        return super.toString() + "nik=" + nik;
    }
    
    
}
