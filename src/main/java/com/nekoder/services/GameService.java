package com.nekoder.services;

import com.nekoder.models.Game;

import java.util.ArrayList;
import java.util.List;

public class GameService {
    public static Game checkGame(Game game) {
        if (game.getWords().isEmpty())
            return game;

        List<String> trueWords = new ArrayList<>();

        for (int i = 0; i < game.getWords().size(); i++) {
            String word = game.getWords().get(i);
            if (word.isEmpty())
                break;
            if (i == 0 || game.getWords().get(i - 1).endsWith(word.substring(0, 1)))
                trueWords.add(word);
            else
                break;
        }
        return new Game() {{
            setWords(trueWords);
        }};
    }
}
