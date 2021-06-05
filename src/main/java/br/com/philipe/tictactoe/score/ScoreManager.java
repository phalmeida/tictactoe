package br.com.philipe.tictactoe.score;

import br.com.philipe.tictactoe.core.Player;

import java.io.IOException;

public interface ScoreManager {
    public Integer getScore(Player player);
    public void saveScore(Player player) throws IOException;

}
