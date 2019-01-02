package sia.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sia.knights.DI.BraveKnight;
import sia.knights.DI.SlayDragonQuest;

import java.io.PrintStream;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(stream());
    }

    @Bean
    public PrintStream stream() {
        return new FakePrintStream();
    }

}
