
package pbo_teori_poliformismejs12;

public class TelevisiModern extends Elektronik {
 
    private String modelInput;

    public TelevisiModern(String modelInput, int voltase) {
        super(voltase);
        this.modelInput = modelInput;
    }

    public String getModelInput() {
        return modelInput;
    }
}
