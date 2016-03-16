package servlet;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		ArrayList< String > searchParameters = new ArrayList< String >();

		response.setContentType("text/html; charset=utf-8");
		PrintWriter printWriter = response.getWriter();
		request.getRequestDispatcher("search.html").include(request, response);
		
		String skillType = request.getParameter("skillType");
		String searchType = request.getParameter("searchType");

//		searchParameters.add(skillType);
//		searchParameters.add(searchType);
//
//		try
//		{
//			Socket clientSocket = new Socket("localHost", 1921);
//
//			ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
//			ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
//
//			oos.writeObject(searchParameters);
//
//			Object incominSearchResults = ois.readObject();
//
//			ois.close();
//			oos.close();
//			clientSocket.close();
//
//			printWriter.print(incominSearchResults);
//			
//			printWriter.flush();
//			printWriter.close();
//		}
//		catch (IOException | ClassNotFoundException e)
//		{
//			e.printStackTrace();
//		}

	}

}
