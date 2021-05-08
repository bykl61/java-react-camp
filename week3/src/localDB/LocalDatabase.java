package localDB;

import entities.UserEntity;

import java.util.List;

public interface LocalDatabase {
    List<String> emailList(UserEntity userEntity);
}
