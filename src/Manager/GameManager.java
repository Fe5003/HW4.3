package Manager;

import data.Game;

import interfaces.iGameManager;

public class GameManager implements iGameManager{

	@Override
	public void addGame(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName()+" Eklendi");
	}

	@Override
	public void updateGame(Game game, int id, double price, String gameName) {
		// TODO Auto-generated method stub
		String previousName=game.getGameName();
        game.setId(id);
        game.setGameName(gameName);
        game.setPrice(price);
        System.out.println(previousName+" isimli oyun guncellendi");
	}

	@Override
	public void deleteGame(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName()+" Silindi");
	}

}
