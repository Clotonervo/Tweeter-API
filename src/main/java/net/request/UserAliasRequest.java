package net.request;

public class UserAliasRequest {
    public String userAlias;
    public String authToken;

    UserAliasRequest(){}

    public String getUserAlias() {
        return userAlias;
    }

    public String getAuthToken() {
        return authToken;
    }
}
