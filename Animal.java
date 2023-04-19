package jdr;

//CREAMOS ATRIBUTOS DEL ANIMAL 
public abstract class Animal {
	   private String nombre;
	   private String genero;
	   private String especie;
	   private int edad;
	   private String habitat;
	   private String cuidador;

//ESTABLECEMOS EL TOSTRING 	   
public Animal(String nombre, String genero, String especie, int edad, String habitat, String cuidador) {
	      this.nombre = nombre;
	      this.genero = genero;
	      this.especie = especie;
	      this.edad = edad;
	      this.habitat = habitat;
	      this.cuidador = cuidador;
	   }

//ESTABLECEMOS LOS GET Y SET
	   public String getNombre() {
	      return nombre;
	   }

	   public void setNombre(String nombre) {
	      this.nombre = nombre;
	   }

	   public String getGenero() {
	      return genero;
	   }

	   public void setGenero(String genero) {
	      this.genero = genero;
	   }

	   public String getEspecie() {
	      return especie;
	   }

	   public void setEspecie(String especie) {
	      this.especie = especie;
	   }

	   public int getEdad() {
	      return edad;
	   }

	   public void setEdad(int edad) {
	      this.edad = edad;
	   }

	   public String getHabitat() {
	      return habitat;
	   }

	   public void setHabitat(String habitat) {
	      this.habitat = habitat;
	   }

	   public String getCuidador() {
	      return cuidador;
	   }

	   public void setCuidador(String cuidador) {
	      this.cuidador = cuidador;
	   }

//ESTABLECEMOS ATRIBUTOS ESPECIFICOS PARA MAMIFEROS, REPTILES Y AVES.	   
	  public abstract String tipoDesplazamiento();
	  public abstract int longitudPico();
	  public abstract boolean esRapaz();
	  public abstract String colorEscamas();
	}
