package Controller;

import Model.*;
import java.util.ArrayList;
import java.time.*;

/**
 *
 * @author kevin
 */
public class Controller implements Status {

    ArrayList<User> user = new ArrayList<>();

    public Controller() {
        //inisialisasi mata kuliah
        MataKuliah mk1 = new MataKuliah("IF-101", 4, "Algoritma dan Pemrograman");
        MataKuliah mk2 = new MataKuliah("KU-202", 2, "Kalkulus II");
        MataKuliah mk3 = new MataKuliah("AK-296", 2, "Dasar Akutansi");
        MataKuliah mk4 = new MataKuliah("IF-301", 3, "Pemrograman Berbasis Objek");
        MataKuliah mk5 = new MataKuliah("IF-3P1", 1, "Praktikum Pemrograman Berbasis Objek");

        //inisialisasi date
        LocalDate date1 = LocalDate.of(2022, 6, 9);
        LocalDate date2 = LocalDate.of(2022, 6, 10);
        LocalDate date3 = LocalDate.of(2022, 6, 11);
        LocalDate date4 = LocalDate.of(2022, 6, 12);
        LocalDate date5 = LocalDate.of(2022, 6, 13);
        LocalDate date6 = LocalDate.of(2022, 6, 14);
        LocalDate date7 = LocalDate.of(2022, 6, 15);
        LocalDate date8 = LocalDate.of(2022, 6, 16);
        LocalDate date9 = LocalDate.of(2022, 6, 17);

        //inisialisasi time
        LocalTime time1 = LocalTime.of(13, 00, 00);
        LocalTime time2 = LocalTime.of(15, 00, 00);
        LocalTime time3 = LocalTime.of(16, 00, 00);
        LocalTime time4 = LocalTime.of(17, 00, 00);
        LocalTime time5 = LocalTime.of(12, 00, 00);
        LocalTime time6 = LocalTime.of(11, 00, 00);
        LocalTime time7 = LocalTime.of(10, 00, 00);
        LocalTime time8 = LocalTime.of(9, 00, 00);
        LocalTime time9 = LocalTime.of(8, 00, 00);

        //data dummy 1 (Mahasiswa Sarjana)
        Presensi p1 = new Presensi(date6, 1);
        Presensi p2 = new Presensi(date7, 0);
        Presensi p3 = new Presensi(date8, 1);
        ArrayList<Presensi> presensi1 = new ArrayList<>();
        presensi1.add(p1);
        presensi1.add(p2);
        presensi1.add(p3);
        MatkulAmbil matkulAmbil1 = new MatkulAmbil(mk3, presensi1, 70, 90, 85);

        Presensi p4 = new Presensi(date1, 0);
        Presensi p5 = new Presensi(date2, 1);
        Presensi p6 = new Presensi(date3, 1);
        ArrayList<Presensi> presensi2 = new ArrayList<>();
        presensi2.add(p4);
        presensi2.add(p5);
        presensi2.add(p6);
        MatkulAmbil matkulAmbil2 = new MatkulAmbil(mk4, presensi1, 75, 95, 65);

        Presensi p7 = new Presensi(date7, 1);
        Presensi p8 = new Presensi(date8, 1);
        Presensi p9 = new Presensi(date9, 1);
        ArrayList<Presensi> presensi3 = new ArrayList<>();
        presensi3.add(p7);
        presensi3.add(p8);
        presensi3.add(p9);

        MatkulAmbil matkulAmbil3 = new MatkulAmbil(mk2, presensi2, 60, 85, 90);
        ArrayList<MatkulAmbil> ambilMK = new ArrayList<>();
        ambilMK.add(matkulAmbil1);
        ambilMK.add(matkulAmbil2);
        ambilMK.add(matkulAmbil3);
        MahasiswaSarjana mhs2 = new MahasiswaSarjana(ambilMK, "1120001", "Informatika", "Lutfi Triatmojo",
                "Mekar Wangi", "Surabaya, 03-07-1994", "08122145805");

        //data dummy 2 (Mahasiswa Magister)
        p1 = new Presensi(date1, 0);
        p2 = new Presensi(date2, 1);
        p3 = new Presensi(date3, 1);
        presensi1 = new ArrayList<>();
        presensi1.add(p1);
        presensi1.add(p2);
        presensi1.add(p3);
        matkulAmbil1 = new MatkulAmbil(mk1, presensi1, 80, 75, 95);

        p4 = new Presensi(date4, 0);
        p5 = new Presensi(date5, 1);
        p6 = new Presensi(date6, 1);
        presensi2 = new ArrayList<>();
        presensi2.add(p4);
        presensi2.add(p5);
        presensi2.add(p6);
        matkulAmbil2 = new MatkulAmbil(mk5, presensi1, 60, 93, 88);

        ambilMK = new ArrayList<>();
        ambilMK.add(matkulAmbil1);
        ambilMK.add(matkulAmbil2);

        MahasiswaMagister mhs1 = new MahasiswaMagister("Pentingnya algortima", ambilMK, "1121035", "Informatika",
                "Anthony Kevin", "TCI E No 50", "Magelang, 12-02-2003", "089614515976");

        //data dummy 3 (Mahasiswa Doktor)
        MahasiswaDoktor mhs3 = new MahasiswaDoktor("Bitcoin right or no?", 40, 80, 85, "1119001",
                "Informatika", "Lucass Dwiputra", "Baleendah", "Jakarta, 28-10-2002", "08134527653");

        //data dummy 4 (Dosen Tetap)
        PresensiStaff ps1 = new PresensiStaff(time1, date1, 1);
        PresensiStaff ps2 = new PresensiStaff(time2, date2, 1);
        PresensiStaff ps3 = new PresensiStaff(time3, date3, 0);
        ArrayList<PresensiStaff> presensi4 = new ArrayList<>();
        presensi4.add(ps1);
        presensi4.add(ps2);
        presensi4.add(ps3);
        MatkulAjar mkAjar1 = new MatkulAjar(mk3, presensi4);

        PresensiStaff ps4 = new PresensiStaff(time4, date4, 1);
        PresensiStaff ps5 = new PresensiStaff(time5, date5, 0);
        PresensiStaff ps6 = new PresensiStaff(time6, date6, 1);
        ArrayList<PresensiStaff> presensi5 = new ArrayList<>();
        presensi5.add(ps4);
        presensi5.add(ps5);
        presensi5.add(ps6);
        MatkulAjar mkAjar2 = new MatkulAjar(mk2, presensi5);

        ArrayList<MatkulAjar> mkAjar = new ArrayList<>();
        mkAjar.add(mkAjar1);
        mkAjar.add(mkAjar2);
        DosenTetap dsn1 = new DosenTetap(Constanta.SALARY, "Informatika", mkAjar, "213456789", "Justinus Tuin",
                "Jl. Pungkur", "26-7-1989", "0812234567");

        //data dummy 5 (Dosen Honorer)
        ps1 = new PresensiStaff(time7, date7, 1);
        ps2 = new PresensiStaff(time8, date8, 1);
        ps3 = new PresensiStaff(time9, date9, 1);
        presensi4 = new ArrayList<>();
        presensi4.add(ps1);
        presensi4.add(ps2);
        presensi4.add(ps3);
        mkAjar1 = new MatkulAjar(mk3, presensi4);

        ps4 = new PresensiStaff(time1, date1, 1);
        ps5 = new PresensiStaff(time2, date2, 0);
        ps6 = new PresensiStaff(time3, date3, 1);
        presensi5 = new ArrayList<>();
        presensi5.add(ps4);
        presensi5.add(ps5);
        presensi5.add(ps6);
        mkAjar2 = new MatkulAjar(mk2, presensi5);

        mkAjar = new ArrayList<>();
        mkAjar.add(mkAjar1);
        mkAjar.add(mkAjar2);
        DosenHonorer dsn2 = new DosenHonorer(Constanta.HONORPERSKS, "Informatika", mkAjar, "231456789", "Cristiano Suhendro",
                "Jl. Sisingamangaraja", "Bandung, 13-10-2003", "082134536237");

        //data dummy 6 (Karyawan)
        ps1 = new PresensiStaff(time9, date4, 1);
        ps2 = new PresensiStaff(time8, date5, 0);
        ps3 = new PresensiStaff(time7, date6, 0);
        ps4 = new PresensiStaff(time6, date7, 1);
        ps5 = new PresensiStaff(time5, date8, 0);
        ps6 = new PresensiStaff(time4, date9, 1);
        presensi4 = new ArrayList<>();
        presensi4.add(ps1);//1
        presensi4.add(ps2);
        presensi4.add(ps3);
        presensi4.add(ps4);//2
        presensi4.add(ps5);
        presensi4.add(ps6);//3
        presensi4.add(ps1);//4
        presensi4.add(ps2);
        presensi4.add(ps3);
        presensi4.add(ps4);//5

        Karyawan karyawan = new Karyawan(Constanta.SALARY, presensi4, "245123456", "Dovi Jon", "Jl. Muara No 23",
                "23-05-1999", "081233234567");
        user.add(mhs1);
        user.add(mhs2);
        user.add(mhs3);
        user.add(dsn1);
        user.add(dsn2);
        user.add(karyawan);
    }

