package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String busName = request.getParameter("bus-name");

    // Print the value so you can see it in the server logs.
    System.out.println("You submitted: " + busName);

    // Write the value to the response so the user can see it.
    response.getWriter().println("You submitted: " + busName);

    String busDescription = request.getParameter("bus-description");

    // Print the value so you can see it in the server logs.
    System.out.println("You submitted: " + busDescription);

    // Write the value to the response so the user can see it.
    response.getWriter().println("You submitted: " + busDescription);


    String busAddress = request.getParameter("bus-address");

    // Print the value so you can see it in the server logs.
    System.out.println("You submitted: " + busAddress);

    // Write the value to the response so the user can see it.
    response.getWriter().println("You submitted: " + busAddress);

    String busContact = request.getParameter("bus-contact");

    // Print the value so you can see it in the server logs.
    System.out.println("You submitted: " + busContact);

    // Write the value to the response so the user can see it.
    response.getWriter().println("You submitted: " + busContact);

    response.getWriter().println("Thank you for registering your business. Please check the updated version of the app to see it listed.");
  }
}