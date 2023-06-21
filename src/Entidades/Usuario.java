package Entidades;
import Enumeradores.EnumTipoUsuario;
/**
 *
 * @author Pepe
 */
public class Usuario {
    String id;
    String nombre;
    String correo;
    EnumTipoUsuario tipoUsuario; 
    String area;

    public Usuario() {
    }

    public Usuario(String id, String nombre, String correo, EnumTipoUsuario tipoUsuario, String area) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.tipoUsuario = tipoUsuario;
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EnumTipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(EnumTipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
}
