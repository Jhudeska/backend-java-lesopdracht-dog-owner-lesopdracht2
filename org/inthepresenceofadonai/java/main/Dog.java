public class Dog {
        private String name;
        private final String spicies;
        public int age;
        private final String sex;

        public Dog(String name, String spicies, int age, String sex) {
                this.spicies = spicies;
                this.sex = sex;
                this.age = age;
                this.name = name;
        }
//        Dog dog = new Dog("Barra", "vuilnisbak", 12, "teef");
        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getSpicies() {
                return spicies;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                //de leeftijd met 1 te verhogen
                this.age = age;
        }

        public String getSex() {
                return sex;
        }
}