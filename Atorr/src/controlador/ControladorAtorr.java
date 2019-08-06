/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoAtorr;
import javax.swing.JOptionPane;
import modelo.Atorr;
import tela.manutencao.ManutencaoAtorr;

import tela.manutencao.ManutencaoAtorr;

/**
 *
 * @author Clovis
 */
public class ControladorAtorr {

    public static void inserir(ManutencaoAtorr man){
        Atorr objeto = new Atorr();
        objeto.setNome_real(man.jtfNomeReal.getText());
        objeto.setNome_artistico(man.jtfNomeArtistico.getText());
        
        boolean resultado = DaoAtorr.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(ManutencaoAtorr man){
        Atorr objeto = new Atorr();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setNome_real(man.jtfNomeReal.getText());
        objeto.setNome_artistico(man.jtfNomeArtistico.getText());
        
        boolean resultado = DaoAtorr.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

     public static void excluir(ManutencaoAtorr man){
        Atorr objeto = new Atorr();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = DaoAtorr.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    
}
