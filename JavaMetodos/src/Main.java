public class Main {

    /*
    * simulador de operaciones matematicas, donde solicite al usuario el ingreso de dos numeros
    * mediante un menu:
    *
    * 1.sumar
    * 2.resta
    * 3.multiplicacion
    * 4.division
    * 5.calcular modulo
    *
    * que en dividir no se pueda dividir en cero,
    *
    * */

    public static void main(String[] args) {
        Procesos calculadora;
        calculadora = new Procesos();

        calculadora.solicitarNumero();
        calculadora.Operacion();

    }
}