package Entities;

import Abstract.IEntity;

public class Campaign implements IEntity {
	String campaignName;
    String campaignStart;
    String campaignFinish;
    
	public Campaign() {
		
	}

	public Campaign(String campaignName, String campaignStart, String campaignFinish) {
		this.campaignName = campaignName;
		this.campaignStart = campaignStart;
		this.campaignFinish = campaignFinish;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignStart() {
		return campaignStart;
	}

	public void setCampaignStart(String campaignStart) {
		this.campaignStart = campaignStart;
	}

	public String getCampaignFinish() {
		return campaignFinish;
	}

	public void setCampaignFinish(String campaignFinish) {
		this.campaignFinish = campaignFinish;
	}
}
