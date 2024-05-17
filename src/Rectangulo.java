public class Rectangulo extends Figura {

    //Atributos del rectangulo
    private double base;

    private double altura;


    //Este es el controlador del rectangulo
    public Rectangulo (int base, int altura, String Color){
        super(Color);
        this.base = base;
        this.altura = altura;
    }
    //Implementación de los métodos de Figura
    @Override
    double area() {
        return base * altura;

    }

    @Override
    double perimetro() {
        return 2 * base + 2 * altura;
    }






    //Interfaz para pintar la figura
    @Override
    public void pintar(){
        System.out.println("La figura se está pintando");
    }
}


