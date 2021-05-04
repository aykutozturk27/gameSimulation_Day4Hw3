package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Campaign implements IEntity {
	String campaignName;
	LocalDate campaignStart;
	LocalDate campaignFinish;
    
	public Campaign() {
		
	}

	public Campaign(String campaignName, LocalDate campaignStart, LocalDate campaignFinish) {
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

	public LocalDate getCampaignStart() {
		return campaignStart;
	}

	public void setCampaignStart(LocalDate campaignStart) {
		this.campaignStart = campaignStart;
	}

	public LocalDate getCampaignFinish() {
		return campaignFinish;
	}

	public void setCampaignFinish(LocalDate campaignFinish) {
		this.campaignFinish = campaignFinish;
	}
}
