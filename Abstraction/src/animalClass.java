public class animalClass {

    abstract static class Animal {
        // Abstract method does not have a body
        public abstract void animalSound();

        // Regular method
        public void sleepNoise() {
            System.out.println("zzzzzzzz");
        }
    }



        public static class Pig extends Animal{
            // Actually sound of animal
            public void animalSound(){
                System.out.println("The pig says: wee wee ");
            }
        }



    public static void main(String[] args) {
        Pig peppa = new Pig();
        peppa.animalSound();
        peppa.sleepNoise();
    }


}
