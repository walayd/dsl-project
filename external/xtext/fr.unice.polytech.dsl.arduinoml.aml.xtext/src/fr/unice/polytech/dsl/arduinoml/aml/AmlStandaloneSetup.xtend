/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.arduinoml.aml


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AmlStandaloneSetup extends AmlStandaloneSetupGenerated {

	def static void doSetup() {
		new AmlStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}