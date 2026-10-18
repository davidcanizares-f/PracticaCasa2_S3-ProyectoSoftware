package negocio;

public class Proyecto {

    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacío.");
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            this.terminado = (progreso == 100);
        } else {
            System.out.println("Error: el progreso debe estar entre 0 y 100.");
        }
    }
    public int getProgreso() {
        return progreso;
    }

    public void setResponsable(String responsable) {
        if (responsable != null && !responsable.isBlank()) {
            this.responsable = responsable;
        } else {
            System.out.println("Error: el responsable no puede estar vacío.");
        }
    }
    public String getResponsable() {
        return responsable;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
    public boolean isTerminado() {
        return terminado;
    }


    //metodo adicional
    public void avanzar(int porcentaje) {
        if (porcentaje > 0) {
            int nuevoProgreso = this.progreso + porcentaje;
            if (nuevoProgreso > 100) {
                nuevoProgreso = 100; // nunca supera 100
            }
            this.progreso = nuevoProgreso;
            if (this.progreso == 100) {
                this.terminado = true;
            }
        }

    }
}