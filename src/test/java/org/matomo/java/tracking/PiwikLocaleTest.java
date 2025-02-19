/*
 * Piwik Java Tracker
 *
 * @link https://github.com/matomo/matomo-java-tracker
 * @license https://github.com/matomo/matomo-java-tracker/blob/master/LICENSE BSD-3 Clause
 */
package org.matomo.java.tracking;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.piwik.java.tracking.PiwikLocale;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

/**
 * @author brettcsorba
 */
public class PiwikLocaleTest {
  PiwikLocale locale;

  public PiwikLocaleTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
    locale = new PiwikLocale(Locale.US);
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of getLocale method, of class PiwikLocale.
   */
  @Test
  public void testConstructor() {
    assertEquals(Locale.US, locale.getLocale());
  }

  /**
   * Test of setLocale method, of class PiwikLocale.
   */
  @Test
  public void testLocale() {
    locale.setLocale(Locale.GERMANY);
    assertEquals(Locale.GERMANY, locale.getLocale());
  }

  /**
   * Test of toString method, of class PiwikLocale.
   */
  @Test
  public void testToString() {
    assertEquals("us", locale.toString());
  }

}
