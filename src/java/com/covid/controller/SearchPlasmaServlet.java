
package com.covid.controller;

import com.covid.dao.DBConnection;
import com.covid.dto.CovidInjection;
import com.covid.dto.Plasma;
import com.google.gson.Gson;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "searchgroup",urlPatterns = {"/users/searchgroup"})
public class SearchPlasmaServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(Connection cnn=DBConnection.getConnection()) {
            List<Plasma> list=new ArrayList<>();
            String txt=req.getParameter("txt");
//            System.out.println(txt);
            String query="select * from plasma where bloodgroup LIKE '%"+txt+"%' order by user_name";
//            System.out.println(query);
            Statement stm=cnn.createStatement();
            ResultSet rs=stm.executeQuery(query);
            while(rs.next()){
                String userName=rs.getString("user_name");
                String email=rs.getString("email");
                String phone=rs.getString("phone");
                String address=rs.getString("address");
                String city=rs.getString("city");
                String bloodGroup=rs.getString("bloodgroup");
                String description=rs.getString("description");
                
                Plasma plasma=new Plasma(userName, email, phone, address, city, bloodGroup, description);
                list.add(plasma);
//                System.out.println(list);
            }
            Gson gson=new Gson();
            String str=gson.toJson(list);
            resp.getWriter().write(str);
            
        } catch (Exception ex){
            System.out.println("SearchPlasmaServlet, doGet:"+ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    
}
