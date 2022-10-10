package comunicacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alfabeto extends Pictograma {
	private List<String> letras = new ArrayList<>();

	private String interpretacion;

	public Alfabeto(String origen, String[] strings, String interpretacion) {
		super(origen);
		this.letras = Arrays.asList(strings);
		this.interpretacion = interpretacion;
	}

	public int cantidadLetras() {
		return letras.size();
	}

	String interpretacion() {
		// TODO Auto-generated method stub
		return getInterpretacion();
	}

	public String toString() {
		// TODO Auto-generated method stub
		String string = "";
		for (int i = 0; i < letras.size(); i++) {
			if (i == letras.size() - 1) {
				string = string + letras.get(i);
			} else {
				string = string + letras.get(i) + ", ";
			}
		}
		return string;
	}

	public List<String> getLetras() {
		return letras;
	}

	public void setLetras(List<String> letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
