import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Shark("Shark"),
                new Shark("Delfin"),
                new Shark("Kit"),


                new Eagle("Kulaly"),
                new Eagle("Kush"),
                new Eagle("Eagle"),

                new Turtle("Turtle"),
                new Turtle("Chere-Pacha"),
                new Turtle("Nindzya")
        };
        System.out.println("GET CLASS");
        for (Animal animal : animals) {
            if (animal.getClass().equals(Shark.class)) ((Shark) animal).attack();
            else if (animal.getClass().equals(Eagle.class)) ((Eagle) animal).fly();
            else if (animal.getClass().equals(Turtle.class)) ((Turtle) animal).swim();
            System.out.println(animal);
            System.out.println();

        }
        System.out.println("-----------instanceof--------------");
        Shark[] sharks = new Shark[3];
        Eagle[] eagles = new Eagle[3];
        Turtle[] turtles = new Turtle[3];
      int shark=0;
      int eagl=0;
      int turtle=0;
        for (Animal animal : animals) {
          if (animal instanceof Shark){
              sharks[shark]=(Shark) animal;
              ((Shark) animal).attack();
              shark++;
          } else if (animal instanceof Turtle) {
              turtles[turtle]=(Turtle) animal;
              ((Turtle) animal).swim();
              turtle++;
          } else if (animal instanceof Eagle) {
              eagles[eagl]=(Eagle) animal;
              ((Eagle) animal).fly();
              eagl++;
          }
        }
        System.out.println(Arrays.toString(sharks));
        System.out.println();
        System.out.println(Arrays.toString(turtles));
        System.out.println();
        System.out.println(Arrays.toString(eagles));
    }
}