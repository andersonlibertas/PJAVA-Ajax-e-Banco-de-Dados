/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dao.CidadeDao;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Libertas
 */
public class ModeloAjaxCidades implements Modelo {

    @Override
    public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String pesquisa = request.getParameter("pesquisa");

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        response.setHeader("Cache-control", "no-cache, no-store");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "-1");

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST");
        response.setHeader("Access-Control-Allow-Headers",
                "Content-Type");
        response.setHeader("Access-Control-Max-Age", "86400");

        Gson gson = new Gson();
        JsonObject myObj = new JsonObject();

        CidadeDao cDao = new CidadeDao();

        JsonElement jsonObj = gson.toJsonTree(cDao.listar(pesquisa));
        myObj.add("dados", jsonObj);
        out.println(jsonObj.toString());

        out.close();


    }
}
