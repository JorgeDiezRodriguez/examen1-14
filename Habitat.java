package jdr;

import java.util.ArrayList;
import java.util.List;

public class Habitat {
   private String nombre;
   private ArrayList<Animal> animales;

   public Habitat(String nombre) {
      this.nombre = nombre;
      this.animales = new ArrayList<>();
   }

   //ESTABLECEMOS NOMBRE
   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   //ESTABLECEMOS AGREAGAR EL ANIMAL
   public void agregarAnimal(Animal animal) {
      animales.add(animal);
   }
   List<Animal> listaAnimales = new ArrayList<>();
   

   public void eliminarAnimal(Animal animal) {
      animales.remove(animal);
   }

   //ESTABLECEMOS EL SACAR LA LISTA DE ANIMALES
   public ArrayList<Animal> getAnimales() {
      return animales;
   }
}

