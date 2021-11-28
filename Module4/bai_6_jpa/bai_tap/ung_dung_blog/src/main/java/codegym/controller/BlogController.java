package codegym.controller;

import codegym.model.Blog;
import codegym.service.BlogService;
import codegym.service.impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("")
    public String listBlog(Model model) {
        List<Blog> blogs = blogService.getList();
        model.addAttribute("blogs", blogs);
        return "ListBlog";
    }

    @GetMapping("/blog/content/{id}")
    public String listBlogContent(@PathVariable("id") int id, Model model) {
        Blog blogs = blogService.getBlogById(id);
        model.addAttribute("blogs", blogs.getBlogStatus());
        return "ListBlog";
    }
}
