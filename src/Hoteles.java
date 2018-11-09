public class Hoteles {

    private String nombre;
    private int precio;
    private boolean piscina;
    private boolean wifi;
    private boolean parking;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombreHotel) {
            nombre = nombreHotel;
        }


    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precioHotel) {

            precio = precioHotel;
        }


    public boolean isPiscina() {
        return piscina;
    }
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }
}