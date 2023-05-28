
package com.mycompany.mapreduce;


public class Estudiante {
    private String nombre;
    private Boolean isMale;
    private Double promedio;

    public Estudiante(String nombre, Boolean isMale, Double promedio) {
        this.nombre = nombre;
        this.isMale = isMale;
        this.promedio = promedio;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getIsMale() {
        return isMale;
    }

    public void setIsMale(Boolean isMale) {
        this.isMale = isMale;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
    
    public String getFormatoString() {
        return "\n{name:"+nombre + ",isMale:" + isMale + "=>" + promedio+"}";
    }
}
