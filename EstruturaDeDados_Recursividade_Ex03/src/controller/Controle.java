package controller;

public class Controle {

	public int fatorial(int num) {
		// TODO Auto-generated method stub
		if(num>=12) {
			return 0;
		}
		if(num==1) {
			return 1;
		}
		return num*fatorial(num-1);
	}
	
}
