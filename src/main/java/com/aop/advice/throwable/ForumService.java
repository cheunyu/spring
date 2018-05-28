package com.aop.advice.throwable;

/**
 * @author:cheunyu
 * @date:2018/5/28 17:19
 */
public class ForumService {

    public void removeForum(int forumId) {
        int i = forumId/0;
    }
}
