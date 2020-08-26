/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginStrategies;

import Controllers.AdministratorController;
import LoginStrategiesModel.AdminStrategy;
import LoginStrategiesModel.StrategySelect;
import SystemServices.ServicesFacade;
import UserModel.UserFacade;
import View.AdminGUI;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Glenn McKnight
 */
public class AdminStrategyTest {
    
    private AdminStrategy instance;
    
    private AdministratorController controllerInstance;
    private UserFacade userModel;
    private ServicesFacade servicesModel;
    private AdminGUI view;
    private  StrategySelect strategy;
    
    @Before
    public void setUp() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        
        instance = new AdminStrategy();
        
        Field cont = AdministratorController.class.getDeclaredField("adminControllerInstance");
        cont.setAccessible(true);
        
        Field field = AdministratorController.class.getDeclaredField("userModel");
        field.setAccessible(true);
        
        Field field2 = AdministratorController.class.getDeclaredField("view");
        field2.setAccessible(true);
        
        Field field3 = AdministratorController.class.getDeclaredField("strategy");
        field3.setAccessible(true);
        
        Field modField = Field.class.getDeclaredField("modifiers");
        modField.setAccessible(true);
        modField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        
        field.set(controllerInstance, controllerInstance);
        field.set(controllerInstance, userModel);
        field2.set(controllerInstance, servicesModel);
        field3.set(controllerInstance, view);
        field3.set(controllerInstance, strategy);
    }
    
    @After
    public void tearDown() {
        instance = null;
        controllerInstance = null;
        userModel = null;
        servicesModel = null;
        view = null;
        strategy = null;
        
        assertNull(instance);
        assertNull(controllerInstance);
        assertNull(userModel);
        assertNull(servicesModel);
        assertNull(view);
        assertNull(strategy);
    }

    /**
     * Test of setController method, of class AdminStrategy.
     */
    @Test
    public void testSetController() {
        System.out.println("setController");
        
        instance.setController();
        
        //
        //
        //
        //
        // need variables from adminstrategy exposed
        //
        //
        //
        //
        //assertTrue
    }

    /**
     * Test of setModel method, of class AdminStrategy.
     */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        AdminStrategy instance = new AdminStrategy();
        instance.setModel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setView method, of class AdminStrategy.
     */
    @Test
    public void testSetView() {
        System.out.println("setView");
        
        instance.setView();
        
        assertTrue(view instanceof AdminGUI);
    }

    /**
     * Test of addUpdateObserver method, of class AdminStrategy.
     */
    @Test
    public void testAddUpdateObserver() {
        System.out.println("addUpdateObserver");
        AdminStrategy instance = new AdminStrategy();
        instance.addUpdateObserver();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }    
}
