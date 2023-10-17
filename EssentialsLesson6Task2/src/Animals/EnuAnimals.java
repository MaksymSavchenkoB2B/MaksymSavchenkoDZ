package Animals;

public class EnuAnimals {
        public enum Animals{
            Crocodile(8), Tiger(10);
            private int age;
            Animals(int age) {
                this.age = age;
            }

            @Override
            public String toString() {
                return "Amimal - " + this.name() + ", Age - " + age;
            }
        }

        public static void main(String[] args) {
            Animals Crocodile = Animals.Crocodile;
            Animals Tiger = Animals.Tiger;

            System.out.println(Crocodile.toString());
            System.out.println(Tiger.toString());
        }
    }


