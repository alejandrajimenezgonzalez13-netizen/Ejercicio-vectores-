import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Desarollar un programa que permita registrar las notas
        de un grupo de estudiantes.
        Requerimientos
        -Solicitar la cantidad de estudiantes.
        -Crear un vector para almacenar las notas.
        -Registrar las notas usando ciclo for.
        -Mostrar todas las notas.
        -Calcular el promedio.
        -Determinar la nota mayor.
        -Determinar la nota menor.
        -Contar estudiantes aprobados (nota>=3.0).
        -Contar estudiantes reprobados (nota<3.0)
        Restricciones
        -No permitir notas fuera del rango 0 a 5.

         */
        Scanner teclado = new Scanner(System.in);

        int cantiestu = 0;
        double suma =0;
        double Nmayor=0;
        double Nmenor =5;
        int aprobados =0;
        int reprobados =0;



        System.out.println("PROGRAMA QUE REGISTRA LAS NOTAS DEL ESTUDIANTE");


        System.out.println("Dijite la cantidad de estudiantes");
        cantiestu = teclado.nextInt();

        double[] notas = new double[cantiestu];


        for (int i = 0; i < notas.length; i++) {
            System.out.println("Dijite la nota del estudiante");
            notas[i] = teclado.nextDouble();

            while (notas[i] < 0 || notas[i] >5){
                System.out.println(" Solo se perimite en el rango");
                System.out.println("         Intente nuevamente");
                notas[i] = teclado.nextDouble();
            }
        }

        System.out.println("Las notas ingresadas son ");

        for (int i=0; i < notas.length; i++){
            System.out.println("Su nota es:"+  notas[i]);

            suma +=notas[i];

        }
        double promedio = suma / notas.length;
        System.out.println("El promedio es: "+ promedio);

        for(int i=0; i < notas.length; i++) {
            if (notas[i] > Nmayor) {
                Nmayor = notas[i];
            }
        }
        System.out.println("La nota mayor es: " +Nmayor);

        for(int i=0; i < notas.length; i++) {
            if (notas[i] < Nmenor) {
                Nmenor = notas[i];
            }
        }
        System.out.println("La nota menor es:" +Nmenor);

        for (int i=0; i< notas.length;i++) {
            if (notas[i] >= 3) {
                aprobados++;
            }
        }
        System.out.println("los aprobados son:" +aprobados);

        for (int i=0; i< notas.length; i++) {
            if (notas[i] <3 ){
                reprobados ++;
            }
        }
        System.out.println("los reprobados son:" +reprobados);

    }

}

