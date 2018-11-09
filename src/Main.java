import java.util.*;

public class Main {

    public static void main(String[] args) {
        Hoteles hotelCheck = new Hoteles();

        ArrayList<String> hotelNombre = new ArrayList<>();
        ArrayList<Integer> hotelPrecio = new ArrayList<>();
        ArrayList<Boolean> hotelPiscina = new ArrayList<>();
        ArrayList<Boolean> hotelWifi = new ArrayList<>();
        ArrayList<Boolean> hotelParking = new ArrayList<>();
        ArrayList<Integer> hotelEstrellas = new ArrayList<>();

        System.out.println("Cuantos hoteles quiere comparar?");
        Scanner sc = new Scanner(System.in);
        int numHoteles = sc.nextInt();

//NOMBRES

        for (int i = 0; i < numHoteles; i++) {
            sc.nextLine();
            System.out.println("Introduzca el nombre del hotel número " + "#" + (i + 1) + ".");
            while (true) {
                String nombreHotel = sc.nextLine();
                if (nombreHotel != null && !nombreHotel.isEmpty()) {
                    hotelCheck.setNombre(nombreHotel);
                    hotelNombre.add(i, hotelCheck.getNombre());
                    break;
                } else if (nombreHotel == null || nombreHotel.isEmpty()) {
                    System.out.println("El nombre no puede estar vacio.");
                }
            }

//PRECIOS

            System.out.println("Introduzca el precio del hotel número " + "#" + (i + 1) + ".");
            while (true) {
                int precioHotel = sc.nextInt();
                if (precioHotel > 0) {
                    hotelCheck.setPrecio(precioHotel);
                    hotelPrecio.add(i, hotelCheck.getPrecio());
                    break;
                } else if (precioHotel < 0) {
                    System.out.println("El precio no pueder ser  negativo.");
                }
            }
//PISCINAS

            System.out.println("¿Tiene el hotel número " + "#" + (i + 1) + " piscina?");
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
//WIFIS
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

//PARKINGS

            System.out.println("¿Tiene el hotel número " + "#" + (i + 1) + " parking?");
            System.out.println("Escriba 's' para sí o 'n' para no.");
            while (true) {
                String parkingHotel = sc.next();
                if (parkingHotel.equals("s")) {
                    hotelParking.add(Boolean.TRUE);
                    break;
                }
                if (parkingHotel.equals("n")) {
                    hotelParking.add(Boolean.FALSE);
                    break;
                } else if (!"s".equals(parkingHotel) || !"n".equals(parkingHotel)) {
                    System.out.println("Es necesario escribir 'n' o 's'.");
                }
            }
//PUNTUACIONES
            Operaciones estrellitas = new Operaciones();
            int sumaEst = 0;
            if (hotelPiscina.get(i) == true) sumaEst++;
            if (hotelWifi.get(i) == true) sumaEst++;
            if (hotelParking.get(i) == true) sumaEst++;
            estrellitas.estrellas(sumaEst);
            hotelEstrellas.add(i, estrellitas.getEstrellas());

        }
            //RESUMEN
            System.out.println("Resumen de los hoteles:");
            System.out.println("Nombre" + " " + "Precio" + " " + "Piscina" + " " + "Wifi" + " " + "Parking");
            for (int j = 0; j < numHoteles; j++) {
                System.out.println(hotelNombre.get(j) + " " +
                        hotelPrecio.get(j) + " " +
                        hotelPiscina.get(j) + " " +
                        hotelWifi.get(j) + " " +
                        hotelParking.get(j) + " " +
                        hotelEstrellas.get(j));
            }

        }
    }

