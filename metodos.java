
public class metodos { 
	    //metodo 1 
	    public static int[] nomultiplos( int num, int n1, int n2 ) { 
	 
	    int i=0,j=0, cont=0, cont2=0;
	    
	    if(num<=0 || n1<=0 || n2<=0){
	    return null;
	    }
	    else{
	        for(i=0;i<num;i++) {
	            if(i%n1!=0 && i%n2!=0) cont++;
	        } 
	        int []array=new int[cont];


	        for(j=0;j<=num;j++){
	            if(j%n1!=0 && j%n2!=0){ 
	            array[cont2]=j;
	            cont2++; 
	            }
	        }
	    return array;
	    } 
	     
	 
	    } 
	 
	 
	    //metodo 2 
	    public static String[] sufijos( String s ) { 
	         
	    int i=0, j=0; 
	    int longitud=s.length(); 
	    String cadena[]=new String[longitud]; 
	 
	    for(i=longitud-1;i>-1;i--) { 
	        String r=s.substring(i); 
	        cadena[j]=r; 
	        j++; 
	    } 
	    return cadena; 
	    } 
	 
	    //metodo 3 
	    public static String[] prefijos( String s ) { 
	         
	    int i=0, j=0; 
	    int longitud=s.length(); 
	    String cadena[]=new String[longitud]; 
	    for(i=1;i<longitud+1;i++) { 
	        String r=s.substring(0,i); 
	        cadena[j]=r; 
	        j++; 
	    } 
	    return cadena; 
	    } 
	 
	 
	 
	 
	 
	 
	    //metodo 4 
	    public static String IMC( double altura, double peso, int edad ) { 
	 
	    double calculoIMC=0; 
	    String IMC="error en entrada"; 
	    calculoIMC=peso/(altura*altura); 
	     
	    if(altura>0 && peso>0 && edad>0){ 
	    if(calculoIMC<22.0 && edad<45) IMC="bajo"; 
	    if(calculoIMC<22.0 && edad>=45) IMC="medio"; 
	    if(calculoIMC>=22.0 && edad<45) IMC="medio"; 
	    if(calculoIMC>=22.0 && edad>=45) IMC="alto"; 
	    } 
	 
	    return IMC; 
	 
	    } 
	 
	    //Metodo5
	    public static int[] comunes( int[] v1, int[] v2 ) {
	        int i=0, j=0, k=0, m=0, aux=0, cont=0;
	        int longitud1=v1.length;
	        int longitud2=v2.length;
	        
	        for(i=0;i<longitud1;i++) {
	            for(j=0;j<longitud2;j++) {
	                if (v1[i]==v2[j]) cont++;
	            }
	        }
	        
	        int v3[]=new int[cont];
	        for(i=0;i<cont;i++) v3[i]=0;
	        
	        for(i=0;i<longitud1;i++) {
	            for(j=0;j<longitud2;j++) {
	                if (v1[i]==v2[j]) {
	                    v3[k]=v1[i];
	                    k++;
	                    j=longitud2;
	                }
	            }
	        }
	        for(m=0;m<cont;m++) {
	            for(k=0;k<cont-1;k++) {          
	                if(v3[k]>v3[k+1]) {
	                    aux=v3[k];
	                    v3[k]=v3[k+1];
	                    v3[k+1]=aux;
	                }
	            }
	        }
	        return v3;
	    }

	
	//Metodo6
	public static void secCollatz( int i ) {
		
		int j=1, cont=0, num=0;
		
		for(j=1;j<=i;j++) {
			cont=1;
			num=j;
			while (num!=1){
				cont++;
				if(num%2==0) {
					num=num/2;
				}
				else {
					num=(num*3)+1;
				}
					
			}
			System.out.println(j+" "+cont);
		}
	}

	//Metodo7
	public static int[] Collatz( int i ) {
		
		int num=i,j=0, cont=1;
		
		while (num!=1){
			cont++;
			if(num%2==0) {
				num=num/2;
			}
			else {
				num=(num*3)+1;
			}
				
		}

	
		int array[]=new int[cont];
		for(j=0;j<cont;j++) array[j]=0;
		
		j=0;
		num=i;
		array[j]=num;
		
		while(num!=1) {
			
			if(num%2==0) {
				num=num/2;
			}
			else{
				num=(num*3)+1;
			}
			j++;
			array[j]=num;
		}
		
		return array;
	}
	
	/*//Metodo8
	public static void caballo( int cor1, int cor2 ) {
		
	}
	
	//Metodo9
	public static int[] multrusa( int ador, int ando ) {

	
	
	}
	
	//Metodo10
	public static String[][] histograma(String s, int i){
		
	}
*/

}
