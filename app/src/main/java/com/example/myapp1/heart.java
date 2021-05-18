package com.example.myapp1;

public class heart {

    String fullname;
    String gender;
    String age;
    String blood;
    String alcohol;
    String smoke;
    String stroke;
    String health;



    public heart(String fullname,String age,String gender,String blood,String alcohol,String smoke,String stroke,String health) {

        this.fullname = fullname;
        this.age = age;
        this.gender = gender;
        this.blood= blood;
        this.alcohol=alcohol;
        this.smoke=smoke;
        this.stroke=stroke;
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
    public String getAlcohol(){
        return alcohol;
    }
    public String getSmoke(){
        return smoke;
    }
    public String getStroke(){
        return stroke;
    }
    public String getHealth(){return health;}
}
