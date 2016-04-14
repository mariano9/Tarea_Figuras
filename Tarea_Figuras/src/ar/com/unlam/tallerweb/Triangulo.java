package ar.com.unlam.tallerweb;

public class Triangulo {
private Double lado;   
//Ponemos solo un lado ya que solo se permiten triangulos equilateros

		public Triangulo(Double lado) 
		{
			this.lado = lado;
		}

//////Metodos
		
		public Double perimetro()
		{
			return this.lado * 3;
		}
				
		public Double area()
		{
			Double base	  = this.lado / 2;
			Double altura = Math.sqrt((this.lado * this.lado) - (base * base));  //Pitagoras
			return ((base*altura) / 2);
		}
}