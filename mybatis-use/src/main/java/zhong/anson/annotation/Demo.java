package zhong.anson.annotation;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import zhong.anson.annotation.mapper.AreaMapper;

public class Demo {

    public static void main(String[] args) {
        //DataSource
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/tlshop");
        dataSource.setUser("root");
        dataSource.setPassword("221520");
        //事务
        TransactionFactory transaction = new JdbcTransactionFactory();
        //Environment
        Environment environment = new Environment("mysql",transaction,dataSource);
        Configuration conn = new Configuration(environment);
        conn.addMapper(AreaMapper.class);
        //SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(conn);
        //SqlSession
        SqlSession sqlsession = factory.openSession();
        AreaMapper areaMapper = sqlsession.getMapper(AreaMapper.class);
        System.out.println(areaMapper.getAllArea());
    }
}
