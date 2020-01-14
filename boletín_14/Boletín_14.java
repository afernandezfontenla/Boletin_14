package boletín_14;

/**
 *
 * @author afernandezfontenla
 */
public class Boletín_14 {

    public static void main(String[] args) {

        ConversorTemperaturas obj = new ConversorTemperaturas();

        try {
            obj.centigradosAFharenheit(95);
        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println("Error!! " + ex.getMessage());
        }


    }

}
