package com.example.myapplication.obj;

class Deliverer extends User {
    String status;
    Availability availability_obj;


    private Deliverer(Availability availability_obj){
        status = "Available";
        this.availability_obj = availability_obj;
    }
}
