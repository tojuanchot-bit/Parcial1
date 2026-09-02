import java.util.Scanner;

public class Metodos {

    public ObjEstudiante[][] registrarNotas (int n, Scanner sc){

        ObjEstudiante[][] m = new ObjEstudiante[n][n];
        int estudiante = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                ObjEstudiante o = new ObjEstudiante();
                System.out.println("Estudiante " + estudiante);
                o.setCodigo(estudiante);
                System.out.println("Nombre: ");
                o.setNombre(sc.nextLine());
                System.out.println("Semestre: ");
                o.setSemestre(sc.nextInt());
                sc.nextLine();
                System.out.println("Nota: ");
                o.setNota(sc.nextDouble());
                sc.nextLine();

                m[i][j] = o;
                estudiante++;

            }
        }
        return m;
    }

    /*El usuario desea filtrar 2 grupos 1. Aprueban con nota >= 3,
     n mejoramiento <= 3*/

    public ObjEstudiante[][] clasificarGanan(ObjEstudiante[][] m){

        int gana = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                ObjEstudiante o = m[i][j];
                if (o.getNota() >= 3) {
                    gana++;
                }
            }
        }

        ObjEstudiante[][] ganan = new ObjEstudiante[1][gana]; 

        int indice = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                ObjEstudiante o = m[i][j];
                if(o.getNota() >= 3){
                ganan[0][indice] = m[i][j];
                indice++;
                }
            }
        }
        return ganan;
    }

    public ObjEstudiante[][] clasificarPierden(ObjEstudiante[][] m){

        int pierde = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                ObjEstudiante o = m[i][j];
                if (o.getNota() < 3) {
                    pierde++;
                }
            }
        }

        ObjEstudiante[][] pierden = new ObjEstudiante[1][pierde]; 

        int indice = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                ObjEstudiante o = m[i][j];
                if(o.getNota() < 3){
                pierden[0][indice] = m[i][j];
                indice++;
                }
            }
        }
        return pierden;
    }

    public void mostrarGrupo (ObjEstudiante[][] m){

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                ObjEstudiante o = m[i][j];
                System.out.println("Codigo: " + o.getCodigo());
                System.out.println("Nombre: " + o.getNombre());
                System.out.println("Semestre: " + o.getSemestre());
                System.out.println("Nota: " + o.getNota());
                System.out.println("-----------------------");
            }
        }
    }


}
