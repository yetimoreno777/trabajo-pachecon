package app_escuela;

public class Alumno {
    private int matricula;
    private String nombre_s;
    private String ap_pat;
    private String ap_mat;
    private int semestre;
    private String carrera;

    public Alumno() {
    }

    public Alumno(int matricula, String nombre_s, String ap_pat, String ap_mat, int semestre, String carrera) {
        this.matricula = matricula;
        this.nombre_s = nombre_s;
        this.ap_pat = ap_pat;
        this.ap_mat = ap_mat;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre_s() {
        return nombre_s;
    }
    public void setNombre_s(String nombre_s) {
        this.nombre_s = nombre_s;
    }

    public String getAp_pat() {
        return ap_pat;
    }
    public void setAp_pat(String ap_pat) {
        this.ap_pat = ap_pat;
    }

    public String getAp_mat() {
        return ap_mat;
    }
    public void setAp_mat(String ap_mat) {
        this.ap_mat = ap_mat;
    }

    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
