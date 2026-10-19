public class Calculadora {

public double sumar(double a , double b) {
    return a + b;
}

public double restar(double a , double b){
    return a - b;
}

public double dividir(double a , double b){
    if (b == 0.0){
        System.out.println("el numero no puede ser divisible");
        return 0.0;
    }
    else {
        return a / b;
    }
}

public double multiplicar (double a , double b){
    return a * b;
}

}