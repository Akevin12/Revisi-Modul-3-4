package Model;

import java.time.LocalTime;
import java.time.LocalDate;

/**
 *
 * @author kevin
 */
public class PresensiStaff extends Presensi {

    private LocalTime jam;

    public PresensiStaff(LocalTime jam, LocalDate tanggal, int status) {
        super(tanggal, status);
        this.jam = jam;
    }

    public LocalTime getJam() {
        return jam;
    }

    public void setJam(LocalTime jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return super.toString() + "\njam=" + jam;
    }

}
