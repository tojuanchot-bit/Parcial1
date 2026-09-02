import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Metodos metodos = new Metodos();
        ObjEstudiante[][] estudiantes = null;
        int opcion;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Registrar notas");
            System.out.println("2. Mostrar todos los estudiantes");
            System.out.println("3. crear y mostrar estudiantes que aprueban (nota >= 3)");
            System.out.println("4. crear y mostrar grupo estudiantes que pierden (nota < 3)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tamaño n (matriz n x n): ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    estudiantes = metodos.registrarNotas(n, sc);
                    break;

                case 2:
                    if (estudiantes == null) {
                        System.out.println("Primero debe registrar las notas.");
                    } else {
                        metodos.mostrarGrupo(estudiantes);
                    }
                    break;

                case 3:
                    if (estudiantes == null) {
                        System.out.println("Primero debe registrar las notas.");
                    } else {
                        ObjEstudiante[][] ganan = metodos.clasificarGanan(estudiantes);
                        metodos.mostrarGrupo(ganan);
                    }
                    break;

                case 4:
                    if (estudiantes == null) {
                        System.out.println("Primero debe registrar las notas.");
                    } else {
                        ObjEstudiante[][] pierden = metodos.clasificarPierden(estudiantes);
                        metodos.mostrarGrupo(pierden);
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
