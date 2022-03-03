
package com.covid.dao;

import com.covid.dto.Medicine;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class MedicineDao implements BaseDao<Medicine>{

    @Override
    public boolean save(Medicine ob) {
        try(Connection cnn=DBConnection.getConnection()) {
            String query="insert into medicine(user_name,email,phone,address,city,medicine_name,price,type,description)"
                    + " value(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps=cnn.prepareStatement(query);
            ps.setString(1, ob.getUserName());
            ps.setString(2, ob.getEmail());
            ps.setString(3, ob.getPhone());
            ps.setString(4, ob.getAddress());
            ps.setString(5, ob.getCity());
            ps.setString(6, ob.getMedicineName());
            ps.setInt(7, ob.getPrice());
            ps.setString(8, ob.getType());
            ps.setString(9, ob.getDescription());
            int i=ps.executeUpdate();
            if(i>0) return true;
            else return false;
        } catch (Exception ex){
            System.out.println("MedicineDao, save:"+ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Medicine ob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medicine> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Medicine get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
