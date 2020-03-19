package doc.docman;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Feladatok {
    private ArrayList<Felfedezes> felfedezesek;
    private String vegyjel;

    //---------------
    public Feladatok(){
        this.Beolvasas();
    }
    //---------------
    public void Beolvasas(){
        try{
            Scanner sc_felfedezes = new Scanner(new File("felfedezesek"));
            this.felfedezesek = new ArrayList<>();
            sc_felfedezes.nextLine();
            while(sc_felfedezes.hasNext()){
                felfedezesek.add(new Felfedezes(sc_felfedezes.nextLine()));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    //---------------
    public String harmadikFeladat(){
        return String.format("3.feladat: Elemek száma: %d", this.felfedezesek.size());
    }
    //---------------
    public String negyedikfeladat(){
        int sumlalo = 0;
        for (Felfedezes f : felfedezesek){
            if (f.getEv().equals("Ókor")){
                sumlalo++;
            }
        }
        return "3.feladat: Felfedezések száma az ókorban: " + sumlalo;
    }
    //---------------
    public void otodikFeladat(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("5.feladat: Kérek egy vegyjelet: ");
            vegyjel = sc.nextLine();
        }while(!vegyjel.matches("[a-zA-Z]+") || (vegyjel.isEmpty() || vegyjel.length()>2));
    }
    //---------------
    public String hatodikFeladat(){
        for (Felfedezes f : felfedezesek){
            if (f.getVegyjel().toLowerCase().equals(vegyjel.toLowerCase())){
                return String.format("6.feladat: Keresés:\n\tAz elem vegyjele: %s\n\tAz elem neve: %s\n\tRendszáma: %d\n\tFelfedezés éve: %s\n\tFelfedező: %s",
                        f.getVegyjel(),f.getNev(),f.getRendszam(),f.getEv(),f.getFelfedezo());
            }
        }
        return "6.feladat: Keresés:\n\tNincs ilyen elem az adatbázisban!";
    }
    //---------------
    public String hetedikFeladat(){
        ArrayList<Felfedezes> xd = new ArrayList<>();
        int dif;
        for (Felfedezes f : felfedezesek){
            if (!(f.getEv().equals("Ókor"))){
                xd.add(f);
            }
        }
        int index = xd.size()-1;
        dif = Integer.parseInt(xd.get(index).getEv()) - Integer.parseInt(xd.get(index-1).getEv());
        while (!(index == 1)){
            index--;
            if (dif < Integer.parseInt(xd.get(index).getEv()) - Integer.parseInt(xd.get(index-1).getEv())){
                dif = Integer.parseInt(xd.get(index).getEv()) - Integer.parseInt(xd.get(index-1).getEv());
            }
        }
        return String.format("7.feladat: %d év volt a leghosszabb időszak két elem felfedezése között.", dif);
    }
}