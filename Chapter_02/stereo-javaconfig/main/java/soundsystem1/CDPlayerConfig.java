package soundsystem1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Configuration 表明为配置类
 */

@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }


    /**
     * setter方法注入
     *
     */
//    @Bean
//    public CDPlayer cdPlayer(CompactDisc compactDisc) {
//        CDPlayer cdPlayer = new CDPlayer(compactDisc);
//        cdPlayer.setCompactDisc(compactDisc);
//        return  cdPlayer;
//    }

    @Bean
    public CompactDisc randomBeatlesCD() {
        int choice = (int) Math.floor(Math.random() * 4);
        if (choice == 0) {
            return new SgtPeppers();
        } else if (choice == 1) {
            return new SgtPeppers();
        } else if (choice == 2) {
            return new SgtPeppers();
        } else {
            return new SgtPeppers();
        }
    }

}
