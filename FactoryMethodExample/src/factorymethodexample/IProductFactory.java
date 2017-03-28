/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodexample;

import factoerymethodexample.BE.Product;

/**
 *
 * @author jeppjleemoritzled
 */
public interface IProductFactory
{
    public Product createProduct(ProductType type, String kategori);
}
