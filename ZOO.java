package jdr;

import java.util.ArrayList;

public class ZOO {
   private ArrayList<Habitat> habitats;

   public ZOO() {
      this.habitats = new ArrayList<>();
   }

   //ESTABLECEMOS PARA AGREGAR Y ELIMINAR HABITATAS
   public void agregarHabitat(Habitat habitat) {
      habitats.add(habitat);
   }

   public void eliminarHabitat(Habitat habitat) {
      habitats.remove(habitat);
   }

   //ESTABLECEMOS PARA AGREGAR Y ELIMINAR ANIMALES DENTRO DEL HABITAT
   public void agregarAnimal(Habitat habitat, Animal animal) {
      habitat.agregarAnimal(animal);
   }

   public void eliminarAnimal(Habitat habitat, Animal animal) {
      habitat.eliminarAnimal(animal);
   }

   //ESTABLECEMOS PARA SACAR LA LISTA DE HABITATS
   public ArrayList<Habitat> getHabitats() {
      return habitats;
   }



	
}


	



