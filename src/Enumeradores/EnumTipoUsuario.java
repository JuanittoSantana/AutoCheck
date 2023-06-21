package Enumeradores;

/**
 *
 * @author Pepe
 */
public enum EnumTipoUsuario {
    ADMINISTRADOR("Admin"),
    ACADÉMICO("Académico"),
    ADMINISTRATIVO("Administrativo"),
    PROFESOR("Profesor"),
    ALUMNO("Alumno"),
    GUARDIA("Guardia"),
    OTRO("Otro");
    
    private final String tipo;
    
    EnumTipoUsuario(String tipoServicio){
    tipo = tipoServicio;    
    }
}
