import entities.LoginDTO;
import entities.UserEntity;
import service.impl.LoginServiceImpl;
import service.impl.UserServiceImpl;
import validation.impl.GmailValidationImpl;
import validation.impl.RegisterValidationImpl;

public class Main {
    public static void main(String[] args) {

        UserEntity userEntity
                = new UserEntity("abcgmail.com","123","ahmet","mehmet");
        UserEntity userEntity2
                = new UserEntity("mehmet","ahmet","abc@gmail.com","mehmet12");

        LoginDTO entity = new LoginDTO("abc@gmail.com","mehmet12");
        LoginDTO entity1 = new LoginDTO("asd@gmail.com","133");

        UserServiceImpl userService = new UserServiceImpl(new GmailValidationImpl());
        userService.create(userEntity);
        System.out.println("**************");

        UserServiceImpl userService2 = new UserServiceImpl(new RegisterValidationImpl());
        userService.create(userEntity2);

        System.out.println();
        LoginServiceImpl loginService = new LoginServiceImpl();
        loginService.login(entity);

        System.out.println();
        loginService.login(entity1);

    }
}
