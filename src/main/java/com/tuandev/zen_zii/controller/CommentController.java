package com.tuandev.zen_zii.controller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tuandev.zen_zii.dto.CommentDto;
import com.tuandev.zen_zii.mapper.PostMapper;
import com.tuandev.zen_zii.service.interfaces.ICommentService;
import com.tuandev.zen_zii.service.interfaces.IPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@CrossOrigin
public class CommentController {

    protected static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private ICommentService _commentService;

    @Autowired
    private IPostsService _postsService;

    @GetMapping("/comments/postid/{postId}")
    public Object fetchCommentsByPostId(@PathVariable("postId") Integer postId){
        return _commentService.fetchCommentsByPostId(postId);
    }

    @PostMapping("/comments/new")
    public Integer newComment(@RequestBody CommentDto comment) {
        logger.info(comment.toString());
        _postsService.increaseComments(comment.postId);
        return _commentService.insertComment(comment);
    }

}
