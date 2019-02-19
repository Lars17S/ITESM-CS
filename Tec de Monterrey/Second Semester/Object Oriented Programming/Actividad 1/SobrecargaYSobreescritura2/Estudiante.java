public class Estudiante{
	public String nombre;

	public void estudiar(){
		System.out.println("El estudiante " + this.nombre + " está estudiando normal");
		//Imprima cómo estudia Ej. El estudiante X esta estudiando normal
	}

	public void estudiar(int cantidadDePresion){
		System.out.println("El estudiante " + this.nombre + "está estudiando normal, pero con presión " + cantidadDePresion + " para los parciales");
		//Imprima como estudia con presión Ej. El estudiante X esta estudiando noraml pero con presion
	}

	//Agregar una sobrecarga al método estudiar
}
