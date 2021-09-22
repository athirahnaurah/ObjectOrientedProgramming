package com.fundamental;

class ConvertDataType {
	static short methodOne(long l)
	{
		int i = (int) l;
		return (short) i;
	}
	public static void main(String[]args)
	{
		double d = 10.25;
		//d konversi ke float
		float f = (float) d;
		System.out.println(f);
		// float f konversi ke long
		byte b = (byte) methodOne ((long)f);
		System.out.println(b);
		// double -> float -> long -> int -> short -> byte
	}
}
