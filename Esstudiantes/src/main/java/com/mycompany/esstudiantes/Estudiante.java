
package com.mycompany.esstudiantes;

public class Estudiante {

    String nombre;
    int edad;
    float notas[];

    public Estudiante(String nombre, int edad, float notas[]) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float notas[]) {
        this.notas = notas;
    }
}
