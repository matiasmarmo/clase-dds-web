package server;

import spark.Spark;
import spark.debug.DebugScreen;

public class Server {
	public static void main(String[] args) {
		/*configuracion web server*/
		Spark.port(9000);
		DebugScreen.enableDebugScreen();
		/*ruteo dinamico*/
		Router.instance().configurar();
		Spark.init(); //inicio el Spark
	}

}
