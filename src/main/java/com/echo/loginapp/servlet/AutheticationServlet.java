package com.echo.loginapp.servlet;

import com.echo.loginapp.service.AuthenticationService;
import com.echo.loginapp.service.implementation.AuthenticationServiceImplementation;
import org.omg.CORBA.Request;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by Mihai on 30/6/2015.
 */
public class AutheticationServlet extends HttpServlet {

    AuthenticationService authenticationService;

    @Override
    public void init() throws ServletException {
        authenticationService = new AuthenticationServiceImplementation();
        super.init();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (authenticationService.equals(username)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", "Mihai");
            //setting session to expiry in 30 mins
            session.setMaxInactiveInterval(30 * 60);
            Cookie userName = new Cookie("username", username);
            userName.setMaxAge(30 * 60);
            response.addCookie(userName);
            response.sendRedirect("/WEB-INF/forms/login.jsp");

        } else {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/forms/login.jsp");
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String content = "Welcome";
        req.setAttribute("content" , content);
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/forms/mainPage.jsp");
        requestDispatcher.forward(req, resp);

    }
}
