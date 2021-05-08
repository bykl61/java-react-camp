import entities.UserEntity;
import service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserEntity userEntity
                = new UserEntity("abc@gmail.com","12dasd3","ahmet","mehmet");
        UserEntity userEntity2
                = new UserEntity("abc@gmail.com","12dasd3","ahmet","mehmet");

        UserServiceImpl userService = new UserServiceImpl();
        userService.create(userEntity);
        userService.create(userEntity2);
    }
}
