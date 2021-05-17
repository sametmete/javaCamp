package Entities;

public class Campaign {

	public Campaign() {
		
	}
	
	public Campaign(String campaignName, double discount) {
		super();
		this.campaignName = campaignName;
		this.discount = discount;
	}

	private String campaignName;
	private double discount;
	
	
	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
