package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import in.sp.bean.ItemBean;
import in.sp.resources.SpringConfigFile;
import in.sp.mappers.ItemRowMapper;

public class MainClassContainer {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate templ = (JdbcTemplate) context.getBean("mhkJdbcTemplate");

        String sql = "SELECT item_id, item_name, item_price FROM items ";

        try {
            List<ItemBean> list_item = templ.query(sql, new ItemRowMapper());
            
            for (ItemBean item : list_item)
            {
                System.out.println(item.getItemid()+"     " +item.getItemname() + " - " + item.getItemprice());
                System.out.println("-----------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}