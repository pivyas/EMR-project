package ExamplePackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("pw").equals(request.getParameter("repw")))
		{		
			try 
			{ 
				 Session session = HibernateUtil.getSessionFactory().getCurrentSession(); 
				 Transaction tx = session.beginTransaction(); 
				 
				 UserBean bean1 = new UserBean();
				 bean1.setFirstName(request.getParameter("fn"));
				 bean1.setLastName(request.getParameter("ln"));
				 bean1.setUsername(request.getParameter("un"));
				 bean1.setPassword(request.getParameter("pw"));
				 
				 session.save(bean1); 
				 tx.commit();
 
			}
			catch (Throwable theException) 
			{ 
				System.out.println(theException); 
			}
			}
		else
		{	
			System.out.println("Enter all the details");
			response.sendRedirect("Register.jsp");
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
