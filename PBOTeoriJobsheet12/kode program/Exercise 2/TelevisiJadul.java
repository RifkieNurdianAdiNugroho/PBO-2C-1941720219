
package pbo_teori_poliformismejs12;

public class TelevisiJadul extends Elektronik{
   private String modelInput;

    public TelevisiJadul(String modelInput, int voltase) {
        super(voltase);
        this.modelInput = modelInput;
    }

    public String getModelInput() {
        return modelInput;
    }
    
}
