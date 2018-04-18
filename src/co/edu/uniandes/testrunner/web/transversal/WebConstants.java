package co.edu.uniandes.testrunner.web.transversal;

public class WebConstants {

	public static final String TEST_CASES_HEADER = "Ejecuci�n de Pruebas";
	public static final String REPORT_HEADER = "Reportes de Ejecuci�n";
	public static final String ABOUT_HEADER = "Acerca de";

	public static final String GROWL_INFO = "Informaci�n: ";
	public static final String GROWL_WARNING = "Advertencia: ";
	public static final String GROWL_ERROR = "Error: ";

	public static final String LIGHTHOUSE_BASE = "lighthouse --output json --chrome-flags=\"--headless\" --output-path=./lighthouse-results.json ";
	public static final String LIGHTHOUSE_FINISHED = "An�lisis de PWA terminado sobre: ";

	public static final String CYPRESS_COMMAND = "/home/santiago/Documents/parcial/losestudiantes/node_modules/.bin/cypress run -P /home/santiago/Documents/parcial/losestudiantes";
	public static final String CYPRESS_FINISHED = "Test End to End finalizado sobre: ";

}
