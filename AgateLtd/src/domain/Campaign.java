package domain;
//Onur TENGIRSEK
//13.04.18
public class Campaign {
	
	private String title;
	private double estimatedCost;
	private String finishDate;
	private String startDate;

public  Campaign() {}
	//Default Constructor

public Campaign(String Title, String StartDate, String FinishDate, double EstimatedCost) {
	this.settitle(title);
	this.setestimatedCost(estimatedCost);
	this.setfinishDate(finishDate);
	this.setstartDate(startDate);
	}
public void settitle(String title){
   this.title=title;
}
public String gettitle() {
   return title;
}
public void setestimatedCost(double estimatedCost) {
   this.estimatedCost=estimatedCost;
}
public double getestimatedCost() {
   return estimatedCost;
}
public void setfinishDate(String finishDate) {
   this.finishDate=finishDate;
}
public String getfinishDate() {
   return finishDate;
}
public void setstartDate(String startDate) {
   this.startDate=startDate;
}
public String getStartDate() {
   return startDate;
}
}
