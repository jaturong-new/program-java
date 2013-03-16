package main;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i++){
			int mod_three = 3;
			int mod_five = 5;
			if(i%mod_three == 0){
				if(i%mod_five == 0){
					System.out.println("number "+ i +" = BlueMagnet");
				}else{
					System.out.println("number "+ i +" = Blue");
				}
			}else{
				if(i%mod_five == 0){
					System.out.println("number "+ i +" = Magnet");
				}else{
					System.out.println("number "+ i +" = " + i);
				}
			}
		}
	}

}
