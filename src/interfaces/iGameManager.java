package interfaces;

import data.Game;

public interface iGameManager {
	void addGame(Game game);
	void updateGame(Game game, int id, double price, String gameName);
	void deleteGame(Game game);
}
