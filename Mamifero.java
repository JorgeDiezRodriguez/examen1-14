package jdr;

public class Mamifero extends Animal {
	   private String tipoDesplazamiento;

	   public Mamifero(String nombre, String genero, String especie, int edad, String habitat, String cuidador, String tipoDesplazamiento) {
	      super(nombre, genero, especie, edad, habitat, cuidador);
	      this.tipoDesplazamiento = tipoDesplazamiento;
	   }

	  
	   public String tipoDesplazamiento() {
	      return tipoDesplazamiento;
	   }


	   public String getTipoDesplazamiento() {
	      return tipoDesplazamiento;
	   }

	   public void setTipoDesplazamiento(String tipoDesplazamiento) {
	      this.tipoDesplazamiento = tipoDesplazamiento;
	   }


	   

	@Override
	public int longitudPico() {
		
		return 0;
	}

	@Override
	public boolean esRapaz() {
	
		return false;
	}

	@Override
	public String colorEscamas() {
		
		return null;
	}
	   }