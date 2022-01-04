package Core;

import java.util.List;

import Persist.AbstractFactoryDao;
import Persist.ProductDao;
import Persist.ProductDaoMySql;
import UI.ProductView;

public class ProductFacade {
    
    /**
     * Instance of the ProductFacade class (Singleton)
     */
    private static ProductFacade instance = new ProductFacade();
 
    private AbstractFactoryDao abstractFactoryDao ;
    
 
    private ProductView productView;
    
    /**
     * Private constructor of the class (Singleton)
     */
    private ProductFacade(){
        this.abstractFactoryDao = AbstractFactoryDao.getFactory("mysql");
    }
 
    
    /** Get the singleton instance of the ProductFacade
     * @return ProductFacade
     */
    public static ProductFacade getInstance() {
        return ProductFacade.instance;
    }
    
 
    
    /** Get th product view
     * @return ProductView
     */
    public ProductView getProductView() {
        return this.productView;
    }

 
    
    /** 
     * @return products
     */
    public List<Product> getProducts() {
        return abstractFactoryDao.createProductDao().getProducts();
    }
    
 
    
    /** Set the products of the ProductFacade class
     * @param products
     * @return Product
     */
    public Product set(Product[] products ) {
        return null;
    }
    
 
    
    /** Get the AbstractFactoryDao
     * @return AbstractFactoryDao
     */
    public AbstractFactoryDao get() {
        return this.abstractFactoryDao;
    }


    
    /** Create a new product in the database with a Product
     * @param product Product to be created 
     * @return id of the product created in the database
     */
    public int createProduct(Product product) {
        return 0;
    }
   
    
    /** Update a product in the database 
     * @param id id of the product to upadate 
     * @param newproduct product with the changes 
     */
    public void updateProduct(int id, Product newproduct) {
        
    }
   
    
    /** Get a product in the databse using an id 
     * @param id id of the product to get 
     * @return Product
     */
    public Product getProductById(String id) {
        return null;
    }
   
    /** Purchase a product directly 
     * @param product product to buy  
     */
    public void purchase(Product product) {
        //TODO
    }
   
    /** Add a product to the cart 
     * @param product product to add to the cart  
     */
    public void addToCart(Product product) {
        //TODO
    }
   
    
    /** Get the products in the database owned by an user
     * @param user 
     * @return Product[] List of the products of the user 
     */
    public Product[] getProductsByUser(User user) {
        return null;
    }
   
    
    /** Get the products in the database by their category 
     * @param category category of the product
     * @return Product[]
     */
    public Product[] getProductsByCategory(ProductCategory category) {
        return null;
    }
   
    
    /** Get the products of an Author in the database 
     * @param user The author 
     * @return Product[]
     */
    public Product[] getProductsByAuthor(User author) {
        return null;
    }
   

     /** Like a product
     * @param product the product to like 
     */
    public void like(Product product) {
        //TODO
    }
    
}
