package com.example.jsp_servelet.controller;

import com.example.jsp_servelet.entity.ProductEntity;
import com.example.jsp_servelet.model.ProductModel;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/product")
public class ProductServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ProductServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("product/index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductModel productModel = new ProductModel();
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(request.getParameter("name"));
        productEntity.setPrice(Double.parseDouble(request.getParameter("price")));
        productEntity.setQuantity(Integer.parseInt(request.getParameter("quantity")));
        boolean status = request.getParameter("status") != null;
        productEntity.setStatus(status);
        if (productModel.create(productEntity)) {
            request.setAttribute("msg", "Successful");
        } else {
            request.setAttribute("msg", "Failed");
        }
        request.getRequestDispatcher("product/index.jsp").forward(request, response);
    }

}