public class TabuadaComplexica{
	public static void main(String []args) {
		int i = 0;
		int n = 1;
		for (i=1; n<=10;i++) {
		 int r = n*i;
		 System.out.println(i+"x"+n+" = "+r);
			if (i == 10) {
				n++;
				i = 0;
			}
		}
	}
}