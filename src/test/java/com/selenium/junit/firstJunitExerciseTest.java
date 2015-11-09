package com.selenium.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;


import org.hamcrest.BaseMatcher;

import static org.hamcrest.Matchers.*;

/**
 * Created by David on 21/04/2015.
 */

public class firstJunitExerciseTest {

    private ArrayList testList;

    @BeforeClass
    public static void onceExecutedBeforeAll() {
        System.out.println("@BeforeClass: onceExecutedBeforeAll");
    }

    @Before
    public void executedBeforeEach() {
        testList = new ArrayList();
        System.out.println("@Before: executedBeforeEach");
    }

    @Test
    public void EmptyCollection() {
        Assert.assertTrue(testList.isEmpty());
        System.out.println("@Test: EmptyArrayList");

    }

    @Test
    public void OneItemCollection() {
        testList.add("oneItem");
        Assert.assertEquals("Asserting the size of the array,", 1, testList.size());
        System.out.println("@Test: OneItemArrayList");
    }




  @Test

    public void jUnitAddition(){

      Assert.assertEquals("5*5 = 25",25,5*5);

  }


@Test

    public void jUnitEqualToTest(){

    String firstvalue = "Same values";
    String secondvalue = "Same values";
    Assert.assertThat(firstvalue, equalTo(secondvalue));

}
@Test

    public void jUnitStartsWith(){

        String mystartswith = "My first starts with test";

        Assert.assertThat(mystartswith, startsWith(" My first") );
    }

    @Test

    public void jUnitEndsWith(){

        String myname =  "David Paul Stenson";

        Assert.assertThat(myname, endsWith("Stenson"));


    }

    @Test

    public void jUnitAllofTest(){

        String myname = "David Paul Stenson";

        Assert.assertThat(myname, allOf(startsWith("David"),endsWith("Stenson")));
     }


    @Test

    public void jUnitAnyofTest(){

        String napolean = "Best not to give your word";

        Assert.assertThat( napolean, anyOf(startsWith("Bla"),containsString("word")));


        System.out.print(testList);

    }

   @Test

    public void jUnitisTest(){

        String biscuit = "MyBiscuit";
       String anotherbiscuit = "MyBiscuit";
       Assert.assertThat(biscuit, is(anotherbiscuit));


    }


    @Test

    public void jUnitArrayTest(){

        String[] footyside;
        footyside = new String[10];
        footyside[0] = "Simo";
        footyside[1] = "Sticky";
        footyside [2] =  "Coffey";

        Assert.assertThat(footyside, hasItemInArray("Simon"));


    }
}

