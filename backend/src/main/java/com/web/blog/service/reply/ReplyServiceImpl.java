package com.web.blog.service.reply;

import java.util.List;

import com.web.blog.dao.question.QuestionDao;
import com.web.blog.dao.reply.ReplyDao;
import com.web.blog.model.question.Question;
import com.web.blog.model.reply.Reply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ReplyServiceImpl implements ReplyService {
    @Autowired
    ReplyDao replyDao;

    @Override
    public int writeReply(Reply reply) {
        return replyDao.writeReply(reply);
    }

    @Override
    public int modifyReply(Reply reply) {
        return replyDao.modifyReply(reply);
    }

    @Override
    public int deleteReply(int rpNo) {
        return replyDao.deleteReply(rpNo);
    }

    @Override
    public Reply oneReply(int rpNo) {
        return replyDao.oneReply(rpNo);
    }

    @Override
    public List<Reply> replyList(int queNo) {
        return replyDao.replyList(queNo);
    }




}