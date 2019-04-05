public class User {

    String name;
    short age;
    int height;

    //здесь будут конструкторы
    public User(String name, short age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public User(String name, int height, short age){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(short age, String name, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public User(short age, int height, String name){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(int height, String name, short age){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public User(int height, short age, String name){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args){

        User user1 = new User(33, (short) 25, "Hanni");
        System.out.println(user1.age + " " + user1.height + " " + user1.name);

    }
}
