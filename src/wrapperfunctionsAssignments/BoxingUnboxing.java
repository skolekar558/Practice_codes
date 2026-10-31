package wrapperfunctionsAssignments;
//1. Show one example of boxing and unboxing for all 8 primitive data types.
public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.byte
		byte byteVal=10;
		Byte byteObj=byteVal;
		byte unboxByte=byteObj;
		
//2.short
		short shortVal=20;
		Short shortObj=shortVal;
		short unboxShort=shortObj;
		
//3.Integer
		int intVal=40;
		Integer intObj=intVal;
		int unboxInt=intObj;
		
//4.Long
		long longVal=50;
		Long longObj=longVal;
		long unboxLong=longObj;
//5.float
		float floatVal=12.5f;
		Float floatObj=floatVal;
		float unboxFloat=floatObj;
//6.Double
		double doubleVal=12.501;
		Double doubleObj=doubleVal;
		double unboxDouble=doubleObj;
//7.character
		char charVal='s';
		Character charObj=charVal;
		char unboxChar=charObj;
//8.boolean
		boolean boolVal=true;
		boolean boolObj=boolVal;
		boolean unboxBool=boolObj;
		
		 System.out.println("Boxing and Unboxing Results:");
	     System.out.println("Byte : " + unboxByte);
	     System.out.println("Short :"+unboxShort);
	     System.out.println("Integer:"+unboxInt);
	     System.out.println("Long :"+unboxLong);
	     System.out.println("Float: "+unboxFloat);
	     System.out.println("Double :"+unboxDouble);
	     System.out.println("Char:"+unboxChar);
	     System.out.println("Boolean:"+unboxBool);
	     
	}

}
