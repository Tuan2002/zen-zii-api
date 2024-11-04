package com.tuandev.zen_zii.service.interfaces;

import com.tuandev.zen_zii.dto.PostDto;
import com.tuandev.zen_zii.dto.UpdatePostDto;
import com.tuandev.zen_zii.model.DetailedPost;
import com.tuandev.zen_zii.model.Post;

import java.util.List;

public interface IPostsService {

    int insertPost(PostDto postDto);

    List<Post> getPostsById(Integer id);

    List<Post> getPostsByName(String userName);

    List<Post> getPostByIdentifier(String identifier);

    DetailedPost getPostByPostId(Integer postId);

    List<DetailedPost> getRandomPosts(Integer limit);

    List<DetailedPost> getSamplePostsExcludingSelf(Integer userId, Integer limit);

    List<DetailedPost> getFriendPostsPaging(Integer userId, Integer startIndex, Integer limit);

    List<DetailedPost> getFavoritePostsPaging(Integer userId, Integer startIndex, Integer limit);

    List<Post> getSavedPostsByUserId(Integer userId);

    Integer deletePost(Integer postId);

    int updatePost(UpdatePostDto postDto);

    int increaseComments(Integer postId);

    int decreaseComments(Integer postId);

    int increaseLikes(Integer postId);

    int decreaseLikes(Integer postId);
}
