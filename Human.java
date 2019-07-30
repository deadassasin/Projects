public class Human {

    //person's data
    private String name;
    private String gender;
    private int age;
    private int weight;
    private int height;


    //Wrapped person's data
    public Human(String name, String gender, int age, int weight, int height){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //Equal method for Human
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj instanceof Human){
            Human otherHuman = (Human) obj;
            return name.equals(otherHuman.name) &&
                    gender.equals(otherHuman) &&
                    age == otherHuman.age &&
                    weight == otherHuman.weight &&
                    height == otherHuman.height;
        }
        return false;
    }

    //Hashing method for Human
    @Override
    public int hashCode(){
        return 17 * name.hashCode() + 31 * gender.hashCode() + 23 * age + 14 * weight + 12 * height;
    }

    //Method to ease the printing whole person data
    public String personData(String name, String gender, int age, int weight, int height){
            return name + " " + gender + " " + age + " " + weight + " " + height;
        }


    //Main
    public static void main(String[] args) {
        Human todd = new Human("Todd","Male", 12, 40, 150);
        Human Ron = new Human("Ron","Male", 17, 75, 185);
        Human todd2 = new Human("Todd","Male", 12, 40, 150);
        Human dolores = new Human("Dolores","Female", 15, 40, 159);
        Human dolores2 = new Human("Dolores","Female", 17, 38, 162);

        System.out.println(todd.personData("Todd", "Male", 12, 40, 150));

        //Checkup for personData
        System.out.println(todd.name);
        System.out.println(todd.gender);
        System.out.println(todd.age);
        System.out.println(todd.weight);
        System.out.println(todd.height);

        //checkup of objects equality
        System.out.println(todd.equals(todd2));
        System.out.println(dolores.equals(dolores2));
    }

}
