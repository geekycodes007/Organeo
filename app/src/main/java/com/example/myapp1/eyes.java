package com.example.myapp1;

public class eyes {


    String fullname;
    String gender;
    String age;
    String blood;
    String glass;
    String irri;
    String health;


       public eyes(String fullname,String age,String gender,String blood,String glass,String irri,String health) {

           this.fullname = fullname;
           this.age = age;
           this.gender = gender;
           this.blood= blood;
           this.glass=glass;
           this.irri=irri;
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
    public String getGlass(){
        return glass;
    }
    public String getIrri(){
        return irri;
    }
    public String getHealth(){
        return health;
    }


       }