/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Rubber Ducks : ");
		ducks dck = new RubDck();
		System.out.println("Wooden Ducks : ");
		dck = new WoodDck();
		System.out.println("Red Head Ducks : ");
		dck = new RedHeadDck();
		System.out.println("Lake Ducks : ");
		dck = new LkDck();
	}
}
