package app_escuela;

public class Alumno {
    private int matricula;
    private String nombre_s;
    private String ap_pat;
    private String ap_mat;
    private int semestre;
    private int carrera_id;

    public Alumno() {
    }

    public Alumno(int matricula, String nombre_s, String ap_pat, String ap_mat, int semestre, int carrera_id) {
        this.matricula = matricula;
        this.nombre_s = nombre_s;
        this.ap_pat = ap_pat;
        this.ap_mat = ap_mat;
        this.semestre = semestre;
        this.carrera_id = carrera_id;
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

    public int getCarrera_id() {
        return carrera_id;
    }
    public void setCarrera_id(int carrera_id) {
        this.carrera_id = carrera_id;
    }
}
