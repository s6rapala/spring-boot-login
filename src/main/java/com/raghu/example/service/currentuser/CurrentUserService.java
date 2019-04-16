package com.raghu.example.service.currentuser;

import com.raghu.example.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
