/**
 * generated by Xtext 2.12.0
 */
package org.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.UpctformagamiRuntimeModule;
import org.xtext.UpctformagamiStandaloneSetup;
import org.xtext.ide.UpctformagamiIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class UpctformagamiIdeSetup extends UpctformagamiStandaloneSetup {
  @Override
  public Injector createInjector() {
    UpctformagamiRuntimeModule _upctformagamiRuntimeModule = new UpctformagamiRuntimeModule();
    UpctformagamiIdeModule _upctformagamiIdeModule = new UpctformagamiIdeModule();
    return Guice.createInjector(Modules2.mixin(_upctformagamiRuntimeModule, _upctformagamiIdeModule));
  }
}
