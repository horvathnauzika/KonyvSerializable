package hu.szamalk.modell;

import java.io.Serializable;
import java.util.ArrayList;

public class Konyv implements Serializable {
    private String cim, szerzo;
    private int kiadEv;

    public Konyv(String cim, String szerzo, int kiadEv) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.kiadEv = kiadEv;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
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
                ", szerzo='" + szerzo + '\'' +
                ", kiadEv=" + kiadEv +
                '}';
    }
}
