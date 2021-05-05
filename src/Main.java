import Manager.GameManager;
import data.Game;
import Manager.UserManager;
import Manager.VerificationManager;
import data.User;
import Manager.CampaignManager;
import data.Campaign;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game=new Game(1,"Mafia I",42.90);
        GameManager gameManager=new GameManager();
        
        gameManager.addGame(game);
        gameManager.updateGame(game,1,190,"Max Payne 3");
        gameManager.deleteGame(game);
        
        Campaign campaign = new Campaign(2,"Efsane Steam Ýndirimleri",47);
        CampaignManager campaingManager=new CampaignManager();
        campaingManager.addDiscount(campaign);
        campaingManager.updateDiscount(campaign,40);
        campaingManager.deleteDiscount(campaign);
        
        User User=new User(1,"Ertugrul","Demirelli","Allesfresser","ertugruldemirelli@gmail.com","12345678","02.01.1995");
        UserManager userManager =new UserManager(new VerificationManager());
	    userManager.add(User);
	    userManager.updateUser(User, 5, "asdasd", "asda", "Fe50", "asd", "asd", "sa");
	    userManager.deleteUser(User);
	}

}
