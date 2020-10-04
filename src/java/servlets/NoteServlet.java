package servlets;

import java.io.*;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

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
        String title = "";
        String message = "";
        
        String edit = request.getParameter("edit");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        Scanner noteFile = new Scanner(new File(path));
        
        title = noteFile.nextLine();
        
        while(noteFile.hasNextLine())
        {
            message += noteFile.nextLine();
        }
        
        noteFile.close();
        
        if (edit == null)
        {
            Note note = new Note(title, message);
            request.setAttribute("note", note);
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
        else
        {
            message = message.replaceAll("\n", "<br>");
            Note note = new Note(title, message);
            request.setAttribute("note", note);
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String title = request.getParameter("title");
        String message = request.getParameter("message");       
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        String [] messageSplit = message.split("\n");
        
        PrintWriter noteFile = new PrintWriter(new BufferedWriter(new FileWriter(path))); 
        noteFile.println(title);
        
        for(String line : messageSplit)
        {
            noteFile.println(line);
        }
        
        message = message.replaceAll("\n", "<br>");
        
        Note note = new Note(title, message);
        request.setAttribute("note", note);
        
        noteFile.close();
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }
}
