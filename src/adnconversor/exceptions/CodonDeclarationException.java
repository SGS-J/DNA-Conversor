
package adnconversor.exceptions;

/**
 *
 * @author usuario
 */
public class CodonDeclarationException extends ADNConversorExceptions{

    private static final String MSG = "CodonDeclarationException";
    
    public CodonDeclarationException() {
        this(MSG);
    }

    public CodonDeclarationException(String message) {
        super(message);
    }
 
    
}