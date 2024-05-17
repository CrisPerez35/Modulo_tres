public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo(4, "Rojo");
        figuras[1] = new Rectangulo(10, 5, "Azul");

        // Iterar sobre el arreglo []
        for (Figura v : figuras) {
            System.out.println("Color: " + v.getColor());
            v.pintar();
            System.out.println("Área: " + v.area());
            System.out.println("Perímetro: " + v.perimetro());
        }
    }
}