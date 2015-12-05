package org.codehaus.griffon.runtime.jgoodies;

import javax.inject.Named;
import griffon.builder.swing.JGoodiesFormsBuilderCustomizer;
import griffon.util.BuilderCustomizer;
import org.kordamp.jipsy.ServiceProviderFor;
import griffon.core.injection.Module;
import org.codehaus.griffon.runtime.core.injection.AbstractModule;


@Named("jgoodies-forms")
@ServiceProviderFor(Module.class)
public class JgoodiesFormsModule extends AbstractModule {
  @Override
  protected void doConfigure() {
    bind(BuilderCustomizer.class)
        .to(JGoodiesFormsBuilderCustomizer.class)
        .asSingleton();
  }
}
