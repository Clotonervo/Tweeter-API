package dao;

import models.User;
import net.request.LoginRequest;
import net.request.SignUpRequest;
import net.response.LoginResponse;
import net.response.SignUpResponse;

public class UserDAO {
    private MockDatabase mockDatabase;

    public UserDAO(){
        mockDatabase = MockDatabase.getInstance();
    }

    public LoginResponse authenticateUser(LoginRequest request){
        return mockDatabase.authenticateUser(request);
    }

    public SignUpResponse registerUser(SignUpRequest request){
        return mockDatabase.registerNewUser(request);
    }

    public User aliasToUser(String alias){
        return mockDatabase.aliasToUser(alias);
    }
}
