package comunicacion;

public class Alfabeto extends Pictograma {

    private String letras[];
    private String interpretacion;
    public Alfabeto(String origen, String letras[], String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }
    public String toString(){
        String resultado = "";
        for (String letra: letras){
            resultado = (resultado+letra+", ");
        }
        return (resultado.substring(0,resultado.length()-2));
    }
    public int cantidadLetras(){
        return this.letras.length;
    }
    public String interpretacion(){
        return this.interpretacion;
    }
    public String[] getLetras() {
        return letras;
    }
    public void setLetras(String[] letras) {
        this.letras = letras;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}