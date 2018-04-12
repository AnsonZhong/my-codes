package zhong.anson.xml;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import zhong.anson.xml.dao.AreaMapper;

import java.io.IOException;
import java.io.InputStream;

public class Demo {

    public static void main(String[] args) throws IOException {
        //FileInputStream fis =
        // new FileInputStream("D:\\my-code\\mybatis-use\\src\\main\\resources\\mybatis-config.xml");
        InputStream fis = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(fis);
        //SqlSession
        SqlSession sqlsession = factory.openSession();
        AreaMapper areaMapper = sqlsession.getMapper(AreaMapper.class);
        System.out.println(areaMapper.getAllArea());
    }
}
