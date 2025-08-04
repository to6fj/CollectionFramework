package com.innerclass.staticinnerclass.builderpattern;

public class User
{
    private final String name;
    private final String email;
    private final  int age;
    private final String address;
    private User(UserBuilder userBuilder)
    {
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
    }
    static  class UserBuilder
    {
        private  final String name;
        private final String email;
        private int age;
        private String address;

        public UserBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }
        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        public  UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "Name:"+name+" Email: "+email+" Age: "+age+" Address: "+address;
    }
}
class Test
{
    public static void main(String[] args) {
        User user=new User.UserBuilder("Shubham","shubham@gmail.com")
                .setAge(26)
                .setAddress("Pune").build();
        System.out.println(user);
                    }
}
