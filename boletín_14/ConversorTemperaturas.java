package boletín_14;

/**
 *
 * @author afernandezfontenla
 */
public class ConversorTemperaturas {

    static final float min = 80;
    float cen;
    float fharen;
    float rea;

    public float centigradosAFharenheit(float cen) throws TemperaturaErradaExcepcion {

        if (cen < min) {
            throw new TemperaturaErradaExcepcion("La temperatura no debe ser inferior de 80ºC");
        }
        float fharen = (float) (9 / 5 * cen + 32.4);
        System.out.println(cen + "ºC son " + fharen + "ºF");
        return fharen;
    }

    public void centigradosAReamur(float cen) throws TemperaturaErradaExcepcion {

        if (cen < min) {
            throw new TemperaturaErradaExcepcion("La temperatura no debe ser inferior de 80ºC");
        }
        float rea = (float) (4 / 5 * cen);
        System.out.println(cen + "ºC son " + rea + "ºRe");
    }

    public void amosar (float cen, float fharen, float rea) {
        System.out.println(cen + "ºC son " + fharen + "ºF y " + rea + "ºRe.");
    }

}
