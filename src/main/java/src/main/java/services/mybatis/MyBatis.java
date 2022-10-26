package src.main.java.services.mybatis;

import src.main.java.utility.Resources;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyBatis {
    private final static Logger logger = LogManager.getLogger(MyBatis.class);
    private final static String myBatisConfigFileName = "mybatis-config.xml";
    private static SqlSessionFactory factory;

    private MyBatis() {
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        if(factory == null) {
            initialize();
        }
        if(factory == null) {
            logger.error("SqlSessionFactory failed to initialize");
        }
        return factory;
    }

    private static void initialize() {
        org.apache.ibatis.logging.LogFactory.useLog4J2Logging();
        org.apache.ibatis.logging.LogFactory.useNoLogging();
        InputStream input = Resources.getResourceAsStream(myBatisConfigFileName);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(input);
    }
}