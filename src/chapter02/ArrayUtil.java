package chapter02;

public class ArrayUtil {
	public static double[] intToDouble( int[] a ){
		if( a == null ){
			return null;
		}
		
		int length = a.length;
		double[] result = new double[ length ];
		
		for( int i = 0; i < length; i++ ){
			result[ i ] = a[ i ];
		}
		
		return result;
	}
	
	public static int[] doubleToInt( double[] b ){
		if( b == null ){
			return null;
		}
		
		int length = b.length;
		int[] result = new int[ length ];
		
		for( int i = 0; i < length; i++ ){
			result[ i ] = (int)b[ i ];
		}
		
		return result;
		
				
	}
	
	public static int[] concat2( int[] a, int[] b ){
		int length1 = ( a == null ) ? 0 : a.length;
		int length2 = ( b == null ) ? 0 : b.length;
		
		int length = length1 + length2;
		int[] result = new int[ length ];
		
		int index = 0;
		for( int i = 0; i < length1; i++ ){
			result[ index++ ] = a [ i ];
		}
		
		for( int i = 0; i < length2; i++ ){
			result[ index++ ] = b [ i ];
		}
		
		return result;
	}
	
	public static int[] concat( int[] s1, int[] s2 ){
		if( s1 == null && s2 == null ){
			return null;
		}
		
		int length1; 
		int length2;
		
		if( s1 == null ) {
			length1 = 0;
		} else {
			length1 = s1.length;
		}
		
		if( s2 == null ) {
			length2 = 0;
		} else {
			length2 = s2.length;
		}
		
		int[] result = new int[ length1 + length2 ];
		
		int index = 0;
		for( int i = 0; i < length1; i++ ){
			result[ index++ ] = s1[ i ];
		}
		
		for( int i = 0; i < length2; i++ ){
			result[ index++ ] = s2[ i ];
		}
		
		return result;
	}
	
	
}
