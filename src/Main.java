//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculadora calcula1 = new Calculadora();

        double suma = calcula1.sumar(10.0, 5.0);
        double resta = calcula1.restar(10.0, 4.0);
        double multiplicacion = calcula1.multiplicar(3.0, 3.0);
        double division = calcula1.dividir(20.0, 4.0);

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);

    }
}