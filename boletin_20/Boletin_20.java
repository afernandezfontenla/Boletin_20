/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_20;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuevo usuario
 */
public class Boletin_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Libreria> lista = new ArrayList();
        ArrayListMetodos obx = new ArrayListMetodos();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("     Menu      "
                    + "\n1.Introducir título"
                    + "\n2.Introducir autor"
                    + "\n3.Introducir ISBN"
                    + "\n4.Introducir prezo"
                    + "\n5.Introducir numero de unidades"));
            switch (opcion) {
                case 1:
                    lista.add(obx.crearLibro());
                    break;
                case 2:
                    obx.amosar(lista);
                    break;
                case 3:
                    obx.buscarElementoISBN(lista);
                    break;
                case 4:
                    obx.darBaixa(lista);
                    break;
                case 5:;
                    break;

            }
        } while (opcion != 6);
    }

}
