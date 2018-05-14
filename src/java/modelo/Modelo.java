/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Libertas
 */
public interface Modelo {
        public void executa(HttpServletRequest req,
HttpServletResponse res) throws Exception;

}
