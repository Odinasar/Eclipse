
//Create a method called getDurationString with two parameters, first parameter is minutes and second parameter is seconds.
//
//You should validate that if the first parameter minutes is >=0.
//
//You should validate that second parameter seconds is >=0 and <=59
//
//Return "Invalid Value" in the method if either of the above is not true.
//
//If the parameters are valid then calculate how many hours minutes and seconds comprise the minutes and
//seconds passed to this method and return that value as string in format "XXh XXm XXs" 
//where XX represents a number of hours minutes and seconds.
//
//Create a second method of the same name but with only one parameter seconds.
//
//Validate that it is >=0, and return "Invalid Value" if it is not true.
//
//If it is valid, then calculate how many minutes are in the seconds then call the other overloaded method 
//passing the correct minutes and seconds calculated so that it can calculate correctly.
//
//Call both methods to print values in main method
//
//Tips:
//Use int or long for your number data types
//1 minute = 60 seconds and 1 hour = 60 minutes = 3600 seconds.



public class Assignment8 {

	public static void main(String[] args) {
		 
		getDurationString(6154);
		
	}	
		public static  String getDurationString(int sec,int min) {
			
			if(!(min>=0&(sec>=0&sec<=59))) {
				return ("Invalid Value");
			
			}else {
				
				int hour=min/60;
				int minutes=min%60;
				
			return (hour+"hours"+minutes+"minutes"+sec+"seconds");
					
			}
				
		}

		
		public static  void getDurationString(int sec) {
			if(sec<=0) {
				
			System.out.println("invalid value");
			}else {
				int m=sec/60;
						int s=sec%60;
				System.out.println(getDurationString(s,m));		
						
			}
			
		}
		
	}


