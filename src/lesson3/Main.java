package lesson3;

public class Main {

    public static class Box <T extends String> {
        private T fruits;


        public Box (T fruits) {
            this.fruits = fruits;
        }

        @Override
        public String toString(){
            return "Box: " + this.fruits;
        }

        public T getObject() {
            return this.fruits;
        }

        public void setObject(T object) {
            this.fruits = object;
        }
    }

    public static void main(String[] args) {
        Box <String> box1 = new Box ("Apple");
        Box <String> box2= new Box ("Orange");

        System.out.println(box1.toString());
        System.out.println(box2.toString());





    }


}
