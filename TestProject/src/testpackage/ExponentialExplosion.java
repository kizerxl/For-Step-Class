package testpackage;

public class ExponentialExplosion {

	public static void main(String[] args) {
		double value = 500; //an start value to for calculating the max value
		float starttime = System.currentTimeMillis();
		float endtime = 0;
		float totaltime = 0;
		
		while(true){
			
				if (value == Double.POSITIVE_INFINITY ){
					System.out.println("max value is :"+ value);
					endtime = System.currentTimeMillis();
					totaltime = endtime - starttime; 
					System.out.println("Total execution time was:" +totaltime);
					break;
				}
				value++; 
			}

	}

}
