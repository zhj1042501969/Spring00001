package sia.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) throws Exception {
        //加载spring上下文
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "knight.xml");
        //获取knight bean
        Knight knight = context.getBean(Knight.class);
        //使用knight
        knight.embarkOnQuest();
        context.close();
    }

}
