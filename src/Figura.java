
//Esta es la clase abstracta Figura solicitada en el ejercicio 1
public abstract class Figura implements Pintable{

    //Atributos
    protected String Color;

    //Constructor
    public Figura(String Color){
        this.Color = Color;
    }


    //Estos son los métodos abstractos area y perimetro
    abstract double area();


    abstract double perimetro();

    //Interfaz para pintar la figura
    public abstract void pintar();


//accespres y mutadores para los atributos encapsulados

public String getColor(){
    return Color;
}

public void setColor(String Color){
    this.Color =Color;
}}