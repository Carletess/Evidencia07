package org.example;

public class CarroCompra {

    private int[][] prodcutos = new int[2][5];

    public CarroCompra() {
        for (int = 0; i < 5; i++){
            productos[0][i] = 1;
            productos[1][i] = 1000;
        }
    }

    private int calcularTotal() {
        int total = 0; subtotal = 0;

        for (int = 0; i < 5; i++){
            total += subTotal(prodcutos[0][i], productos[1][i]);
        }
        return total;
    }

    private int subTotal(int cant, int precio) {
        Calculadora calc = new Calculadora(cant, precio);
        return calc.multiplicar();
    }

    public void mostrarTotal() {
        System.out.println("El total de la compra es: " + this.calcularTotal());
    }

}
