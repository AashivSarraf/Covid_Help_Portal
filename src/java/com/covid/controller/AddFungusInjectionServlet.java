
package com.covid.controller;

import com.covid.dao.FungusInjectionDao;
import com.covid.dto.FungusInjection;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "addfungusinj",urlPatterns = {"/users/addfungusinj"})
public class AddFungusInjectionServlet extends HttpServlet{
    private FungusInjectionDao fiDao;

    @Override
    public void init(ServletConfig config) throws ServletException {
        fiDao=new FungusInjectionDao();
        super.init(config); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("userName");
        String email=req.getParameter("email");
        String phone=req.getParameter("phone");
        String address=req.getParameter("address");
        String city=req.getParameter("city");
        String type=req.getParameter("type");
        String injectionName=req.getParameter("injectionName");
        int price=Integer.parseInt(req.getParameter("price"));
        String description=req.getParameter("desc");
        
        FungusInjection fungus=new FungusInjection(userName,email,phone,address,city,type,injectionName,price,description);
        boolean status=fiDao.save(fungus);
        
        String url=req.getContextPath()+"/users/fungusinjection.jsp?reg="+status;
        resp.sendRedirect(url);
    }
    
    
}
