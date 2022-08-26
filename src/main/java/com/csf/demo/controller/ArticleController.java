package com.csf.demo.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.csf.demo.model.Article;
import com.csf.demo.service.ArticleService;

 
//mark class as Controller  
@RestController  
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ArticleController   
{  
	//autowire the BooksService class  
	@Autowired  
	ArticleService aS;  
	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/article")  
	private List<Article> getAllArticle()   
	{  
		return aS.getAllArticle();  
	}  
	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/article/{id}")  
	private Article getArticle(@PathVariable("id") int id)   
	{  
		return aS.getArticleById(id);  
	}  
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/article/{id}")  
	private void deleteArticle(@PathVariable("id") int id)   
	{  
		aS.delete(id);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/article")  
	private int saveArticle(@RequestBody Article a)   
	{  
		aS.saveOrUpdate(a);  
		return a.getId();  
	}  
	//creating put mapping that updates the book detail   
	@PutMapping("/article")  
	private Article update(@RequestBody Article a)   
	{  
		aS.saveOrUpdate(a);  
		return a;  
	}  
}  


