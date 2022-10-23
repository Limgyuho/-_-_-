package asdfasdf;

public class Main {

	public static void main(String[] args) {

		for (int dan = 1; dan <= 9; dan++) {

			System.out.printf("===%d단===\n", dan);

			for (int i = 1; i <= 9; i++) {

				System.out.printf("%d*%d=%d\n", dan, i, dan * i);
			}
		}
	}

}
