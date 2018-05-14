/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import pojo.Cidade;

/**
 *
 * @author Libertas
 */
public class CidadeDao {
        public ArrayList<Cidade> listar(String pesquisa) {
        ArrayList<Cidade> lista = new ArrayList<Cidade>();
        lista.add(new Cidade("SSP","MG"));
        lista.add(new Cidade("STA","MG"));
        lista.add(new Cidade("Jacui","MG"));
        return lista;
    }
    
}
