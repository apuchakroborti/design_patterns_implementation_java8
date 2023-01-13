package com.apu.example.designpatterns.creational.prototype;

import java.util.Hashtable;

public class ProfessionCache {
    private static Hashtable<Integer, Profession> professionHashtable = new Hashtable<Integer, Profession>();

    public static Profession getCloneNewProfession(int id){
        Profession cachedProfessionInstance = professionHashtable.get(id);
        return (Profession) cachedProfessionInstance.cloningMethod();
    }
    public static void loadProfessionCache(){
        Doctor doctor = new Doctor();
        doctor.id = 1;
        professionHashtable.put(doctor.id, doctor);

        Engineer engineer = new Engineer();
        engineer.id = 2;
        professionHashtable.put(engineer.id, engineer);


        Teacher teacher = new Teacher();
        teacher.id = 3;
        professionHashtable.put(teacher.id, teacher);

    }
}