    public int cariUser(String cari) {
        for (int i = 0; i < user.size(); i++) {
            User temp = user.get(i);
            if (temp.getNama().equals(cari)) {
                return i;
            }
        }
        return -1;
    }

    public String userData(String cari) {
        int index = cariUser(cari);
        if (index == -1) {
            return "Tidak ditemukan data user dengan nama " + cari;
        } else {
            User temp = user.get(index);
            String temp2 = temp.getClass().getName();
            String txtHasil = "Nama : " + temp.getNama()
                    + "\nAlamat : " + temp.getAlamat()
                    + "\nTelepon : " + temp.getTelepon()
                    + "\nTempat Tanggal Lahir : " + temp.getTtl();
            if ("Model.MahasiswaSarjana".equals(temp2)) {
                txtHasil += "\nStatus : Mahasiswa Sarjana";
            } else if ("Model.MahasiswaMagister".equals(temp2)) {
                txtHasil += "\nStatus : Mahasiswa Magister";
            } else if ("Model.MahasiswaDoktor".equals(temp2)) {
                txtHasil += "\nStatus : Mahasiswa Doktor";
            } else if ("Model.DosenTetap".equals(temp2)) {
                txtHasil += "\nStatus : Dosen Tetap";
            } else if ("Model.DosenHonorer".equals(temp2)) {
                txtHasil += "\nStatus : Dosen Honorer";
            } else if ("Model.Karyawan".equals(temp2)) {
                txtHasil += "\nStatus : Karyawan";
            }
            return txtHasil;
        }

    }

