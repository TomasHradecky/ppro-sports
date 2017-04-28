package cz.uhk.sportportal.service.impl;

import cz.uhk.sportportal.dao.CommentDao;
import cz.uhk.sportportal.model.Comment;
import cz.uhk.sportportal.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *
 */
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentDao commentDao;

    @Override
    public List<Comment> findAll() {
        return commentDao.findAll();
    }

    @Override
    public List<Comment> findEnabledAll() {
        return null;
    }

    @Override
    public void save(Comment comment) {

    }

    @Override
    public Comment update(Comment comment) {
        return null;
    }

    @Override
    public void disable(Comment comment) {

    }

    @Override
    public Comment findById(Integer p) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
