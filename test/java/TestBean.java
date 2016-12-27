/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/22 0022
 * Time: 19:06
 */

import com.spring.pojo.HelloBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class TestBean {

    @Test
    public void TestBean() {
        //当前类路径下引用配置文件
      /*  ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("./test.xml");
        HelloBean helloBean = (HelloBean) classPathXmlApplicationContext.getBean("hello");
        helloBean.helloWorld();
        classPathXmlApplicationContext.close();*/
/*
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext =
                new FileSystemXmlApplicationContext("E:/test.xml");
        HelloBean helloBean = (HelloBean) fileSystemXmlApplicationContext.getBean("hello");
        helloBean.helloWorld();
        fileSystemXmlApplicationContext.close();*/

       /* XmlWebApplicationContext xmlWebApplicationContext =
                new XmlWebApplicationContext();
        HelloBean helloBean = (HelloBean) xmlWebApplicationContext.getBean("hello");
        helloBean.helloWorld();
        xmlWebApplicationContext.close();*/
    }
}
