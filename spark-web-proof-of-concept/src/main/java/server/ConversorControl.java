package server;

import spark.Request;
import spark.Response;

public class ConversorControl {
	public String convertirAMillas(Request req, Response res) {
		/* parseo de parametros */
		String km = req.queryParams("km");
		Double kmNumero = Double.parseDouble(km);
		/* logica de dominio */
		Double millas = new Conversor().convertirAMillas(kmNumero);
		/* parsear resultado */
		return millas.toString();
	}
}
