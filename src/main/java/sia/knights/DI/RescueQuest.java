package sia.knights.DI;

import sia.knights.Quest;

import java.io.PrintStream;


public class RescueQuest implements Quest {

//    PrintStream printStream;
//
//    public RescueQuest(PrintStream printStream){
//        this.printStream = printStream;
//    }

    public void embark() {
        System.out.println("Rescue Quest success");
//        printStream.println("RescueQuest");
    }
}
