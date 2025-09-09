package main.java.codeup.academico.domain;

public class Estudiante {

    private final String id; //identificador del estudiante
    private String nombre;

    //constructor: crea un estudiante con id y nombre
    public Estudiante(String id, String nombre) {

        if (id == null || id.isBlank()) throw new IllegalArgumentException("id requerido");
        if (nombre == null || nombre.isBlank()) throw  new IllegalArgumentException("nombre requerido");
        this.id = id;
        this.nombre= nombre;


    }

    //metodos para obtener los datos del estudiante
    public  String getId() {return id; }

    public String getNombre() {return nombre; }
}