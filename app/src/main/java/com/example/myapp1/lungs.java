package com.example.myapp1;

public class lungs {



    String fullname;
    String gender;
    String age;
    String blood;
    String smoke;
    String breathe;
    String alcohol;
    String health;


    public lungs(String fullname,String age,String gender,String blood,String smoke,String breathe,String alcohol,String health) {

        this.fullname = fullname;
        this.age = age;
        this.gender = gender;
        this.blood= blood;
        this.smoke=smoke;
        this.breathe=breathe;
        this.alcohol=alcohol;
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
    public String getSmoke(){
        return smoke;
    }
    public String getAlcohol(){
        return alcohol;
    }
    public String getBreathe(){return breathe;}
    public String getHealth(){return health;}
}
