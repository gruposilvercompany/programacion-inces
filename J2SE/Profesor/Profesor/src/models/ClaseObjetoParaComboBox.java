/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author jjma
 */
public class ClaseObjetoParaComboBox {

    private String nombreDeEjemplo;
    private int codigo;

    public ClaseObjetoParaComboBox(int codigo, String nombreDeEjemplo) {
        this.codigo = codigo;
        this.nombreDeEjemplo = nombreDeEjemplo;
    }

    public String getNombreDeEjemplo() {
        return nombreDeEjemplo;
    }

    public void setNombreDeEjemplo(String nombreDeEjemplo) {
        this.nombreDeEjemplo = nombreDeEjemplo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        return nombreDeEjemplo;
    }
}
