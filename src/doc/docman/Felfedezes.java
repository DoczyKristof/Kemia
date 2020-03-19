package doc.docman;

public class Felfedezes {
    private int rendszam;
    private String nev, ev, vegyjel, felfedezo;

    public Felfedezes(String sor) {
        this.ev = sor.split(";")[0];
        this.nev = sor.split(";")[1];
        this.vegyjel = sor.split(";")[2];
        this.rendszam = Integer.parseInt(sor.split(";")[3]);
        this.felfedezo = sor.split(";")[4];
    }
    //---------------
    public int getRendszam() {
        return rendszam;
    }
    public void setRendszam(int rendszam) {
        this.rendszam = rendszam;
    }
    //---------------
    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }
    //---------------
    public String getEv() {
        return ev;
    }
    public void setEv(String ev) {
        this.ev = ev;
    }
    //---------------
    public String getVegyjel() {
        return vegyjel;
    }
    public void setVegyjel(String vegyjel) {
        this.vegyjel = vegyjel;
    }
    //---------------
    public String getFelfedezo() {
        return felfedezo;
    }
    public void setFelfedezo(String felfedezo) {
        this.felfedezo = felfedezo;
    }
    //---------------

    @Override
    public String toString() {
        return "Felfedezes{" +
                "rendszam=" + rendszam +
                ", nev='" + nev + '\'' +
                ", ev='" + ev + '\'' +
                ", vegyjel='" + vegyjel + '\'' +
                ", felfedezo='" + felfedezo + '\'' +
                '}';
    }
}