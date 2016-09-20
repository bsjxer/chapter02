package chapter02;

public class ArrayUtilTest {

	public static void main(String[] args) {
		
		// int 배열을 double 배열로 변환
		int[] arrayInt = { 10, 20 ,30, 40 ,50 };
		double[] arrayDouble =  ArrayUtil.intToDouble( arrayInt );
		for( int i = 0; i < arrayDouble.length; i++ ){
			System.out.print( arrayDouble[i] + " " );
		}
		System.out.println();
		
		// double 배열을 int 배열로 변환
		double[] arrayDouble2 = { 20.0, 30.0, 40.0, 50.0 };
		int[] arrayInt2 = ArrayUtil.doubleToInt( arrayDouble2 );
		for( int i : arrayInt2 ){
			System.out.print( i + " " );
		}
		System.out.println();
		
//		for( int i = 0; i < arrayDouble2.length; i++ ){
//			System.out.print( arrayInt2[ i ] + " ");
//		}
//		System.out.println();
		
		// int 배열 두 개를 연결한 새로운 배열 리턴
		int[] arrayIntX = { 1, 2, 3, 4, 5 };
		int[] arrayIntY = { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int[] arrayIntZ = ArrayUtil.concat( arrayIntX, arrayIntY );
		
		for( int i = 0; i < arrayIntX.length; i++ ){
			System.out.print( arrayIntX[ i ] + " ");
		}
		System.out.println();
		
		for( int i = 0; i < arrayIntY.length; i++ ){
			System.out.print( arrayIntY[ i ] + " ");
		}
		System.out.println();
		
		for( int i = 0; i < arrayIntZ.length; i ++ ){
			System.out.print( arrayIntZ[ i ] + " ");
		}
	}

}
