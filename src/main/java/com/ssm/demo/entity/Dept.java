package com.ssm.demo.entity;

public class Dept {
    private Integer uid;
    private String uname;

    /*public Dept(){
        super();
    }
    public Dept(Integer uid,String uname){
        super();
        this.uid = uid;
        this.uname = uname;
    }
*/
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    /*@Override
    public String toString(){
        return "Dept [uid = "+uid+",uname = "+uname+"]";
    }*/
}
