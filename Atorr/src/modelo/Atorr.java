/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Clovis
 */
public class Atorr {
    private int codigo;
    private String nome_real;
    private String nome_artistico;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome_real() {
        return nome_real;
    }

    public void setNome_real(String nome_real) {
        this.nome_real = nome_real;
    }

    public String getNome_artistico() {
        return nome_artistico;
    }

    public void setNome_artistico(String nome_artistico) {
        this.nome_artistico = nome_artistico;
    }

    @Override
    public String toString() {
        return "Atorr{" + "nome_artistico=" + nome_artistico + '}';
    }
    
}
