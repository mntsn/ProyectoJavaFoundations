public class Hoteles {
//svsd
    private String nombre;
    private int precio;
    private boolean piscina;
    private boolean wifi;
    private boolean parking;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombreHotel) {
        if (nombreHotel==null||nombreHotel.isEmpty()){
            System.out.println("El nombre no puede estar vacio.");
        }
        else {
            nombre = nombreHotel;
        }
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precioHotel) {
        if (precioHotel<0){
            System.out.println("El precio debe ser positivo.");
        }
        else {
            precio = precioHotel;
        }
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