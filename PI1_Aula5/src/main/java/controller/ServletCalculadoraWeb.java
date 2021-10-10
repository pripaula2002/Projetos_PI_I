//arquivo ServletCalculadoraWeb.java (camada Controller)
package controller;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import model.*;

@WebServlet("/resultado")
public class ServletCalculadoraWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String paramNum1 = req.getParameter("num1");
		String paramNum2 = req.getParameter("num2");
		String paramOperacao = req.getParameter("operacao");
		calculadora calculadora = new calculadora();
		int total = calculadora.calcular(paramNum1, paramNum2, paramOperacao);
		req.setAttribute("totalCalculo", total);
		RequestDispatcher reqDispatcher = req.getRequestDispatcher("resultado.jsp");
		reqDispatcher.forward(req, resp);
	}
}
