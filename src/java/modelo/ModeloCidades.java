/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Libertas
 */
public class ModeloCidades implements Modelo {

    @Override
    public void executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

        System.out.println("Executando a logica ...");
        System.out.println("Redirecionando pro JSP ...");

        RequestDispatcher rd = req.
                getRequestDispatcher("/cidades.html");
        rd.forward(req, res);


    }
}
