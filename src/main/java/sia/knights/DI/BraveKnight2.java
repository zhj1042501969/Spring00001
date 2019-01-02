package sia.knights.DI;

import sia.knights.Knight;
import sia.knights.Minstrel;
import sia.knights.Quest;

public class BraveKnight2 implements Knight {

    private Quest quest;
    private Minstrel minstrel;

    public BraveKnight2(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    public void embarkOnQuest(){
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }

}