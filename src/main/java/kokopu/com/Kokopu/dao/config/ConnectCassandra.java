package kokopu.com.Kokopu.dao.config;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class ConnectCassandra {
	
	public Session ConnectDB()
	{
		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		Session session = cluster.connect("neptune");
		return session;
		
	}

}
