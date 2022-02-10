package example;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CarTest {

    example.service.CarService service;

    @BeforeEach
    public void before()
    {
       service = new example.service.CarServiceImpl();
    }

    @Test
    public void createCar_getPrice() {
      example.model.Car o = service.createCar();
      double expected = 0;
      Assertions.assertEquals(o.getPrice(), expected, 0);
    }

    @Test
    public void createCar_getYear() {
      example.model.Car o = service.createCar();
      int expected = 0;
      Assertions.assertEquals(o.getYear(), expected);
    }

    @Test
    public void createCar_getMake() {
      example.model.Car o = service.createCar();
      String expected = "test";
      Assertions.assertEquals(o.getMake(), expected);
    }

    @Test
    public void createCar_getModel() {
      example.model.Car o = service.createCar();
      String expected = "test";
      Assertions.assertEquals(o.getModel(), expected);
    }

    @Test
    public void createCar_objectNotNull() {
      example.model.Car o = service.createCar();
      Assertions.assertNotNull(o);
    }

    @Test
    public void createRandomCar_objectNotNull() {
      example.model.Car o = service.createRandomCar();
      Assertions.assertNotNull(o);
    }

    @Test
    public void findAll_sizeIsThree() {
      List<example.model.Car> lst = service.findAll();
      int expected = 3;
      Assertions.assertEquals(lst.size(), expected);
    }

    @Test
    public void addCar_sizeIsFour() {
      List<example.model.Car> lst = service.addCar();
      int expected = 4;
      Assertions.assertEquals(lst.size(), expected);
    }

    @Test
    public void deleteCar_sizeIsTwo() {
      List<example.model.Car> lst = service.deleteCar();
      int expected = 2;
      Assertions.assertEquals(lst.size(), expected);
    }

}
