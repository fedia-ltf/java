public class Animal {

        // Attributs
        String family;
        String name;
        int age;
        boolean isMammal;

        // Constructeur paramétré
        public Animal(String family, String name, int age, boolean isMammal) {
            this.family = family;
            this.name = name;
            this.age = age;
            this.isMammal = isMammal;
        }

        // Redéfinition de la méthode toString()
        @Override
        public String toString() {
            return "Animal [Nom: " + name + ", Famille: " + family + ", Age: " + age + ", Mammifère: " + isMammal + "]";
        }
    }


