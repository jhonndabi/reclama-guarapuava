/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.model.service;

import br.edu.utfpr.model.Category;
import br.edu.utfpr.model.dao.CategoryDAO;

/**
 *
 * @author felipe
 */
public class CategoryService extends AbstractService<Long, Category>{

    public CategoryService() {
        dao = new CategoryDAO();
    }
    
}
