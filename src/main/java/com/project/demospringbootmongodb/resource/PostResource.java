package com.project.demospringbootmongodb.resource;

import com.project.demospringbootmongodb.domain.Post;
import com.project.demospringbootmongodb.domain.User;
import com.project.demospringbootmongodb.dto.UserDTO;
import com.project.demospringbootmongodb.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
