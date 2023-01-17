import java.util.Scanner;

public class infracciones{

    public static void main(String[]args){

        Scanner lector=new Scanner(System.in);

        int infracciones = 0;
        double infracciones_diarias = 0, inf_matutina=0, inf_vespertina=0, inf_nocturna=0;

        System.out.println("Indica el número de infracciones mensuales: ");
        infracciones=lector.nextInt();

        infracciones_diarias = infracciones / 30;
        inf_matutina = infracciones_diarias * 0.2;
        inf_vespertina= infracciones_diarias * 0.35;
        inf_nocturna= infracciones_diarias * 0.45;

        System.out.println("El promedio diario matutino de infracciones es " + inf_matutina);
        System.out.println("El promedio diario vespertino de infracciones es " + inf_vespertina);
        System.out.println("El promedio diario nocturno de infracciones es " + inf_nocturna);

        
    }
}