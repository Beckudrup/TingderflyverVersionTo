import processing.core.PApplet;

public class Main extends PApplet {
    //....Denne variabel kan bruges til at
    static PApplet p;

    //Denne liste SKAL indholde alle de "Firkanter", der er på skærmen!
    Firkanter[] listeFirkanter;

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    @Override
    public void settings() {
        super.settings();
        size(500, 500);
        //...Alle processing kommandoer er nu inde i p....
        p = this;


        //Opgave 1 : Her skal du oprette listen "listeFirkanter" med plads til 20 Firkanter
        listeFirkanter = new Firkanter[20];
        p.println(listeFirkanter);

        //Opgave 5 : Her skal du skrive kode der laver alle "Ting"

        for (int i = 0; i < listeFirkanter.length; i++) {
            listeFirkanter[i] = new Firkanter(random(10, 500), random(10, 500), this, listeFirkanter);
        }
        p.println(listeFirkanter);
    }

    public void draw() {
        //... Eksempel på processing kommando (som den bør bruges i andre klasser!!)
        Main.p.fill(200, 200, 200);
        Main.p.rect(0, 0, 500, 500);
        for (int j = 0; j < listeFirkanter.length-1; j++) {
            fill(255);
            listeFirkanter[j].flyv();
            if (listeFirkanter[j].kollision())
fill(0,0,0);

            if(listeFirkanter[j].farveSkift())
                fill(0,255,0);
            listeFirkanter[j].tegn();
            fill(255,255,255);




        }

            //OPGAVE 8 (SVÆR) : Her skal du skrive kode der ændrer farven til rød din "Firkant"  rører ved musen...


            //Opgave 6 : Her skal du skrive kode, der tegner alle "Ting"
            //ps: Du SKAL kalde "tegn metoden" på ALLE "Firkanter"


            //Opgave 7 : Her skal du skrive kode, der får alle "Firkanter" til at flytte sig
            //ps: DU SKAL kalde "


            //EKSPERT 2:
            //Hvis to ting rører hinanden skal de blive blå!

        }


    //}
}