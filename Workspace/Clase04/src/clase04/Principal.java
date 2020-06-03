package clase04;

public class Principal {

	public static void main(String[] args) {
		
		Password miPass = new Password();
		Password miPass2 = new Password(4);
		Password miPass3 = new Password(12);
		
		miPass.generarPassword();
		fuerza(miPass);
		obtener(miPass);
		
		miPass2.generarPassword();
		fuerza(miPass2);
		obtener(miPass2);
		
		miPass3.generarPassword();
		fuerza(miPass3);
		obtener(miPass3);
	}
	
	public static void obtener(Password contraseņa){
		contraseņa.getPassword().forEach(caracter ->{
			System.out.print(caracter);
		});
		System.out.print("\n");
	}

	public static void fuerza(Password contraseņa){
		if(contraseņa.esFuerte()){
			System.out.println("Su contraseņa es fuerte.");
		}
		else{
			System.out.println("Su contraseņa es debil.");
		}
	}
}

//Random ran = new Random();
//char caracter = 0;
//caracter =(char)(ran.nextInt(10)+48 + ran.nextInt(2)*(17+ran.nextInt(16) + ran.nextInt(2)*32));
//System.out.println(caracter);
//ArrayList<Character> contra = new ArrayList();
//contra.add(caracter);
//System.out.println(contra.get(0));
//contra.forEach(con ->{
//	System.out.print(con);
//});
