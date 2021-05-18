package com.example.myapp1;

public class skin {

    String fullname;
    String gender;
    String age;
    String blood;
    String allergy;
    String health;



    public skin(String fullname,String age,String gender,String blood,String allergy,String health) {

        this.fullname = fullname;
        this.age = age;
        this.gender = gender;
        this.blood= blood;
        this.allergy=allergy;
        this.health=health;

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
    public String getAllergy(){
        return allergy;
    }
    public String getHealth(){return health;}

}
