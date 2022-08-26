package com.csf.demo.repository;



import org.springframework.data.repository.CrudRepository;

import com.csf.demo.model.Article;


//repository that extends CrudRepository  
public interface ArticleRepository extends CrudRepository<Article, Integer>  
{  
}  