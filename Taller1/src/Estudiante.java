public class Estudiante {
    String nombre;
    int semestre;
    int años;
    String correo;

    public Estudiante(String nombre, int semestre, int años, String correo){
        this.nombre = nombre;
        this.semestre = semestre;
        this.años = años;
        this.correo = correo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getAños(){
        return this.años;
    }
    public int getSemestre(){
        return this.semestre;
    }
    public String getCorreo(){
        return this.correo;
    }

}
