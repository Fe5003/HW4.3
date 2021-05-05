package Manager;

import data.Campaign;
import interfaces.icampaignManager;

public class CampaignManager implements icampaignManager {

	@Override
	public void addDiscount(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("%"+campaign.getDiscount()+"Ýndirim");
	}

	@Override
	public void updateDiscount(Campaign campaign, int discount) {
		// TODO Auto-generated method stub
		int previousDiscount=campaign.getDiscount();
        campaign.setDiscount(discount);
        System.out.println("%"+previousDiscount+" indirim %"+campaign.getDiscount()+" olarak guncellendi");
	}

	@Override
	public void deleteDiscount(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("%"+campaign.getDiscount()+" indirim artýk geçerli deðil!!!");
	}

}
