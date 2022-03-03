
package com.covid.controller;

import com.covid.dao.CovidInjectionDao;
import com.covid.dto.CovidInjection;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "addcovidinj",urlPatterns = {"/users/addcovidinj"})
public class AddCovidInjectionServlet extends HttpServlet{

    private CovidInjectionDao ciDao; 
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        ciDao=new CovidInjectionDao();
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
        
        CovidInjection covid=new CovidInjection(userName,email,phone,address,city,type,injectionName,price,description);
        boolean status=ciDao.save(covid);
        
        String url=req.getContextPath()+"/users/covidinjection.jsp?reg="+status;
        resp.sendRedirect(url);
        
    }
    
}
