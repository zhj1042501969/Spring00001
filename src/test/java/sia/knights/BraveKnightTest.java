package sia.knights;

import org.junit.Test;
import sia.knights.DI.BraveKnight;

import static org.mockito.Mockito.*;


public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        //创建mockQuest
        Quest mockQuest = mock(Quest.class);
        //注入mockQuest
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

}
