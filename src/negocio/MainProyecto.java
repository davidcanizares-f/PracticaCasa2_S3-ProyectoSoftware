package negocio;

public class MainProyecto {
    public static void main() {
        Proyecto p = new Proyecto();
        p.setNombre("Sistema de Inventario");
        p.setResponsable("David Canizares");
        p.setProgreso(20);

        System.out.println("\nProyecto: " + p.getNombre());
        System.out.println("Responsable: " + p.getResponsable());
        System.out.println("Progreso inicial: " + p.getProgreso() + "%");

        System.out.println("\n=== Prueba Progreso inválido ===");
        p.setProgreso(150);
        p.setProgreso(-10);
        System.out.println("Progreso: " + p.getProgreso() + "%");

        System.out.println("\n=== Avanzar ===");
        p.avanzar(30);
        System.out.println("Progreso luego de avanzar 30%: " + p.getProgreso() + "%");
        System.out.println("Terminado: " + p.isTerminado());
        p.avanzar(-5);
        System.out.println("Progreso tras avanzar -5%: " + p.getProgreso() + "%");
        p.avanzar(80);
        System.out.println("Progreso luego de avanzar 80%: " + p.getProgreso() + "%");
        System.out.println("Terminado: " + p.isTerminado());
    }

}