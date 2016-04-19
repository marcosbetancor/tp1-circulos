package ar.edu.unlam.tp1;

public class Circulo {
	private static final Double PI = 3.14159265358979323846;
	private Double radio;
	
	
	public Circulo(Double radio){
		this.radio = radio;
	}
	
	
	public Double getRadio(){
		return this.radio;	
	}
	
	public void setRadio(Double radio){
		this.radio = radio;
	
	}
	
	public Double calculaPerimetro(){
		
		Double perimetro = 2 * PI * this.radio;
		
		return perimetro;
	}
	
	public Double calculaArea(){
		
		Double area= PI * this.radio * this.radio;
		
		return area;
		
	}
}
