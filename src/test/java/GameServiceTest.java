import com.nekoder.models.Game;
import com.nekoder.services.GameService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class GameServiceTest {

    @Test
    public void normalWords() {
        Game gameRequest = new Game(new ArrayList<String>() {{
            add("fish");
            add("horse");
            add("egg");
            add("goose");
            add("eagle");
        }});

        Game gameResponse = new Game(new ArrayList<String>() {{
            add("fish");
            add("horse");
            add("egg");
            add("goose");
            add("eagle");
        }});

        Assert.assertTrue(gameResponse.equals(GameService.checkGame(gameRequest)));
    }

    @Test
    public void unNormalWords() {
        Game gameRequest = new Game(new ArrayList<String>() {{
            add("fish");
            add("horse");
            add("snake");
            add("goose");
            add("eagle");
        }});

        Game gameResponse = new Game(new ArrayList<String>() {{
            add("fish");
            add("horse");
        }});

        Assert.assertEquals(gameResponse,GameService.checkGame(gameRequest));
    }

    @Test
    public void emptyWords() {
        Game gameRequest = new Game(new ArrayList<String>() {{
            add("");
            add("horse");
            add("");
            add("goose");
            add("eagle");
        }});

        Game gameResponse = new Game(new ArrayList<>());

        Assert.assertEquals( gameResponse,GameService.checkGame(gameRequest));
    }

}