package Model;

import java.time.LocalDate;

/**
 *
 * @author kevin
 */
public class Presensi implements Status {

    private LocalDate tanggal;
    private int status;

    public Presensi(LocalDate tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        if (status == HADIR) {
            return " Tanggal = " + tanggal + "\nStatus = hadir";
        } else {
            return " Tanggal = " + tanggal + "\nStatus = alpha";
        }
    }

}
