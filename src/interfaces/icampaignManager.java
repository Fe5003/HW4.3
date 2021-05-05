package interfaces;

import data.Campaign;

public interface icampaignManager {
	void addDiscount(Campaign campaign);
	void updateDiscount(Campaign campaign,int discount);
    void deleteDiscount(Campaign campaign);
}
