package services;

import dao.FollowDAO;
import models.Follow;
import models.services.FollowService;
import net.response.FollowResponse;

import java.io.IOException;

public class FollowServiceImpl implements FollowService {
    @Override
    public FollowResponse followUser(Follow follow) throws IOException {
        FollowDAO followDAO = new FollowDAO();
        return followDAO.followUser(follow);
    }
}
