package switchCase;

import java.util.ArrayList;
import java.util.Arrays;

public class AtividadeTres2407 {

	public static void main(String[] args) {
		String[] disciplinas = {"matemática", "filosofia", "histótia", "física"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("geografia");
		novaLista.add("língua inglesa");

		for (String i: novaLista)
		{
			System.out.println("Disciplina: "+i);
		}
	}

}
