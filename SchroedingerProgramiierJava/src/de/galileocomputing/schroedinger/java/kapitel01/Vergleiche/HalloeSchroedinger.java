/**
 * 
 */
package de.galileocomputing.schroedinger.java.kapitel01.Vergleiche;

import java.io.IOException;

/**
 * @author Duc
 *
 */
public class HalloeSchroedinger {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Hallo Schrödinger");
		System.err.println();
		System.out.println("Hallo " + args[0]);
		System.out.println("Wie alt bist du?");
		int alter = System.in.read();
		System.out.println(alter);
		System.out.println(args.length -1);
	}

}
