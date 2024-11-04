package com.tuandev.zen_zii.controller;
import com.tuandev.zen_zii.dto.PostDto;
import com.tuandev.zen_zii.dto.UpdatePostDto;
import com.tuandev.zen_zii.model.Post;
import com.tuandev.zen_zii.service.interfaces.IPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
@RestController
@CrossOrigin
public class PostController {

    protected static final Logger logger = LoggerFactory.getLogger(AccountController.class);
    @Autowired
    private IPostsService _postsService;

    @GetMapping("/posts/user/{userId}")
    public Object getPostsById(@PathVariable("userId") Integer userId){
        return _postsService.getPostsById(userId);
    }

    @GetMapping("/posts/username/{userId}")
    public Object getPostsByName(@PathVariable("userName") String userName){
        return _postsService.getPostsByName(userName);
    }

    @GetMapping("/posts/friends")
    public Object getFriendPosts(@RequestParam("userId") Integer userId, @RequestParam("startIndex") Integer startIndex, @RequestParam("limit") Integer limit){
        return _postsService.getFriendPostsPaging(userId, startIndex, limit);
    }

    @GetMapping("/posts/random/others")
    public Object getSamplePostsExcludingSelf(@RequestParam("userId") Integer userId, @RequestParam("limit") Integer limit){
        return _postsService.getSamplePostsExcludingSelf(userId, limit);
    }

    @GetMapping("/posts/favorites")
    public Object getFavoritePosts(@RequestParam("userId") Integer userId, @RequestParam("startIndex") Integer startIndex, @RequestParam("limit") Integer limit){
        return _postsService.getFavoritePostsPaging(userId, startIndex, limit);
    }

    @GetMapping("/posts/random/{limit}")
    public Object getFriendPostsPaging(@PathVariable("limit") Integer limit){
        return _postsService.getRandomPosts(limit);
    }

    @GetMapping("/posts/identifier/{identifier}")
    public Object getPostByIdentifier(@PathVariable("identifier") String identifier){
        List<Post> post = _postsService.getPostByIdentifier(identifier);
        return post.get(0);
    }

    @GetMapping("/posts/postid/{postId}")
    public Object getPostByPostId(@PathVariable("postId") Integer postId){
        return _postsService.getPostByPostId(postId);
    }

    @GetMapping("/posts/saved/userid/{userId}")
    public Object getSavedPostsByUserId(@PathVariable("userId") Integer userId){
        return _postsService.getSavedPostsByUserId(userId);
    }

    @PostMapping("/posts/new")
    public Integer newPost(@RequestBody PostDto post) {
        logger.info(post.toString());
        return _postsService.insertPost(post);
    }

    @PatchMapping("/posts/update")
    public Integer updatePost(@RequestBody UpdatePostDto post) {
        return _postsService.updatePost(post);
    }

    @DeleteMapping("/posts/delete/{postId}")
    public Integer deletePost(@PathVariable("postId") Integer postId){
        return _postsService.deletePost(postId);
    }
}
