package Ejercicio10.src;

import java.util.ArrayList;
import java.util.List;

public class Comisario {
    private String nombre;
    private String rol;
    private List<Evento> eventos;

    public Comisario(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
        this.eventos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void agregarEvento(Evento evento) {
        if (evento == null) {
            return;
        }
        if (!eventos.contains(evento)) {
            eventos.add(evento);
        }
        if (!evento.getComisarios().contains(this)) {
            evento.getComisarios().add(this);
        }
    }
}
