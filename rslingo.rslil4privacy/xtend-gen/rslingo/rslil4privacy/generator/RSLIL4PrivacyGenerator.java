/**
 * generated by Xtext
 */
package rslingo.rslil4privacy.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import rslingo.rslil4privacy.generator.RSLIL4Privacy2EddyGenerator;
import rslingo.rslil4privacy.generator.RSLIL4Privacy2JsonGenerator;
import rslingo.rslil4privacy.generator.RSLIL4Privacy2TextGenerator;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RSLIL4PrivacyGenerator implements IGenerator {
  public final static String JSON_MODE = "JsonMode";
  
  public final static String TEXT_MODE = "TextMode";
  
  @Inject
  private RSLIL4Privacy2EddyGenerator eddyGen;
  
  @Inject
  private RSLIL4Privacy2JsonGenerator jsonGen;
  
  @Inject
  private RSLIL4Privacy2TextGenerator textGen;
  
  private String genMode;
  
  public void setGenMode(final String mode) {
    this.genMode = mode;
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    boolean _equals = Objects.equal(this.genMode, null);
    if (_equals) {
      this.eddyGen.doGenerate(resource, fsa);
    } else {
      boolean _equals_1 = this.genMode.equals(RSLIL4PrivacyGenerator.JSON_MODE);
      if (_equals_1) {
        this.jsonGen.doGenerate(resource, fsa);
      } else {
        boolean _equals_2 = this.genMode.equals(RSLIL4PrivacyGenerator.TEXT_MODE);
        if (_equals_2) {
          this.textGen.doGenerate(resource, fsa);
        }
      }
    }
  }
}
