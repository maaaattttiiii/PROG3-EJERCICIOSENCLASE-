package Ejercicio2.src;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Continente sudamerica = new Continente("Sudamerica");

        Pais argentina = new Pais("Argentina");
        Pais chile = new Pais("Chile");

        Provincia buenosAires = new Provincia("Buenos Aires");
        Provincia mendoza = new Provincia("Mendoza");
        Provincia santiago = new Provincia("Santiago");

        Ciudad laPlata = new Ciudad("La Plata");
        Ciudad marDelPlata = new Ciudad("Mar del Plata");
        Ciudad ciudadMendoza = new Ciudad("Ciudad de Mendoza");
        Ciudad ciudadSantiago = new Ciudad("Santiago de Chile");

        buenosAires.agregarCiudad(laPlata);
        buenosAires.agregarCiudad(marDelPlata);
        buenosAires.setCapital(laPlata);

        mendoza.agregarCiudad(ciudadMendoza);
        mendoza.setCapital(ciudadMendoza);

        santiago.agregarCiudad(ciudadSantiago);
        santiago.setCapital(ciudadSantiago);

        buenosAires.agregarLimiteProvincia(mendoza);
        mendoza.agregarLimitePais(chile);

        argentina.agregarProvincia(buenosAires);
        argentina.agregarProvincia(mendoza);
        argentina.setCapital(laPlata);

        chile.agregarProvincia(santiago);
        chile.setCapital(ciudadSantiago);

        argentina.agregarLimitePais(chile);

        sudamerica.agregarPais(argentina);
        sudamerica.agregarPais(chile);

        System.out.println("Continente: " + sudamerica.getNombre());
        System.out.println("Paises: " + sudamerica.getPaises().stream()
                .map(Pais::getNombre)
                .collect(Collectors.joining(", ")));

        imprimirPais(argentina);
        imprimirPais(chile);

        System.out.println("Provincia " + mendoza.getNombre() + " limita con paises: "
                + mendoza.getLimitesPaises().stream()
                .map(Pais::getNombre)
                .collect(Collectors.joining(", ")));
    }

    private static void imprimirPais(Pais pais) {
        String provincias = pais.getProvincias().stream()
                .map(Provincia::getNombre)
                .collect(Collectors.joining(", "));

        String limites = pais.getLimitesPaises().stream()
                .map(Pais::getNombre)
                .collect(Collectors.joining(", "));

        System.out.println("---");
        System.out.println("Pais: " + pais.getNombre());
        System.out.println("Capital: " + pais.getCapital());
        System.out.println("Provincias: " + provincias);
        System.out.println("Limites: " + limites);
    }
}
