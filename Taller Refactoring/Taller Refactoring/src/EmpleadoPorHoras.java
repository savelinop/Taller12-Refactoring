public class EmpleadoPorHoras extends Empleado {
    private String genero;
    private double salarioBase;
    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento);
        super.setSalarioBase(calcularSalario());
        this.genero = genero;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + super.getNombre());
        System.out.println("Salario: " + super.getSalarioBase());
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
        System.out.println("Departamento: " + super.getDepartamento());
    }

    

    public double calcularSalario() {
        
        if (getSalarioBase()>0) {
            if (getHorasTrabajadas() >= 0) {
                // Horas trabajadas normales = 40;
                if (getHorasTrabajadas()> 40) {
                    salarioBase += (getHorasTrabajadas() - 40) * 50; // Pago de horas extra
                }
            }else {
                throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
            }
        } else {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
        return salarioBase;
    }

    // Más metodos
}