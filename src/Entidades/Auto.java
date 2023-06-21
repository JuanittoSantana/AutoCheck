package Entidades;

/**
 *
 * @author Pepe
 */
public class Auto {

    private int numAuto;
    private String placa;
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private String tipoAuto;
    private int pasajeros;

    public Auto() {
    }

    public Auto(int numAuto, String placa, String marca, String modelo, int año, String color, String tipoAuto, int pasajeros) {
        this.numAuto = numAuto;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.tipoAuto = tipoAuto;
        this.pasajeros = pasajeros;
    }

    public Auto(int numAuto, String placas, String marca, String color, String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumAuto() {
        return numAuto;
    }

    public void setNumAuto(int numAuto) {
        this.numAuto = numAuto;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

   // @Override
   // public String toString() {
     // este Return marca error   return "Num Auto: "+this.numAuto+"\tModelo: "+this.modelo+"\Año: "+this.año;
   // }

//    @Override
//    public boolean equals(Object auto) {
//        try {
//            Auto a = (Auto)auto;
//            return this.numAuto == a.numAuto;
//        } catch (Exception e) {
//            return false;
//        }
//
//    }
    @Override
    public boolean equals(Object placas) {
        try {
           
            return this.placa.equals(placas.toString());
        } catch (Exception e) {
            return false;
        }

    }
}
