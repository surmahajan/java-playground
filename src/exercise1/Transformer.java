package exercise1;

import java.util.List;

/**
 * Transform ObjectA to ObjectB
 * 
 * @author surabhimahajan
 *
 */
public interface Transformer {
	
	
	// Transform ObjectA in to ObjectB
	List<ObjectB> transform(final List<ObjectA> listOfObjects);
	
}
