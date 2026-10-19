# Ejercicio 4 - Firma de Métodos y Retorno de Datos (Calculadora)

## Explicación del programa

En este ejercicio se creó una clase llamada `Calculadora` que no requiere atributos de estado, enfocándose en la implementación de métodos con firma parametrizada y retorno de valores primitivos de tipo `double`.

La clase cuenta con cuatro métodos:
* `sumar(double a, double b)`: Retorna la suma de dos números de tipo `double`.
* `restar(double a, double b)`: Retorna la resta de dos números de tipo `double`.
* `multiplicar(double a, double b)`: Retorna la multiplicación de dos números de tipo `double`.
* `dividir(double a, double b)`: Evalúa mediante una estructura condicional `if/else` que el divisor `b` sea distinto de `0.0`. En caso de ser cero, muestra un mensaje por pantalla advertiendo el error y retorna `0.0`. De lo contrario, retorna la división entre ambos números.

Luego, dentro del método `main`, se instanció un objeto de tipo `Calculadora` y se realizaron invocaciones a cada uno de sus métodos, almacenando los resultados devueltos en variables locales de tipo `double`:
* `double suma = calcula1.sumar(10.0, 5.0);`
* `double resta = calcula1.restar(10.0, 4.0);`
* `double multiplicacion = calcula1.multiplicar(3.0, 3.0);`
* `double division = calcula1.dividir(20.0, 4.0);`

Finalmente, se utilizó `System.out.println()` para mostrar por consola los valores almacenados en cada variable local.

## Lógica utilizada

La lógica del programa consiste en:
* Crear la clase `Calculadora`.
* Definir los métodos `sumar`, `restar`, `multiplicar` y `dividir` especificando sus firmas con parámetros de tipo `double` y tipos de retorno `double`.
* Implementar la validación dentro de `dividir()` mediante un `if` para evitar la división por cero y manejar la condición retornando `0.0` y mostrando un aviso.
* Instanciar la calculadora (`calcula1`) dentro del método `main`.
* Invocar los métodos pasando argumentos de tipo `double` y guardar cada valor retornado en su variable correspondiente.
* Mostrar los resultados obtenidos por consola.

De esta manera se puede observar cómo los métodos pueden recibir información a través de parámetros y retornar un resultado procesado para ser reutilizado en el programa.

## Resultado de la ejecución

La ejecución del programa muestra en la consola los resultados de las operaciones:
* El resultado de la suma es: 15.0
* El resultado de la resta es: 6.0
* El resultado de la multiplicación es: 9.0
* El resultado de la división es: 5.0

## Captura de pantalla

<img width="1331" height="247" alt="Ejercicio 4" src="https://github.com/user-attachments/assets/001eb003-47a0-4ff9-858b-c81e7b4b3ef1" />
