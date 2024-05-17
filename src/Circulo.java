public class Circulo extends Figura {

    //Atributos exclusivos de Circulo
    private double radio;

    //Este es el constructor de Circulo
    public Circulo(double radio, String Color){
        super(Color);
        this.radio = radio;
    }

    //Implementación de los métodos de Figura
    @Override
    double area() {
        return Math.PI * radio * radio;
    }

    @Override
    double perimetro() {
        return Math.PI * 2 * radio;
    }

    //Interfaz para pintar la figura
    @Override
    public void pintar(){
        System.out.println("La figura se está pintando");
    }
}
