package Enumeradores;

/**
 *
 * @author Pepe
 */
public enum EnumTipoServicio {
    AFINACIÓN("Servicio de afinación"), 
    BALANCEO("Balanceo"),
    ALINEACIÓN("Alineación"),
    FRENOS("Frenos, balatas"),
    SUSPENSIÓN("Supención"),
    ADMISIÓN("Admision: Inyectores, filtros"),
    TRANSMISIÓN("Transmisión");
    
    private final String tipoServicio;
    EnumTipoServicio(String tipo){
        this.tipoServicio=tipo;
    }
    
}
