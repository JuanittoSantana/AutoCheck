package Entidades;
import Enumeradores.EnumTipoServicio;
import java.util.Date;
/**
 *
 * @author Pepe
 */
public class Servicio {
   static int folio=0;
   int numeroServicio;
   Auto auto;
  EnumTipoServicio tipo;
  String detalleServicio;
  String proveedor;
  double costo;
  Date fechaServicio;

  public Servicio(){
      
  }
    public Servicio(int numeroServicio, Auto auto, EnumTipoServicio tipo, String detalleServicio, String proveedor, double costo, Date fechaServicio) {
        this.numeroServicio = numeroServicio;
        this.auto = auto;
        this.tipo = tipo;
        this.detalleServicio = detalleServicio;
        this.proveedor = proveedor;
        this.costo = costo;
        this.fechaServicio = fechaServicio;
        folio++;
    }

    public Servicio(int Folio, int numeroServicio, String detalleServicio, String provedor, double costo, String Date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDetalleServicio() {
        return detalleServicio;
    }

    public void setDetalleServicio(String detalleServicio) {
        this.detalleServicio = detalleServicio;
    }

    public Date getFechaServicio() {
        return fechaServicio;
    }

    public void setFechaServicio(Date fechaServicio) {
        this.fechaServicio = fechaServicio;
    }

    public static int getFolio() {
        return folio;
    }

    

    public int getNumeroServicio() {
        return numeroServicio;
    }

    public void setNumeroServicio(int numeroServicio) {
        this.numeroServicio = numeroServicio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public EnumTipoServicio getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipoServicio tipo) {
        this.tipo = tipo;
    }

  
  
}
