package comunicacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tesis extends Escrito {
	private String idea;
	private List<String> argumentos = new ArrayList<>();
	private String conclusion;
	private String referencias;
	private String interpretacion;

	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] strings,
			String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = Arrays.asList(strings);
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return palabrasPagina * 5 * this.getPaginas();
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return getInterpretacion();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n"
				+ this.idea + "\n" + this.argumentos.size() + "\n" + this.conclusion + "\n" + this.referencias;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public List<String> getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(List<String> argumentos) {
		this.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
