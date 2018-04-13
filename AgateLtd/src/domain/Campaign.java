package domain;
//Onur TENGIRSEK
//13.04.18
public class Campaign {
	
	private String Title;
	private double EstimatedCost;
	private String FinishDate;
	private String StartDate;

public  Campaign() {};
	//Default Constructor

public Campaign(String Title, String StartDate, String FinishDate, double EstimatedCost) {
	this.setTitle(Title);
	this.setEstimatedCost(EstimatedCost);
	this.setFinishDate(FinishDate);
	this.setStartDate(StartDate);
	}
public void setTitle(String Title){
  this.Title=Title;
}
public String getTitle() {
	return Title;
}
public void setEstimatedCost(double EstimatedCost) {
  this.EstimatedCost=EstimatedCost;
}
public double getEstimatedCost() {
	return EstimatedCost;
}
public void setFinishDate(String FinishDate) {
	this.FinishDate=FinishDate;
}
public String getFinishDate() {
	return FinishDate;
}
public void setStartDate(String StartDate) {
	this.StartDate=StartDate;
}
public String getStartDate() {
	return StartDate;
}
}
