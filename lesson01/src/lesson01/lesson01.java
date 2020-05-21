package lesson01;

public class lesson01 {

	public static void main(String[] args) {
		byte bt = 2;
		short s = 1;
		int a = 4;
		long l = 12;
		char c = 'c';
		float f = 4.12f;
		double d = 2.5;
		boolean b = true;
		
		System.out.println("Min Byte value = " + Byte.MIN_VALUE);
		System.out.println("Max byte value = " + Byte.MAX_VALUE);
		System.out.println("Min short value = " +Short.MIN_VALUE);
		System.out.println("Max short value = " + Short.MAX_VALUE);
		System.out.println("Min int value = " + Integer.MIN_VALUE);
		System.out.println("Max int value = " + Integer.MAX_VALUE);
		System.out.println("Min long value = " + Long.MIN_VALUE);
		System.out.println("Max long value = " + Long.MAX_VALUE);
		System.out.println("Min float value =" + Float.MIN_VALUE);
		System.out.println("Max float value =" + Float.MAX_VALUE);
		System.out.println("Min double value =" + Double.MIN_VALUE);
		System.out.println("Max double value =" + Double.MAX_VALUE);
		

		int[] array = {5, 12, 14, 26, 33, 17, 20, 24, 21, 76};
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Максимальное значение = " + max);
		System.out.println("Минимальное значение = " + min);

	}

}
