package in.sp.mappers;
import org.springframework.jdbc.core.RowMapper;

import in.sp.bean.ItemBean;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ItemRowMapper implements RowMapper<ItemBean>
{
	@Override
	public ItemBean mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		ItemBean ib= new ItemBean();
		ib.setItemid(rs.getInt("item_id"));

		ib.setItemname(rs.getString("item_name"));
		ib.setItemprice(rs.getInt("item_price"));

		return ib;
		
		
	}
}
