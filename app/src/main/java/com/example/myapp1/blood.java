package com.example.myapp1;

public class blood {
    String fullname;
    String gender;
    String age;
    String blood;
    String smoke;
    String health;
    String alcohol;


    public blood(String fullname,String age,String gender,String blood,String smoke,String health,String alcohol) {

        this.fullname = fullname;
        this.age = age;
        this.gender = gender;
        this.blood= blood;
        this.smoke=smoke;
        this.health=health;
        this.alcohol=alcohol;
    }

    public String getFullname(){
        return fullname;
    }
    public String getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getBlood(){
        return blood;
    }
    public String getSmoke(){
        return smoke;
    }
    public String getBreathe(){return health;}
    public String getAlcohol(){
        return alcohol;
    }
}
