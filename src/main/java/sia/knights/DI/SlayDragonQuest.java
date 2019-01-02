package sia.knights.DI;

import sia.knights.Quest;

import java.io.PrintStream;
import java.sql.SQLOutput;

//杀龙任务
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }

}
