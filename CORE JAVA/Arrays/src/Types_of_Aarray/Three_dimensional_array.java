package Types_of_Aarray;

public class Three_dimensional_array {

	public static void main(String[] args) {
//		                        noOf2DArray   Row Col 
		String x[][][] = new String[2][1][1];
		x[0][0][0] = "scvxsc";
		x[1][0][0] = "scvxvcgfgsc";
		System.out.println(x[1][0][0]);

		// or
		String y[][][] = { { { "scvxsc" }, { "hhfdh" } }, { { "scvxvcgfgsc" }, { "fdhfd" } } };
		System.out.println(y[1][0][0]);

	}
}