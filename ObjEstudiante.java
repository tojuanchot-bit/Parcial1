public class ObjEstudiante {

/*Un docente necesita analizar los resultados de sus estudiantes. 

Para cada estudiante se tiene su nombre, código, semestre y nota final. 

El docente desea separar a los estudiantes en diferentes grupos de acuerdo con su resultado académico y presentar la 
información de cada grupo. 

Desarrolle una solución que permita realizar este análisis.  */

    private String nombre;
    private int codigo;
    private int semestre;
    private double nota;
    
    public ObjEstudiante() {
    }

    public ObjEstudiante(String nombre, int codigo, int semestre, double nota) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    


}