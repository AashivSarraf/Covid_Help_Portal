
package com.covid.controller;

import com.covid.dao.MedicineDao;
import com.covid.dto.CovidInjection;
import com.covid.dto.Medicine;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "addmedicine",urlPatterns = {"/users/addmedicine"})
public class AddMedicineServlet extends HttpServlet{
    private MedicineDao mDao;

    @Override
    public void init(ServletConfig config) throws ServletException {
        mDao=new MedicineDao();
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
        String medicineName=req.getParameter("medicineName");
        int price=Integer.parseInt(req.getParameter("price"));
        String description=req.getParameter("desc");
        
        Medicine covid=new Medicine(userName,email,phone,address,city,type,medicineName,price,description);
        boolean status=mDao.save(covid);
        
        String url=req.getContextPath()+"/users/medicine.jsp?reg="+status;
        resp.sendRedirect(url);
        
    }
}
