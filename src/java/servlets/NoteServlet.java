package servlets;

import java.io.BufferedReader;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 820203
 */
public class NoteServlet extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        // to write to a file
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
    }

}
