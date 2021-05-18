package com.example.myapp1;

public class donate {

    String reg_patid;
    String reg_name;
    String reg_age;
    String reg_dob;
    String reg_blood;
    String reg_email;
    String reg_frst;
    String reg_phn;
    String reg_add;


    public donate(String reg_patid,String reg_name,String reg_age,String reg_dob,String reg_blood,String reg_email,String reg_frst,String reg_phn,String reg_add) {

        this.reg_patid=reg_patid;
        this.reg_name =reg_name ;
        this. reg_age=reg_age ;
        this. reg_dob= reg_dob;
        this.reg_blood=reg_blood ;
        this.reg_email=reg_email;
        this.reg_frst=reg_frst;
        this.reg_phn=reg_phn;
        this.reg_add=reg_add;
    }
    public String getReg_patid(){
        return reg_patid;
    }
    public String getReg_name(){
        return reg_name;
    }
    public String getReg_age(){
        return reg_age;
    }
    public String getReg_dob(){
        return reg_dob;
    }
    public String getReg_blood(){
        return reg_blood;
    }
    public String getReg_email(){
        return reg_email;
    }
    public String getReg_frst(){
        return reg_frst;
    }
    public String getReg_phn(){
        return reg_phn;
    }
    public String getReg_add(){
        return reg_add;
    }
}
