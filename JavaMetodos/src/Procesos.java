import javax.swing.*;
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

public class Procesos {


    int eleccion;
    double numero1, numero2;
    String menu= """
            ¿Que operacion desea realizar?
            
            1. Suma
            2. Resta
            3. Multiplicacion
            4. Division
            5. Calcular modulo
            """;

    public void solicitarNumero(){
        numero1 =Double.parseDouble(JOptionPane.showInputDialog("Numero 1"));
        eleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        numero2 =Double.parseDouble(JOptionPane.showInputDialog("numero 2"));

    }
//    public void Operacion(){
//        double resultado=0;
//        switch (eleccion) {
//            case 1:
//                resultado= (numero1 + numero2);
//                break;
//            case 2:
//                resultado = (numero1 - numero2);
//
//                break;
//            case 3:
//                resultado = (numero1 * numero2);
//
//                break;
//            case 4:
//                resultado = (numero1 / numero2);
//
//                break;
//            case 5:
//                resultado = (numero1 % numero2);
//
//                break;
//            default:
//            break;
//
//        }
//        JOptionPane.showMessageDialog(null, "el resltado de la operacion es: " + resultado);
//    }

    public void Operacion(){
        switch (eleccion) {
            case 1:
                if(numero1>= 0 && numero2>=0) {
                    double suma = (numero1 + numero2);
                    JOptionPane.showMessageDialog(null, "el resultado es: " + suma);
                }else {
                    JOptionPane.showMessageDialog(null, "No es posible realizar operaciones con numeros negativos");
                }
                break;
            case 2:
                if(numero1>= 0 && numero2>=0) {
                    double resta = (numero1 - numero2);
                    JOptionPane.showMessageDialog(null, "el resultado es: " + resta);
                }else{
                    JOptionPane.showMessageDialog(null, "No es posible realizar operaciones con numeros negativos");
                }
                break;
            case 3:
                if(numero1>= 0 && numero2>=0) {
                    double multiplicacion = (numero1 * numero2);
                    JOptionPane.showMessageDialog(null, "el resultado es: " + multiplicacion);
                }else{
                    JOptionPane.showMessageDialog(null, "No es posible realizar operaciones con numeros negativos");
                }
                break;
            case 4:
                if(numero1>= 0 && numero2>=0) {
                    if (numero2 == 0) {
                        JOptionPane.showMessageDialog(null, "No es posible dividir entre cero");
                    } else{
                        double division = (numero1 / numero2);
                    JOptionPane.showMessageDialog(null, "el resultado es: " + division);
                    }}else {
                    JOptionPane.showMessageDialog(null, "No es posible realizar operaciones con numeros negativos");
                }
                break;
            case 5:
                if(numero1>= 0 && numero2>=0) {
                    if(numero2==0) {
                        JOptionPane.showMessageDialog(null, "No es posible dividir entre cero");
                    }else{
                        double modulo = (numero1 % numero2);
                        JOptionPane.showMessageDialog(null, "el resultado es: " + modulo);
                    }}else{
                    JOptionPane.showMessageDialog(null, "No es posible realizar operaciones con numeros negativos");
                    }
                break;
            default:
                break;

        }
    }

}
