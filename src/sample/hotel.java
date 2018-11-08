package sample;

public class hotel {
    private String nombre;
    private int precio;
    private boolean piscina;
    private boolean wifi;
    private boolean parking;

    hotel (String nombre){

    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setPrecio (int precio){
        this.precio=precio;
    }

    public int getPrecio (){
        return precio;
    }

    public void setPiscina (boolean piscina){
        this.piscina= piscina;
    }
    public boolean getPiscina(){
        return piscina;
    }

    public void setWifi (boolean wifi){
        this.wifi=wifi;
    }
    public boolean getWifi (){
        return wifi;
    }

    public void setParking (boolean parking){
        this.parking= parking;
    }
    public boolean getParking (){
        return parking;
    }
}