
package com.covid.dao;

import com.covid.dto.CovidInjection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CovidInjectionDao implements BaseDao<CovidInjection>{    

    @Override
    public boolean save(CovidInjection ob) {
        try(Connection cnn=DBConnection.getConnection()) {
            String query="insert into covidinjection(user_name,email,phone,address,city,injection_name,price,type,description)"
                    + " value(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps=cnn.prepareStatement(query);
            ps.setString(1, ob.getUserName());
            ps.setString(2, ob.getEmail());
            ps.setString(3, ob.getPhone());
            ps.setString(4, ob.getAddress());
            ps.setString(5, ob.getCity());
            ps.setString(6, ob.getInjectionName());
            ps.setInt(7, ob.getPrice());
            ps.setString(8, ob.getType());
            ps.setString(9, ob.getDescription());
            int i=ps.executeUpdate();
            if(i>0) return true;
            else return false;
        } catch (Exception ex){
            System.out.println("CovidInjectionDao, save:"+ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(CovidInjection ob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CovidInjection> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CovidInjection get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
