package py.fpuna.com.agendapediatricaapp.dto;

import java.sql.Date;



public class VacunaDTO {

    private Character aplicada;
    private Date fechaAplicacion;
    private HijosDTO idHijo;
    private Integer id;
    private String descripcionVacunas;
    private String enfermedadVacunas;


    public VacunaDTO() {
    }

    public VacunaDTO(Character aplicada, Date fechaAplicacion, String descripcionVacunas) {
        this.aplicada = aplicada;
        this.fechaAplicacion = fechaAplicacion;
        this.descripcionVacunas = descripcionVacunas;
    }

    public Character getAplicada() {
        return aplicada;
    }

    public void setAplicada(Character aplicada) {
        this.aplicada = aplicada;
    }

    public Date getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(Date fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public HijosDTO getIdHijo() {
        return idHijo;
    }

    public void setIdHijo(HijosDTO idHijo) {
        this.idHijo = idHijo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcionVacunas() {
        return descripcionVacunas;
    }

    public void setDescripcionVacunas(String descripcionVacunas) {
        this.descripcionVacunas = descripcionVacunas;
    }

    public String getEnfermedadVacunas() {
        return enfermedadVacunas;
    }

    public void setEnfermedadVacunas(String enfermedadVacunas) {
        this.enfermedadVacunas = enfermedadVacunas;
    }
}
