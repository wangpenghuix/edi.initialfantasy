package org.edi.initialfantasy.repository;

import org.edi.initialfantasy.bo.userauthrization.UserAuth;

/**
 * Created by asus on 2018/7/6.
 */
public interface IBORepositoryUserAuth {
    void saveLoginRecord(UserAuth userAuth);
    UserAuth serchLoginRecord(String userName);
    void updateAuthExpires(UserAuth userAuth);
    void updateActive(UserAuth userAuth);
    UserAuth serchAuthByToken(String token);
}