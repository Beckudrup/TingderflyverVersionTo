import processing.core.PApplet;

public class Firkanter {
    static PApplet p;


    float xSPD = (float) 0.3;
    float ySPD = (float) 0.2;
    Firkanter[] andreFirkanter;


    //Firkanternes position
    float x, y;
    Firkanter[] listeFirkanter;

    Firkanter(float inputX, float inputY, PApplet p, Firkanter[] listeFirkanter) {

        //Opgave 2: Her skal du skrive kode der sætter positionen for firkanten x og y
        x = inputX;
        y = inputY;

        this.p = p;
        this.listeFirkanter = listeFirkanter;


    }

    void tegn() {
        //Opgave 3: Her skal du skrive kode der tegner denne "Firkant"
        // Dette blev testet ved at jeg tændte programmet og så at der var firkanter
        p.rect(x, y, 50, 50);
    }

    void flyv() {
        //Opgave 4: Her skal du skrive kode der flytter "Firkanten"
        //ps: Husk de må ikke flytte sig uden for skærmen...
        //Jeg testede det her ved at printe x og y ud og ved at se på skærmen at det virkede
        x += xSPD;
        y += ySPD;

        if (x + 10 > p.width || y + 10 > p.height || x - 10 < 0 || y - 10 < 0) {
            ySPD *= -1;
            xSPD *= -1;
        }
        if (ySPD > 3) {
            ySPD = (float) 0.3;
        }
        if (xSPD > 3) {
            xSPD = (float) 0.2;
        }

        p.println(x);
        p.println(y);
    }

    boolean farveSkift() {
        boolean resultat = false;

        if ((p.mouseX < x + 25 && p.mouseX > x - 25) && (p.mouseY > y - 25 && p.mouseY < 25 + y)) {
            resultat = true;

        }
        return resultat;

    }

    boolean kollision() {
        boolean resultat = false;
        for (int i = 0; i < listeFirkanter.length; i++) {
            if (listeFirkanter[i].x - 25 < x - 25 && listeFirkanter[i].x + 25 > x - 25 || ((listeFirkanter[i].x + 25 > x + 25) && (listeFirkanter[i].x - 25 < x + 25))) {
                if (listeFirkanter[i].y + 25 > y && listeFirkanter[i].y + - 25< y){
                    resultat = true;
                }

            }
        }
        return resultat;
    }

}






