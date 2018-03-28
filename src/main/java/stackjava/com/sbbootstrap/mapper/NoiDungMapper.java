package stackjava.com.sbbootstrap.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import stackjava.com.sbbootstrap.model.NoiDung;
import org.springframework.jdbc.core.RowMapper;

public class NoiDungMapper implements RowMapper<NoiDung> {

   public static final String BASE_SQL //
           = "Select ba.Id, ba.Full_Name, ba.Balance From Bank_Account ba ";

   @Override
   public NoiDung mapRow(ResultSet rs, int rowNum) throws SQLException {

       
       String id = rs.getString("id");
       String tieude = rs.getString("tieude");
       String noi_dung = rs.getString("noi_dung");
       String link_anh = rs.getString("link_anh");

       return new NoiDung(id, tieude, noi_dung, link_anh);
   }

}
