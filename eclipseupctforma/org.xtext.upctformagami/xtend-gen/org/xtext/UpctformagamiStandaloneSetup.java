/**
 * generated by Xtext 2.12.0
 */
package org.xtext;

import org.xtext.UpctformagamiStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class UpctformagamiStandaloneSetup extends UpctformagamiStandaloneSetupGenerated {
  public static void doSetup() {
    new UpctformagamiStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
