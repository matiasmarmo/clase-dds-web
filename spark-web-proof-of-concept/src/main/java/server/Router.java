package server;

import spark.Spark;

public class Router { // lo hago singleton porque no tiene sentido crear muchos routers
	static Router _instance;

	private Router() {

	}

	public static Router instance() {
		if (_instance == null) {
			_instance = new Router();
		}
		return _instance;
	}

	public void configurar() {
		Spark.staticFileLocation("/public"); //agrego los archivos de html
		Spark.get("/conversor/millas", (req, res) -> {
					return new ConversorControl().convertirAMillas(req,res);
		});
	}
}
