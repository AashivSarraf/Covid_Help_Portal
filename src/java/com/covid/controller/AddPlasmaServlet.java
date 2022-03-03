
package com.covid.controller;

import com.covid.dao.PlasmaDao;
import com.covid.dto.Plasma;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "addgroup",urlPatterns = {"/users/addgroup"})
public class AddPlasmaServlet extends HttpServlet{
    private PlasmaDao pDao;

    @Override
    public void init(ServletConfig config) throws ServletException {
        pDao=new PlasmaDao();
        super.init(config); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("userName");
        String email=req.getParameter("email");
        String phone=req.getParameter("phone");
        String address=req.getParameter("address");
        String city=req.getParameter("city");
        String bloodGroup=req.getParameter("bloodGroup");
        String description=req.getParameter("desc");
        
        Plasma plasma=new Plasma(userName,email,phone,address,city,bloodGroup,description);
        boolean status=pDao.save(plasma);
        
        String url=req.getContextPath()+"/users/plasma.jsp?reg="+status;
        resp.sendRedirect(url);
    }
    
}
