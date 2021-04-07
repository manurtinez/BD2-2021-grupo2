package ar.edu.unlp.info.bd2.services;

import ar.edu.unlp.info.bd2.config.AppConfig;
import ar.edu.unlp.info.bd2.config.HibernateConfiguration;
import ar.edu.unlp.info.bd2.model.*;
import ar.edu.unlp.info.bd2.repositories.MLException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {AppConfig.class, HibernateConfiguration.class}, loader = AnnotationConfigContextLoader.class)
@Transactional
@Rollback(true)
public class MLServiceTestCase {

    @Autowired
    MLService service;
    
    
    @Test
    public void testCreateCategory() throws MLException {
        Category c = this.service.createCategory("Hogar");
        assertNotNull(c.getId());
        assertEquals("Hogar",c.getName());
        Optional<Category> oc = this.service.getCategoryByName("Hogar");
        if (! oc.isPresent()) {
            throw new MLException("Category not found");
        }
        Category cat = oc.get();
        assertNotNull(cat.getId());
        assertEquals("Hogar",cat.getName());
    }
    
    @Test
    public void testCreateUser() throws MLException{
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1982);
        cal.set(Calendar.MONTH, Calendar.MAY);
        cal.set(Calendar.DAY_OF_MONTH, 17);
        Date dob = cal.getTime();
        User u = this.service.createUser("federico.orlando@info.unlp.edu.ar", "Federico Orlando", "pas$w0rd", dob);
        assertNotNull (u.getId());
        assertEquals("Federico Orlando",u.getFullname());
        Optional<User> us = this.service.getUserByEmail("federico.orlando@info.unlp.edu.ar");
        if (!us.isPresent()) {
            throw new MLException("User doesn't exists");
        }
        User user = us.get();
        assertNotNull (user.getId());
        assertEquals("Federico Orlando",user.getFullname());
        assertEquals(dob, user.getDayOfBirth());
        assertEquals("pas$w0rd", user.getPassword());
        MLException ex = assertThrows(MLException.class, () -> this.service.createUser("federico.orlando@info.unlp.edu.ar", "Federico Orlando", "pas$w0rd", dob));
        assertEquals("Constraint Violation",ex.getMessage());
    }
    

    @Test
    public void testCreateProvider() throws MLException {
        Provider p = this.service.createProvider("Philips",30715589634L);
        assertNotNull (p.getId());
        assertEquals("Philips", p.getName());
        Optional<Provider> prov = this.service.getProviderByCuit(30715589634L);
        if (!prov.isPresent()) {
            throw new MLException("Provider doesn't exists");
        }
        Provider provider = prov.get();
        assertNotNull (provider.getId());
        assertEquals("Philips", provider.getName());
        MLException ex = assertThrows(MLException.class, () -> this.service.createProvider("Philips",30715589634L));
        assertEquals("Constraint Violation",ex.getMessage());
    }
    
    @Test
    public void testCreateProduct() throws MLException {
        Category cat = this.service.createCategory("Hogar");
        assertNotNull(cat.getId());
        Product prod = this.service.createProduct("Lamparita led 7w fria", Float.valueOf(40.5F), cat);
        assertNotNull(prod.getId());
        assertEquals(40.5F, (float) prod.getWeigth());
        Optional<Product> p = this.service.getProductByName("Lamparita led 7w fria");
        if (!p.isPresent()) {
            throw new MLException("Product doesn't exists");
        }
        Product product = p.get();
        assertNotNull(product.getId());
        assertEquals(Float.valueOf(40.5F), product.getWeigth());
        assertEquals("Hogar",product.getCategory().getName());
        MLException ex = assertThrows(MLException.class, () -> this.service.createProduct("Lamparita led 7w fria", Float.valueOf(40.5F), cat));
        assertEquals("Constraint Violation",ex.getMessage());
    }
    
    @Test
    public void testCreateDeliveryMethod() throws MLException {
        DeliveryMethod dm = this.service.createDeliveryMethod("Moto menos 1kg", 250.0F, 0.01F, 0.9999F);
        assertNotNull(dm.getId());
        assertEquals(Float.valueOf(250.0F),dm.getCost());
        assertEquals(Float.valueOf(0.9999F),dm.getEndWeight());
        Optional<DeliveryMethod> del = this.service.getDeliveryMethodByName("Moto menos 1kg");
        if (!del.isPresent()) {
            throw new MLException("Delivery Method doesn't exists");
        }
        DeliveryMethod d = del.get();
        assertNotNull(d.getId());
        assertEquals(Float.valueOf(250.0F),d.getCost());
        assertEquals(Float.valueOf(0.01F),d.getStartWeight());
    }
    
    @Test
    public void testCreateCreditCardPayment() throws MLException {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1982);
        cal.set(Calendar.MONTH, Calendar.MAY);
        cal.set(Calendar.DAY_OF_MONTH, 17);
        Date exp = cal.getTime();
        CreditCardPayment cc = this.service.createCreditCardPayment("Visa Federico", "Visa", 4052698512476369L, exp, 452, "Federico Orlando");
        assertNotNull(cc.getId());
        assertEquals("Visa",cc.getBrand());
        assertEquals(Long.valueOf(4052698512476369L), cc.getNumber());
        assertEquals("Federico Orlando",cc.getOwner());
        assertEquals(exp,cc.getExpiry());
        Optional<CreditCardPayment> ccp = this.service.getCreditCardPaymentByName("Visa Federico");
        if (!ccp.isPresent()) {
            throw new MLException("Credit Card Payment doesn't exists");
        }
        CreditCardPayment c = ccp.get();
        assertNotNull(c.getId());
        assertEquals("Visa",c.getBrand());
        assertEquals(Long.valueOf(4052698512476369L), c.getNumber());
        assertEquals("Federico Orlando",c.getOwner());
        assertEquals(exp,c.getExpiry());
        assertEquals(Integer.valueOf(452),c.getCvv());
    }
    
    @Test
    public void testOnDeliveryPayment() throws MLException {
        OnDeliveryPayment od = this.service.createOnDeliveryPayment("Pago Efectivo Lampara", 100F);
        assertNotNull(od.getId());
        assertEquals(Float.valueOf(100F),od.getPromisedAmount());
        Optional<OnDeliveryPayment> odp = this.service.getOnDeliveryPaymentByName("Pago Efectivo Lampara");
        if (!odp.isPresent())
        {
            throw new MLException("On Delivery Payment doesn't exists");
        }
        OnDeliveryPayment dp = odp.get();
        assertNotNull(dp.getId());
        assertEquals(Float.valueOf(100F),dp.getPromisedAmount());
    }
    
    @Test
    public void testCreateProductOnSale() throws MLException {
        Provider p = this.service.createProvider("Philips",30715589634L);
        Category c = this.service.createCategory("Hogar");
        Product prod = this.service.createProduct("Lamparita led 7w fria", Float.valueOf(40.5F), c);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date id = cal.getTime();
        ProductOnSale pos = this.service.createProductOnSale(prod, p, 158.52F, id);
        assertNotNull(pos.getId());
        assertEquals(Float.valueOf(40.5F),pos.getProduct().getWeigth());
        assertEquals(1,pos.getProduct().getProductsOnSale().size());
        assertEquals(Float.valueOf(158.52F),pos.getPrice());
        assertEquals(null,pos.getFinalDate());
        assertEquals(id,pos.getInitialDate());
        assertEquals(p.getCuit(),pos.getProvider().getCuit());
    }
    
    @Test
    public void testUpdateProductOnSale() throws MLException {
        Provider p = this.service.createProvider("Philips",30715589634L);
        Category c = this.service.createCategory("Hogar");
        Product prod = this.service.createProduct("Lamparita led 7w fria", Float.valueOf(40.5F), c);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date id = cal.getTime();
        ProductOnSale pos = this.service.createProductOnSale(prod, p, 158.52F, id);
        assertNotNull(pos.getId());
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, Calendar.FEBRUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date id2 = cal.getTime();
        ProductOnSale pos2 = this.service.createProductOnSale(prod, p, 175F, id2);
        assertNotNull(pos2.getId());
        assertEquals(Float.valueOf(175F),pos2.getPrice());
        assertEquals(2,pos2.getProduct().getProductsOnSale().size());
        assertEquals(null,pos2.getFinalDate());
        assertEquals(id2,pos2.getInitialDate());
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 15);
        Date id3 = cal.getTime();
        MLException ex = assertThrows(MLException.class, () -> this.service.createProductOnSale(prod, p, 200F, id3));
        assertEquals("Ya existe un precio para el producto con fecha de inicio de vigencia posterior a la fecha de inicio dada" ,ex.getMessage());
    }
    
    @Test
    public void testCreatePurchase() throws MLException {
        Provider p = this.service.createProvider("Philips",30715589634L);
        Category c = this.service.createCategory("Hogar");
        Product prod = this.service.createProduct("Lamparita led 7w fria", Float.valueOf(40.5F), c);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date id = cal.getTime();
        ProductOnSale pos = this.service.createProductOnSale(prod, p, 150F, id);
        assertNotNull(pos.getId());
        cal.set(Calendar.YEAR, 1982);
        cal.set(Calendar.MONTH, Calendar.MAY);
        cal.set(Calendar.DAY_OF_MONTH, 17);
        Date dob = cal.getTime();
        User u = this.service.createUser("federico.orlando@info.unlp.edu.ar", "Federico Orlando", "pas$w0rd", dob);
        OnDeliveryPayment dp =  this.service.createOnDeliveryPayment("Pago Efectivo Lampara", 800F);
        DeliveryMethod d = this.service.createDeliveryMethod("Moto menos 1kg", 250.0F, 0.01F, 999F);
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, Calendar.MAY);
        cal.set(Calendar.DAY_OF_MONTH, 10);
        Date dop = cal.getTime();
        Purchase pur = this.service.createPurchase(pos, 5, u, d, dp, "Calle 12 432", Float.valueOf(-54.45F), Float.valueOf(-62.22F), dop);
        assertEquals(Integer.valueOf(5), pur.getQuantity());
        assertEquals(Float.valueOf(1000F), pur.getAmount());
        assertEquals(u, pur.getClient());
        assertEquals(dop, pur.getDateOfPurchase());
        assertEquals(d,pur.getDeliveryMethod());
        assertEquals(dp,pur.getPaymentMethod());
        assertEquals("Calle 12 432",pur.getAddress());
        assertEquals(Float.valueOf(-54.45F),pur.getCoordX());
        assertEquals(Float.valueOf(-62.22F),pur.getCoordY());
        DeliveryMethod d2 = this.service.createDeliveryMethod("Moto menos 1kg", 250.0F, 0.01F, 200F);
        MLException ex = assertThrows(MLException.class, () -> this.service.createPurchase(pos, 5, u, d2, dp,"Calle 12 432",Float.valueOf(-54.45F), Float.valueOf(-62.22F), dop));
        assertEquals("método de delivery no válido",ex.getMessage());
    }

}
