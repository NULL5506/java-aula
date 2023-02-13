package Programa;

public class Calc_Media {
    public String Nome;
    public double Nota1;
    public double Nota2;
    public double Nota3;

    public double noteFinal(){
        return Nota1 + Nota2 +  Nota3;
    } public double verificador() {
        if (noteFinal() < 60) {
            return 60 - noteFinal();
        } else {
            return 0;
        }
    }

}
