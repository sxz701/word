import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import com.itheima.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: sunxinzhi
 * lbcdzyy
 * @Date: 2020/7/30 16:26
 */
public class TT {
    @Test
    public void test01(){
      ApplicationContext act = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService bean = act.getBean(ItemsService.class);
        List<Items> all = bean.findAll();

        System.out.println(all);
    }
}
