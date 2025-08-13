public abstract class  Departamento {
    abstract double ajustarSalario(double salarioBase);
}
class Sistemas extends Departamento{
    @Override
    public double ajustarSalario(double salarioBase){
        return salarioBase + 20;
    }
}

class Contabilidad extends Departamento{
    @Override
    public double ajustarSalario(double salarioBase) {
        return salarioBase + 10;
    }
}
