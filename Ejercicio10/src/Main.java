package Ejercicio10.src;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        SedeOlimpica sede = new SedeOlimpica("Villa Olimpica Central", "Cordoba");

        Deporte natacion = new Deporte("Natacion", "Acuatico");
        Deporte atletismo = new Deporte("Atletismo", "Pista y campo");
        Deporte baloncesto = new Deporte("Baloncesto", "Equipo");

        ComplejoUnicoDeporte centroAcuatico = new ComplejoUnicoDeporte(
                "Centro Acuatico Sur", "Zona Sur", "Laura Mendez", 12500.0, natacion
        );

        ComplejoPolideportivo arenaNorte = new ComplejoPolideportivo(
                "Arena Norte", "Zona Norte", "Javier Molina", 19800.0
        );
        arenaNorte.agregarDeporte(atletismo);
        arenaNorte.agregarDeporte(baloncesto);

        sede.agregarComplejoDeportivo(centroAcuatico);
        sede.agregarComplejoDeportivo(arenaNorte);

        AreaDesignada piscinaOlimpica = new AreaDesignada("Piscina Olimpica", "Bloque A", natacion);
        AreaDesignada pistaCentral = new AreaDesignada("Pista Central", "Bloque B", atletismo);
        AreaDesignada canchaPrincipal = new AreaDesignada("Cancha Principal", "Bloque C", baloncesto);

        centroAcuatico.agregarAreaDesignada(piscinaOlimpica);
        arenaNorte.agregarAreaDesignada(pistaCentral);
        arenaNorte.agregarAreaDesignada(canchaPrincipal);

        Comisario comisarioTecnico = new Comisario("Sofia Ramos", "Tecnico");
        Comisario comisarioJuez = new Comisario("Diego Torres", "Juez");
        Comisario comisarioLogistica = new Comisario("Elena Cruz", "Logistica");

        Material cronometro = new Material("Cronometro Digital", "Tiempo");
        Material vallas = new Material("Vallas Reglamentarias", "Pista");
        Material balones = new Material("Balones Oficiales", "Juego");

        Evento serie100mLibre = new Evento("Serie 100m Libre", "2026-09-10", 2, 24, piscinaOlimpica);
        serie100mLibre.agregarComisario(comisarioTecnico);
        serie100mLibre.agregarComisario(comisarioJuez);
        serie100mLibre.agregarMaterial(cronometro);
        centroAcuatico.agregarEvento(serie100mLibre);

        Evento final110mVallas = new Evento("Final 110m Vallas", "2026-09-11", 3, 16, pistaCentral);
        final110mVallas.agregarComisario(comisarioJuez);
        final110mVallas.agregarComisario(comisarioLogistica);
        final110mVallas.agregarMaterial(vallas);
        arenaNorte.agregarEvento(final110mVallas);

        Evento semifinalBaloncesto = new Evento("Semifinal Baloncesto", "2026-09-12", 2, 20, canchaPrincipal);
        semifinalBaloncesto.agregarComisario(comisarioTecnico);
        semifinalBaloncesto.agregarComisario(comisarioLogistica);
        semifinalBaloncesto.agregarMaterial(balones);
        arenaNorte.agregarEvento(semifinalBaloncesto);

        imprimirResumen(sede);
    }

    private static void imprimirResumen(SedeOlimpica sede) {
        System.out.println("==== RESUMEN SEDE OLIMPICA ====");
        System.out.println("Sede: " + sede.getNombre());
        System.out.println("Ciudad: " + sede.getCiudad());
        System.out.println("Complejos: " + sede.getComplejosDeportivos().size());

        for (ComplejoDeportivo complejo : sede.getComplejosDeportivos()) {
            System.out.println("\n---");
            System.out.println("Complejo: " + complejo.getNombre() + " [" + complejo.getTipoComplejo() + "]");
            System.out.println("Localizacion: " + complejo.getLocalizacion());
            System.out.println("Jefe: " + complejo.getJefe());
            System.out.println("Area ocupada (m2): " + complejo.getAreaOcupadaM2());

            if (complejo instanceof ComplejoUnicoDeporte) {
                ComplejoUnicoDeporte unico = (ComplejoUnicoDeporte) complejo;
                System.out.println("Deporte principal: " + unico.getDeportePrincipal());
            } else if (complejo instanceof ComplejoPolideportivo) {
                ComplejoPolideportivo poli = (ComplejoPolideportivo) complejo;
                String deportes = poli.getDeportes().stream()
                        .map(Deporte::getNombre)
                        .collect(Collectors.joining(", "));
                System.out.println("Deportes habilitados: " + deportes);
            }

            System.out.println("Areas designadas:");
            for (AreaDesignada area : complejo.getAreasDesignadas()) {
                System.out.println("- " + area.getNombre() + " | " + area.getSituacion() + " | Deporte: " + area.getDeporte().getNombre());
            }

            System.out.println("Eventos:");
            for (Evento evento : complejo.getEventos()) {
                String comisarios = evento.getComisarios().stream()
                        .map(Comisario::getNombre)
                        .collect(Collectors.joining(", "));
                String materiales = evento.getMateriales().stream()
                        .map(Material::getNombre)
                        .collect(Collectors.joining(", "));
                System.out.println("- " + evento.getNombre() + " | Fecha: " + evento.getFecha()
                        + " | Duracion(h): " + evento.getDuracionHoras()
                        + " | Participantes: " + evento.getNroParticipantes());
                System.out.println("  Area: " + evento.getAreaDesignada().getNombre());
                System.out.println("  Comisarios: " + comisarios);
                System.out.println("  Materiales: " + materiales);
            }
        }

        System.out.println("\nComisarios y eventos asociados (bidireccional):");
        for (ComplejoDeportivo complejo : sede.getComplejosDeportivos()) {
            for (Evento evento : complejo.getEventos()) {
                for (Comisario comisario : evento.getComisarios()) {
                    String eventos = comisario.getEventos().stream()
                            .map(Evento::getNombre)
                            .collect(Collectors.joining(", "));
                    System.out.println("- " + comisario.getNombre() + " (" + comisario.getRol() + ") -> " + eventos);
                }
            }
        }
    }
}
