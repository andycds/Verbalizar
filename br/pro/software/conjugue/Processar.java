package br.pro.software.conjugue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Processar {
	// para processar o texto de (exemplo): http://www.fpepito.org/verbos/conjugue.php?verbo=partir
	int ignore[] =  { 0, 2, 4 };
	public static void main(String[] args) {
		File file = new File("/Users/snow/kinect/workspace/Conjugue/verbo.txt");
		try {
			Scanner sc = new Scanner(file);
			String t[] = new String[300];
			String token;
			int i = 0;
			while (sc.hasNext()) {
				token = sc.next().trim().toLowerCase();
				if (!banished(token)) t[i++] = token;
			}
			System.out.println("\""+t[0]+"\", \""+t[1]+"\", \""+t[2]+"\",");
			int k = 0;
			for (int j = 3; j < t.length; j++) if (t[j] != null) {
//				if (!t[j].contains("adv")) {
//					System.out.print("********************************");
//				}
				if (j == 57 || j == 62) {
					System.out.print("null, ");
					k++;
				}
				if (t[j].equals("null")) {
					System.out.print( t[j] + ", ");
				} else {
					System.out.print("\"" +t[j] + "\", ");
				}
				if (++k % 6 == 0) System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Cadê verbo.txt?");
		}
	}
	static boolean banished(String token) {
		if (token.equals("eu") ||
			token.equals("tu") ||
			token.equals("ele") ||
			token.equals("nós") ||
			token.equals("vós") ||
			token.equals("eles") ||
			token.equals("do") ||
			token.equals("não") ||
			token.equals("se") ||
			token.equals("que") ||
			token.equals("por") ||
			token.equals("quando") ||
			token.equals("pessoal") ||
			token.equals("subjuntivo") ||
			token.equals("imperfeito") ||
			token.equals("pretérito") ||
			token.equals("mais-que-perfeito") ||
			token.equals("perfeito") ||
			token.equals("negativo") ||
			token.equals("indicativo") ||
			token.equals("presente") ||
			token.equals("imperativo") ||
			token.equals("afirmativo") ||
			token.equals("infinitivo:") ||
			token.equals("infinitivo") ||
			token.equals("gerúndio:") ||
			token.equals("particípio:") ||
			token.equals("futuro")) {
			return true;
		}
		return false;
	}
	
}
