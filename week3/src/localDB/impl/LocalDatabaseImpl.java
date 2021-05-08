package localDB.impl;

import entities.UserEntity;
import localDB.LocalDatabase;

import java.util.ArrayList;
import java.util.List;

public class LocalDatabaseImpl  {

    static List<String> list = new ArrayList<>();


    public static void save(UserEntity userEntity) {
        list = new ArrayList<>();
        list.add(userEntity.getEmail());
        System.out.println(userEntity.getFirstName() + "saved to db");
    }

    public static List<String> list(){
        return list;
    }
}
