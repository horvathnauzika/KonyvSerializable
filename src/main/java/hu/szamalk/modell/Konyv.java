package hu.szamalk.modell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

public class Konyv implements Serializable {
    private String cim;
    private ArrayList<String> szerzok;
    private int kiadEv;
    private transient UUID id;

    public Konyv(String cim, ArrayList<String> szerzok, int kiadEv) {
        this.cim = cim;
        this.szerzok = new ArrayList<>();
        this.kiadEv = kiadEv;
        this.id= UUID.randomUUID();
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public ArrayList<String> getSzerzok() {
        return new ArrayList<>(szerzok);
    }

    public void setSzerzok(ArrayList<String> szerzok) {
        this.szerzok = szerzok;
    }

    public int getKiadEv() {
        return kiadEv;
    }

    public void setKiadEv(int kiadEv) {
        this.kiadEv = kiadEv;
    }

    @Override
    public String toString() {
        return "Konyv{" +
                "cim='" + cim + '\'' +
                ", szerzok=" + szerzok +
                ", kiadEv=" + kiadEv +
                ", id=" + id +
                '}';
    }
}
