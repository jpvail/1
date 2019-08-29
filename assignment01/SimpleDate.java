package assignment01;
import java.time.LocalDate;
/**
 * 
 * @author CS 140
 *
 */
public class SimpleDate {
	private int year;
	private int month;
	private int day; 

	public static SimpleDate of(int yr, int m, int d){
		var returnValue = new SimpleDate();
		returnValue.year = yr; 
		returnValue.month = m; 
		returnValue.day = d; 
		
		return returnValue; 
	}

	public boolean before(SimpleDate other){
		if(other.year > this.year){
			return true; 
		} else if(other.year == this.year) {
			if(other.month > this.month){
				return true; 
			}else if(other.month == this.month){
				if(other.day > this.day){
					return true; 
				}else {
					return false; 
				}
			}else{ 
				return false;
			}

		}else{
			return false; 
		}
	}

}




















