package threadfool.op.chapter2;

//easy shit but why not
public class PrimitivesExample
{
	public static void main(String[] args)
	{
		Double d1 = Double.valueOf("12.5");
		Double d2 = Double.parseDouble("12.5");

		Integer i1 = Integer.valueOf(10);
		int i2 = i1.intValue();
		Number n1 = d1;
		Number n2 = i1;
		System.out.println(n1.intValue()+ n2.doubleValue()+d2);
	}

}
