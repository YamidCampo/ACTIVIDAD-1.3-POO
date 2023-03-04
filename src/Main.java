import java.util.Scanner;
public class Main{
    static public void main(String[] args) {
        int salario=5000, horas=48;
        float bruto,fuente,neto;
        bruto=salario*horas;
        fuente=bruto*0.125f;
        neto=bruto-fuente;
        System.out.println("El salario bruto es: "+Math.round(bruto));
        System.out.println("El procentaje de retencion en la fuente es: "+Math.round(fuente));
        System.out.println("El salario neto es: "+Math.round(neto));
    }
}
