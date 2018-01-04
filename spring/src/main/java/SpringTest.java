package main.java;
import cn.jnshu.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


    public class SpringTest {

        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext(
                    new String[] { "applicationContext.xml" });

            Student s = (Student) context.getBean("s");

            System.out.println(s.getQq());
        }
    }

