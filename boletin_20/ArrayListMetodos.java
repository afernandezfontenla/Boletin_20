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
public class ArrayListMetodos implements Comparable {

    public Libreria crearLibro() {
        String titulo = JOptionPane.showInputDialog("Titulo");
        String autor = JOptionPane.showInputDialog("Autor");
        String ISBN = JOptionPane.showInputDialog("ISBN");
        float prezo = Float.parseFloat(JOptionPane.showInputDialog("Prezo"));
        int numeroDeUnidades = Integer.parseInt(JOptionPane.showInputDialog("Numero de Unidades"));
        Libreria a = new Libreria(titulo, autor, ISBN, prezo, numeroDeUnidades);
        return a;
    }

    public void amosar(ArrayList<Libreria> lista) {
        for (Libreria ele : lista) {
            System.out.println(ele);
        }
    }

    public void buscarElementoISBN(ArrayList<Libreria> lista) {
        String nome = JOptionPane.showInputDialog("Cal e o ISBN?");
        for (Libreria x : lista) {
            if (nome.equals(x.ISBN)) {
                System.out.println(nome + "" + x);
            }
        }
    }

    public void darBaixa(ArrayList<Libreria> lista) {
        String num = JOptionPane.showInputDialog("");
        int a = 0;
        for (Libreria x : lista) {
            a++;
            if (num.equals(x.titulo)) {
                lista.remove(a);
            }

        }
    }

    public void eliminar(ArrayList<Libreria> lista) {
        int a = 0;
        for (Libreria x : lista) {
            a++;
            if (x.numeroDeUnidades < 0) {
                lista.remove(a);
            }
        }
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
