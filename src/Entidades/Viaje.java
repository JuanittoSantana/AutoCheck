package Entidades;

import java.util.Date;

/**
 *
 * @author Pepe
 */
public class Viaje {

    private int idViaje;
    private String fechaSalida;
    private String fechaLlegada;
    private String horaSalida;
    private String horaLlegada;
    private Auto auto;
    private Usuario conductor;
    private double kmsSalida;
    private double kmsLlegada;
    private String combustibleSalida;
    private String combustibleLlegada;

    public Viaje() {
    }

    public Viaje(int idViaje, String fechaSalida, String fechaLlegada, String horaSalida, String horaLlegada, Auto auto, Usuario conductor, double kmsSalida, double kmsLlegada, String combustibleSalida, String combustibleLlegada) {
        this.idViaje = idViaje;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.auto = auto;
        this.conductor = conductor;
        this.kmsSalida = kmsSalida;
        this.kmsLlegada = kmsLlegada;
        this.combustibleSalida = combustibleSalida;
        this.combustibleLlegada = combustibleLlegada;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Usuario getConductor() {
        return conductor;
    }

    public void setConductor(Usuario conductor) {
        this.conductor = conductor;
    }

    public double getKmsSalida() {
        return kmsSalida;
    }

    public void setKmsSalida(double kmsSalida) {
        this.kmsSalida = kmsSalida;
    }

    public double getKmsLlegada() {
        return kmsLlegada;
    }

    public void setKmsLlegada(double kmsLlegada) {
        this.kmsLlegada = kmsLlegada;
    }

    public String getCombustibleSalida() {
        return combustibleSalida;
    }

    public void setCombustibleSalida(String combustibleSalida) {
        this.combustibleSalida = combustibleSalida;
    }

    public String getCombustibleLlegada() {
        return combustibleLlegada;
    }

    public void setCombustibleLlegada(String combustibleLlegada) {
        this.combustibleLlegada = combustibleLlegada;
    }

}
