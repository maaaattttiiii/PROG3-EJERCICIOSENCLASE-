package Ejercicio6.src;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ComunidadAutonoma comunidad = new ComunidadAutonoma("Andalucia");
        Organismo organismo = new Organismo("Organismo de Parques", "Publico");
        ParqueNacional parque = new ParqueNacional("Sierra Verde");

        comunidad.agregarParqueNacional(parque);
        organismo.agregarParqueGestionado(parque);

        Area humedales = new Area("Humedales Norte", "Humedal");
        Area bosque = new Area("Bosque Central", "Bosque");
        parque.agregarArea(humedales);
        parque.agregarArea(bosque);

        Especie flamenco = new EspecieAnimal("Phoenicopterus roseus", "Flamenco", "Omnivoro", false);
        Especie lince = new EspecieAnimal("Lynx pardinus", "Lince iberico", "Carnivoro", true);
        Especie alcornoque = new EspecieVegetal("Quercus suber", "Alcornoque", "Arboreo", false);

        humedales.agregarEspecie(flamenco);
        bosque.agregarEspecie(lince);
        bosque.agregarEspecie(alcornoque);

        Personal guia = new Personal("Ana Ruiz", "P-100", "600111222", "Guia");
        guia.setAreaAsignada(humedales);
        Personal biologo = new Personal("Luis Vega", "P-200", "600333444", "Biologo");
        biologo.setAreaAsignada(bosque);
        parque.agregarPersonal(guia);
        parque.agregarPersonal(biologo);

        ProyectoInvestigacion proyecto = new ProyectoInvestigacion(
                "Seguimiento del lince",
                "Monitorear poblacion y zonas de alimentacion",
                bosque
        );
        proyecto.agregarInvestigador(biologo);
        proyecto.agregarEspecieObjetivo(lince);
        parque.agregarProyectoInvestigacion(proyecto);

        Vehiculo minibus = new Vehiculo("1234-ABC", "Minibus", 12, guia);
        Excursion excursion = new Excursion("Ruta de Humedales", humedales, guia, 10);
        excursion.setVehiculo(minibus);
        parque.agregarExcursion(excursion);

        Alojamiento ecoLodge = new Alojamiento("EcoLodge Sierra", "Cabania", 20);
        parque.agregarAlojamiento(ecoLodge);

        Visitante visitante1 = new Visitante("Maria Perez", "V-001", "611000111", "Madrid");
        Visitante visitante2 = new Visitante("Carlos Diaz", "V-002", "611000222", "Sevilla");

        Entrada entrada1 = new Entrada("E-1001", "2026-08-24", parque);
        Entrada entrada2 = new Entrada("E-1002", "2026-08-24", parque);
        visitante1.agregarEntrada(entrada1);
        visitante2.agregarEntrada(entrada2);

        visitante1.reservarExcursion(excursion);
        visitante2.reservarExcursion(excursion);

        Hospedaje hospedaje1 = new Hospedaje(visitante1, ecoLodge, "2026-08-24", "2026-08-26");
        Hospedaje hospedaje2 = new Hospedaje(visitante2, ecoLodge, "2026-08-24", "2026-08-25");

        RegistroVisita registro1 = new RegistroVisita(entrada1, excursion, hospedaje1, "Primera visita al parque.");
        RegistroVisita registro2 = new RegistroVisita(entrada2, excursion, hospedaje2, "Interes en fauna local.");
        parque.agregarRegistroVisita(registro1);
        parque.agregarRegistroVisita(registro2);

        imprimirResumen(parque);
    }

    private static void imprimirResumen(ParqueNacional parque) {
        System.out.println("==== RESUMEN DEL PARQUE NACIONAL ====");
        System.out.println("Parque: " + parque.getNombre());
        System.out.println("Comunidad: " + parque.getComunidadAutonoma().getNombre());
        System.out.println("Organismo gestor: " + parque.getOrganismoGestor());

        System.out.println("\nAreas:");
        for (Area area : parque.getAreas()) {
            String especies = area.getEspecies().stream()
                    .map(e -> e.getNombreComun() + " (" + e.getClasificacion() + ")")
                    .collect(Collectors.joining(", "));
            System.out.println("- " + area + " -> Especies: " + especies);
        }

        System.out.println("\nPersonal:");
        for (Personal persona : parque.getPersonal()) {
            String area = persona.getAreaAsignada() != null ? persona.getAreaAsignada().getNombre() : "Sin asignar";
            System.out.println("- " + persona + " | Cargo: " + persona.getCargo() + " | Area: " + area);
        }

        System.out.println("\nProyectos de investigacion:");
        for (ProyectoInvestigacion proyecto : parque.getProyectosInvestigacion()) {
            String investigadores = proyecto.getInvestigadores().stream()
                    .map(Personal::getNombre)
                    .collect(Collectors.joining(", "));
            String especies = proyecto.getEspeciesObjetivo().stream()
                    .map(Especie::getNombreComun)
                    .collect(Collectors.joining(", "));
            System.out.println("- " + proyecto.getTitulo());
            System.out.println("  Objetivo: " + proyecto.getObjetivo());
            System.out.println("  Investigadores: " + investigadores);
            System.out.println("  Especies objetivo: " + especies);
        }

        System.out.println("\nExcursiones:");
        for (Excursion excursion : parque.getExcursiones()) {
            String visitantes = excursion.getVisitantes().stream()
                    .map(Visitante::getNombre)
                    .collect(Collectors.joining(", "));
            System.out.println("- " + excursion.getNombre() + " | Area: " + excursion.getArea().getNombre());
            System.out.println("  Guia: " + excursion.getGuia().getNombre());
            System.out.println("  Vehiculo: " + excursion.getVehiculo());
            System.out.println("  Visitantes: " + visitantes);
        }

        System.out.println("\nAlojamientos:");
        for (Alojamiento alojamiento : parque.getAlojamientos()) {
            System.out.println("- " + alojamiento + " | Hospedajes activos: " + alojamiento.getHospedajes().size());
        }

        System.out.println("\nRegistros de visita: " + parque.getRegistrosVisita().size());
        for (RegistroVisita registro : parque.getRegistrosVisita()) {
            System.out.println("- Entrada " + registro.getEntrada() + " | Excursion: "
                    + registro.getExcursion().getNombre() + " | Nota: " + registro.getObservaciones());
        }
    }
}