
package com.covid.controller;

import com.covid.dao.OxygenDao;
import com.covid.dto.Oxygen;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "addoxygen",urlPatterns = {"/users/addoxygen"})
public class AddOxygenServlet extends HttpServlet{
    private OxygenDao oxyDao;

    @Override
    public void init(ServletConfig config) throws ServletException {
        oxyDao=new OxygenDao();
        super.init(config); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("userName");
        String email=req.getParameter("email");
        String phone=req.getParameter("phone");
        String address=req.getParameter("address");
        String city=req.getParameter("city");
        int price=Integer.parseInt(req.getParameter("price"));
        String description=req.getParameter("desc");
        
        Oxygen oxygen=new Oxygen(userName,email,phone,address,city,price,description);
        boolean status=oxyDao.save(oxygen);
        
        String url=req.getContextPath()+"/users/oxygen.jsp?reg="+status;
        resp.sendRedirect(url);
    }
    
    
}
