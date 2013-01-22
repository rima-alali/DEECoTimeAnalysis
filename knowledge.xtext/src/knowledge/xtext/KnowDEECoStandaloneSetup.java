
package knowledge.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class KnowDEECoStandaloneSetup extends KnowDEECoStandaloneSetupGenerated{

	public static void doSetup() {
		new KnowDEECoStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