    public int cariIndexMahasiswa(String nim) {
        for (int i = 0; i < user.size(); i++) {
            User temp = user.get(i);
            if (temp instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) temp;
                if (mhs.getNim().equals(nim)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public float hitungNilaiAkhir(ArrayList<MatkulAmbil> matkul, String kodeMK) {
        for (int i = 0; i < matkul.size(); i++) {
            MatkulAmbil matbil = matkul.get(i);
            if (kodeMK.equals(matbil.getMatkul().getKode())) {
                return (matbil.getN1() + matbil.getN2() + matbil.getN3()) / 3;
            }
        }
        return -1;
    }

    public String hitungNA(String nim, String kodeMK) {
        int index = cariIndexMahasiswa(nim);
        if (index == -1) {
            return "Tidak ditemukan mahasiswa dengan nim " + nim;
        }
        User temp = user.get(index);
        if (temp instanceof MahasiswaMagister) {
            MahasiswaMagister mhs = (MahasiswaMagister) temp;
            float hasil = hitungNilaiAkhir(mhs.getMatkul(), kodeMK);
            if (hasil == -1) {
                return "Mahasiswa dengan nim " + nim + " tidak mengambil mata kuliah dengan kode " + kodeMK;
            }
            return "Nilai Akhir Mata Kuliah " + kodeMK + " Mahasiswa dengan nim " + nim + " : " + hasil;
        } else if (temp instanceof MahasiswaSarjana) {
            MahasiswaSarjana mhs = (MahasiswaSarjana) temp;
            float hasil = hitungNilaiAkhir(mhs.getMatkul(), kodeMK);
            if (hasil == -1) {
                return "Mahasiswa dengan nim " + nim + " tidak mengambil mata kuliah dengan kode " + kodeMK;
            }
            return "Nilai Akhir Mata Kuliah " + kodeMK + " Mahasiswa dengan nim " + nim + " : " + hasil;
        } else {
            MahasiswaDoktor mhs = (MahasiswaDoktor) temp;
            float total = mhs.getNilaiS1() + mhs.getNilaiS2() + mhs.getNilaiS3();
            float hasil = total / 3;
            return "Nilai Akhir Mahasiswa dengan nim " + nim + " : " + hasil;
        }
    }

    public String rataNA(String kodeMK) {
        int counter = 0;
        int total = 0;
        for (int i = 0; i < user.size(); i++) {
            User temp = user.get(i);
            if (temp instanceof MahasiswaMagister) {
                MahasiswaMagister mhs = (MahasiswaMagister) temp;
                float hasil = hitungNilaiAkhir(mhs.getMatkul(), kodeMK);
                if (hasil != -1) {
                    counter++;
                    total += hasil;
                }
            } else if (temp instanceof MahasiswaSarjana) {
                MahasiswaSarjana mhs = (MahasiswaSarjana) temp;
                float hasil = hitungNilaiAkhir(mhs.getMatkul(), kodeMK);
                if (hasil != -1) {
                    counter++;
                    total += hasil;
                }
            }
        }
        return "Rata-rata nilai mata kuliah " + kodeMK + " akhir = " + total / counter;
    }

    public String banyakTdkLulus(String kodeMK) {
        int counter = 0;
        int total = 0;
        for (int i = 0; i < user.size(); i++) {
            User temp = user.get(i);
            if (temp instanceof MahasiswaMagister) {
                MahasiswaMagister mhs = (MahasiswaMagister) temp;
                float hasil = hitungNilaiAkhir(mhs.getMatkul(), kodeMK);
                if (hasil != -1) {
                    counter++;
                    if (hasil < 56) {
                        total++;
                    }
                }
            } else if (temp instanceof MahasiswaSarjana) {
                MahasiswaSarjana mhs = (MahasiswaSarjana) temp;
                float hasil = hitungNilaiAkhir(mhs.getMatkul(), kodeMK);
                if (hasil != -1) {
                    counter++;
                    if (hasil < 56) {
                        total++;
                    }
                }
            }
        }
        return "<" + total + ">" + " dari " + "<" + counter + ">" + " mahasiswa tidak lulus matakuliah " + kodeMK;
    }

    public String matkulAmbilController(String nim) {
        int index = cariIndexMahasiswa(nim);
        if (index == -1) {
            return "Tidak ditemukan mahasiswa dengan nim " + nim;
        }
        User temp = user.get(index);
        String hasil = "";
        if (temp instanceof MahasiswaMagister) {
            MahasiswaMagister mhs = (MahasiswaMagister) temp;
            ArrayList<MatkulAmbil> mkAmbil = mhs.getMatkul();
            for (int i = 0; i < mkAmbil.size(); i++) {
                MatkulAmbil mk = mkAmbil.get(i);
                hasil += mk.toString();
                hasil += "\n==================================";
            }
            return hasil;
        } else if (temp instanceof MahasiswaSarjana) {
            MahasiswaSarjana mhs = (MahasiswaSarjana) temp;
            ArrayList<MatkulAmbil> mkAmbil = mhs.getMatkul();
            for (int i = 0; i < mkAmbil.size(); i++) {
                MatkulAmbil mk = mkAmbil.get(i);
                hasil += mk.toString();
                hasil += "\n==================================";
            }
            return hasil;
        } else {
            return "Mahasiswa Doktor tidak memiliki mata kuliah yang di ambil";
        }
    }

    public int hitungKehadiran(ArrayList<PresensiStaff> p) {
        int hadir = 0;
        for (int j = 0; j < p.size(); j++) {
            PresensiStaff presensi = p.get(j);
            if (presensi.getStatus() == HADIR) {
                hadir++;
            }
        }
        return hadir;
    }

    public int cariIndexStaff(String nik) {
        for (int i = 0; i < user.size(); i++) {
            User temp = user.get(i);
            if (temp instanceof Dosen) {
                Dosen dsn = (Dosen) temp;
                if (nik.equals(dsn.getNik())) {
                    return i;
                }
            } else if (temp instanceof Karyawan) {
                Karyawan kar = (Karyawan) temp;
                if (nik.equals(kar.getNik())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public String totalJamStaff(String nik) {
        int index = cariIndexStaff(nik);
        if (index == -1) {
            return "Tidak ditemukan dosen dengan nik " + nik;
        }
        User temp = user.get(index);
        if (temp instanceof Dosen) {
            Dosen dsn = (Dosen) temp;
            ArrayList<MatkulAjar> mkAjar = dsn.getMatkul();
            int jam = 0;
            for (int i = 0; i < mkAjar.size(); i++) {
                MatkulAjar mk = mkAjar.get(i);
                ArrayList<PresensiStaff> p = mk.getPresensi();
                jam += hitungKehadiran(p) * 2;
            }
            return "Total jam dosen mengajar : " + jam;
        }
        return "Tidak ditemukan dosen dengan nik " + nik;
    }

    public String hitungGajiStaff(String nik) {
        int index = cariIndexStaff(nik);
        if (index == -1) {
            return "Tidak ditemukan staff dengan nik " + nik;
        }
        User temp = user.get(index);
        int unit = 0;
        int gaji = 0;
        if (temp instanceof DosenTetap) {
            DosenTetap dsn = (DosenTetap) temp;
            ArrayList<MatkulAjar> mkAjar = dsn.getMatkul();
            for (int i = 0; i < mkAjar.size(); i++) {
                MatkulAjar mk = mkAjar.get(i);
                ArrayList<PresensiStaff> p = mk.getPresensi();
                unit += hitungKehadiran(p);
            }
            gaji = Constanta.SALARY + (unit * 25000);
        } else if (temp instanceof DosenHonorer) {
            DosenHonorer dsnH = (DosenHonorer) temp;
            ArrayList<MatkulAjar> mkAjar = dsnH.getMatkul();
            for (int i = 0; i < mkAjar.size(); i++) {
                MatkulAjar mk = mkAjar.get(i);
                ArrayList<PresensiStaff> p = mk.getPresensi();
                unit += hitungKehadiran(p);
            }
            gaji = unit * Constanta.HONORPERSKS;
        } else if (temp instanceof Karyawan) {
            Karyawan kar = (Karyawan) temp;
            ArrayList<PresensiStaff> p = kar.getPresensi();
            unit += hitungKehadiran(p);
            gaji = (unit / 22) * Constanta.SALARY;
        }
        return "Gaji : " + gaji;
    }

}
