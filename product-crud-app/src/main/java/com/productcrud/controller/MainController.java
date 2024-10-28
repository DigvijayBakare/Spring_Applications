package com.productcrud.controller;

import com.productcrud.dao.ProductDao;
import com.productcrud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ProductDao productDao;

    @RequestMapping("/home")
    public String home(Model m) {
        List<Product> products = productDao.getAllProducts();
        m.addAttribute("products", products);
        return "index";
    }

    @RequestMapping("/addProduct")
    public String addProduct(Model m) {
        m.addAttribute("title", "Add Product");
        return "addProduct";
    }

    @RequestMapping(value = "/handleProduct", method = RequestMethod.POST)
    public String handleProductForm(@ModelAttribute Product product) {
        System.out.println(product);
        productDao.createProduct(product);
        return "redirect:/home";
    }

    @RequestMapping(value = "/delete/{productId}")
    public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request) {
        this.productDao.deleteSingleProduct(productId);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath() + "/");
        return redirectView;
    }

    @RequestMapping("/update/{productId}")
    public String updateProduct(@PathVariable("productId") int productId, Model m) {
        Product product = productDao.getSingleProduct(productId);
        m.addAttribute("product", product);
        return "updateForm";
    }
}
