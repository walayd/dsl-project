package fr.unice.polytech.dsl.arduinoml.homemade;

import fr.unice.polytech.dsl.arduinoml.Actuator;
import fr.unice.polytech.dsl.arduinoml.App;
import fr.unice.polytech.dsl.arduinoml.Brick;
import fr.unice.polytech.dsl.arduinoml.Sensor;
import fr.unice.polytech.dsl.arduinoml.util.ArduinomlSwitch;

public class ArduinomlSwitchPrinter extends ArduinomlSwitch<String> {
	public String caseApp(App app) {
		StringBuilder sb = new StringBuilder();
		sb.append("// Code generated by ArduinoML \n "
				+ "void setup() { \n ");
		
		for(Brick b : app.getBricks())
			sb.append(doSwitch(b));
		
		sb.append("\n }");
		return sb.toString();
		
	}
	
	public String caseActuator(Actuator act) {
		return "\t pinMode("+ act.getPin()+ ", OUTPUT); \n";
	}
	
	public String caseSensor(Sensor sens) {
		return "\t pinMode("+ sens.getPin()+ ", INPUT); \n";
	}
}
