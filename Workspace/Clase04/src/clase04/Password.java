package clase04;

import java.util.*;

public class Password {
	
	int longitud;
	ArrayList<Character> password;
	
	public Password(int longitud) {
		super();
		if(longitud >= 6){
			this.longitud = longitud;
		}
		else{
			this.longitud = 6;
		}
	}
	
	public Password() {
		super();
		this.longitud = 8;
	}

	public ArrayList<Character> getPassword() {
		return password;
	}

	public boolean esFuerte(){
		int mayus = 0;
		int minus = 0;
		int numeros = 0;	
		
		for (int i = 0; i<this.password.size(); i++){
			if((int)this.password.get(i) > 64 && (int)this.password.get(i) < 91){
				mayus += 1;
			}
			if((int)this.password.get(i) > 96 && (int)this.password.get(i) < 123){
				minus += 1;
			}
			if((int)this.password.get(i) > 47 && (int)this.password.get(i) < 58){
				numeros += 1;
			}
		}
		
		if(mayus >= 2 && minus >= 2 && numeros >= 4){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void generarPassword(){
		Random ran = new Random();
		int mayus = 0;
		int minus = 0;
		int numeros = 0;
		char caracter = 0;
		this.password = new ArrayList<Character>();
		
		for(int i = 0; i < this.longitud; i++){
			if(numeros < 4 && mayus < 2 && minus < 2){
				caracter = (char)(ran.nextInt(10)+48 + ran.nextInt(2)*(17+ran.nextInt(16) + ran.nextInt(2)*32));
			}
			else{
				if(numeros < 4 || mayus < 2 || minus < 2 ){
					if(mayus < 2){
						caracter = (char)(65 + ran.nextInt(26));
					}
					if (minus < 2){
						caracter = (char)(65 + ran.nextInt(26) + 32);
					}
					if (numeros < 4){
						caracter = (char)(ran.nextInt(10) + 48);
					}
				}
				else{
					caracter = (char)(ran.nextInt(94)+33);
				}
			}

			if((int)caracter > 64 && (int)caracter < 91){
				mayus += 1;
			}
			if((int)caracter > 96 && (int)caracter < 123){
				minus += 1;
			}
			if((int)caracter > 47 && (int)caracter < 58){
				numeros += 1;
			}
			this.password.add(caracter);
		}
	}

}
