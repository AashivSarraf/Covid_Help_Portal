
package com.covid.dao;

import com.covid.dto.Plasma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class PlasmaDao implements BaseDao<Plasma>{

    @Override
    public boolean save(Plasma ob) {
        try(Connection cnn=DBConnection.getConnection()) {
            String query="insert into plasma(user_name,email,phone,address,city,bloodgroup,description)"
                    + " value(?,?,?,?,?,?,?)";
            PreparedStatement ps=cnn.prepareStatement(query);
            ps.setString(1, ob.getUserName());
            ps.setString(2, ob.getEmail());
            ps.setString(3, ob.getPhone());
            ps.setString(4, ob.getAddress());
            ps.setString(5, ob.getCity());
            ps.setString(6, ob.getBloodGroup());
            ps.setString(7, ob.getDescription());
            int i=ps.executeUpdate();
            if(i>0) return true;
            else return false;
        } catch (Exception ex){
            System.out.println("PlasmaDao, save:"+ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Plasma ob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Plasma> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Plasma get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
