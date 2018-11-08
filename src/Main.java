import java.util.*;

public class Main {

    public static void main(String[] args) {
        Hoteles hotelCheck = new Hoteles ();

        ArrayList <String> hotelNombre = new ArrayList <>();
        ArrayList <Integer> hotelPrecio = new ArrayList <>();
        ArrayList <Boolean> hotelPiscina = new ArrayList <>();
        ArrayList <Boolean> hotelWifi = new ArrayList <>();
        ArrayList <Boolean> hotelParking = new ArrayList <>();

        System.out.println("Cuantos hoteles quiere comparar?");
        Scanner sc = new Scanner (System.in);
        int numHoteles = sc.nextInt ();

//NOMBRE

        for (int i=0;i<numHoteles;i++){
            sc.nextLine();
            System.out.println("Introduzca el nombre del hotel número " +"#"+ (i+1) + ".");
            String nombreHotel = sc.nextLine ();
            hotelCheck.setNombre(nombreHotel);
            hotelNombre.add(i, hotelCheck.getNombre());

//PRECIO

            System.out.println("Introduzca el precio del hotel número " +"#"+ (i+1) + ".");
            int precioHotel = sc.nextInt ();
            hotelCheck.setPrecio(precioHotel);
            hotelPrecio.add(i, hotelCheck.getPrecio());

//PISCINA

            System.out.println("¿Tiene el hotel número " +"#"+ (i+1) + " piscina?");
            System.out.println("Escriba 's' para sí o 'n' para no.");
            while (true) {
                String piscinaHotel = sc.next();
                if (piscinaHotel.equals("s")) {
                    hotelCheck.setPiscina(true);
                    hotelPiscina.add(hotelCheck.isPiscina());
                    break;
                }
                if (piscinaHotel.equals("n")) {
                    hotelCheck.setPiscina(false);
                    hotelPiscina.add(hotelCheck.isPiscina());
                    break;
                } else if (!"s".equals(piscinaHotel) && !"n".equals(piscinaHotel)) {
                    System.out.println("Es necesario escribir 'n' o 's'.");
                }
            }
//WIFI
            System.out.println("¿Tiene el hotel número " + "#" + (i + 1) + " wifi?");
            System.out.println("Escriba 's' para sí o 'n' para no.");
            while (true) {
                    String wifiHotel = sc.next();
                        if (wifiHotel.equals("s")) {
                            hotelCheck.setWifi(true);
                            hotelWifi.add(hotelCheck.isWifi());
                            break;
                        }
                        if (wifiHotel.equals("n")) {
                            hotelCheck.setWifi(false);
                            hotelWifi.add(hotelCheck.isWifi());
                            break;
                        } else if (!"s".equals(wifiHotel) && !"n".equals(wifiHotel)) {
                            System.out.println("Es necesario escribir 'n' o 's'.");
                        }
                    }

//PARKING

            System.out.println("¿Tiene el hotel número " +"#"+ (i+1) + " parking?");
            System.out.println("Escriba 's' para sí o 'n' para no.");
            String parkingHotel = sc.next();
            if (parkingHotel.equals("s")){
                hotelParking.add(Boolean.TRUE);
            }
            if (parkingHotel.equals("n")){
                hotelParking.add(Boolean.FALSE);
            }
            else if (!"s".equals(parkingHotel) && !"n".equals(parkingHotel)){
                System.out.println("Es necesario escribir 'n' o 's'.");
            }
        }

        System.out.println("Resumen:");
        System.out.println("Nombre" +" "+ "Precio" +" "+ "Piscina" +" "+"Wifi" +" "+ "Parking");
        for (int j=0;j<numHoteles;j++){
            System.out.println(hotelNombre.get(j) + " "+ hotelPrecio.get(j) +" "+ hotelPiscina.get(j) +" "+ hotelWifi.get(j) +" "+ hotelParking.get(j));
        }

    }
}