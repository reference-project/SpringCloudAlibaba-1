import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.ElasticSearchDruidDataSourceFactory;
import com.ht.micro.record.service.dubbo.provider.DubboProviderApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import static com.alibaba.druid.pool.DruidDataSourceFactory.PROP_CONNECTIONPROPERTIES;


@RunWith(SpringRunner.class)
@SpringBootTest(classes={DubboProviderApplication.class})// 指定启动类
public class ElasticSearchSql {
	@Test
	public void testselect() throws Exception {
		Properties properties = new Properties();
		properties.put("url", "jdbc:elasticsearch://192.168.2.7:1801,192.168.2.5:1801/");
		properties.put(PROP_CONNECTIONPROPERTIES, "client.transport.ignore_cluster_name=true");
		DruidDataSource dds = (DruidDataSource) ElasticSearchDruidDataSourceFactory.createDataSource(properties);
		dds.setInitialSize(1);
		Connection connection = dds.getConnection();
		String sql2 = "select * FROM t_word_freq limit 10";
		PreparedStatement ps = connection.prepareStatement(sql2);
		ResultSet resultSet = ps.executeQuery();
		while (resultSet.next()) {
		    //sql对应输出
		    System.out.println(resultSet.getString("jjbh") );
 
		}
		ps.close();
		connection.close();
		dds.close();
	}
}