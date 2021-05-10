package localDB;

import entities.UserEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LocalDatabaseImpl  {

    static HashMap<String,String> list = new HashMap<>();


    public static void save(UserEntity userEntity) {
        list = new HashMap<>();
        list.put(userEntity.getEmail(), userEntity.getPassword());
        System.out.println(userEntity.getFirstName() + " saved to db");
    }

    public static HashMap<String,String> list(){
        return list;
    }
}
