package com.nataliia;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/register")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (!Storage.storage.containsKey(login)) {
            Storage.storage.put(login, password);

            req.setAttribute("loginValue", login);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/registrationSuccess.jsp");
            dispatcher.forward(req, resp);
        }

    }
}
