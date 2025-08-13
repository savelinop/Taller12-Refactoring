public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    private String genero;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento);
        this.bonoAnual = bonoAnual;
        this.genero = genero;
    }


    
        public void imprimirDetalles() {
        imprimirInformacionBasica(); // Desde superclase
        System.out.println("Genero: " + genero);
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Bono Anual: " + bonoAnual);
    }


    // Más metodos
}
