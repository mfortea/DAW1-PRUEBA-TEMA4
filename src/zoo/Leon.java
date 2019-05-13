package zoo;

/**
 * Clase León, clase hija de Mamífero
 * @author usuario
 */
public class Leon extends Mamifero {
 
    private String rugido = "GRRRRR";
    
    /**
     * Método constructor sin argumentos.
     */
    public Leon () {}
    
    /**
     *Método constructor con argumentos.
     * @param habitat -> Lugar donde vive el león.
     * @param comida -> Tipo de alimento.
     * @param longevidad -> Años de vida.
     * @param periodoLactancia -> Tiempo en el que el león se encuentra en período de lactancia
     */
    public Leon (Habitat habitat, String comida, int longevidad, int periodoLactancia) {
        super(habitat, comida, longevidad, periodoLactancia);
    }
    
    /**
     * Método setRugido()
     * Cambia el rugido que le pasemos como String.
     * @param rugido -> String con el rugido a establecer.
     */
    public void setRugido (String rugido) { this.rugido = rugido; }
    
    /**
     * Método getRugido()
     * Obtiene el rugido actual del león.
     * @return rugido -> Devuelve un String del rugido actual del león.
     */
    public String getRugido () { return rugido; }
    
    /**
     * Método rugir()
     * No devuelve nada. Imprime por pantalla el rugido del león.
     */
    public void rugir () { System.out.println(rugido); }
    
    /**
     * Método comer()
     * No devuelve nada. Imprime por pantalla la comida que está comiendo el león.
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     *Método desplazar()
     * No devuelve nada. Imprime por pantalla "Estoy en busca de" y la comida que tenga asignada-
     */
    public void desplazar () { System.out.println("Estoy en busca de " + comida); }
}
