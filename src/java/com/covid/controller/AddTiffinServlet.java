
package com.covid.controller;

import com.covid.dao.TiffinDao;
import com.covid.dto.Tiffin;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "addtiffin",urlPatterns = {"/users/addtiffin"})
public class AddTiffinServlet extends HttpServlet{
    private TiffinDao tDao;

    @Override
    public void init(ServletConfig config) throws ServletException {
        tDao=new TiffinDao();
        super.init(config); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("userName");
        String email=req.getParameter("email");
        String phone=req.getParameter("phone");
        String address=req.getParameter("address");
        String city=req.getParameter("city");
        String delivery=req.getParameter("delivery");
        int price=Integer.parseInt(req.getParameter("price"));
        String description=req.getParameter("desc");
        
        Tiffin tiffin=new Tiffin(userName,email,phone,address,city,delivery,price,description);
        boolean status=tDao.save(tiffin);
        
        String url=req.getContextPath()+"/users/tiffin.jsp?reg="+status;
        resp.sendRedirect(url);
    }
    
    
}
