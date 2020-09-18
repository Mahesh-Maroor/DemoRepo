package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Grouping {
@Test(groups="retest")
public void m1()
{
	System.out.println("m1()--retest");
}
@Test(groups="smoke")
public void m2()
{
	System.out.println("m1()--retest");
	Assert.assertTrue(false);
}
@Test(dependsOnGroups="smoke")
public void m3()
{
	System.out.println("m1()--retest");
}
}
