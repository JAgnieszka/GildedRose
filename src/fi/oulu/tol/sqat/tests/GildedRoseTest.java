package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.*;

import java.awt.List;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

@RunWith(Parameterized.class
		)

public class GildedRoseTest {

	Item item;
	int expectedSellIn;
	int expectedQuality;
	
	public GildedRoseTest(Item item, int expectedSellIn, int expectedQuality) {
		this.item=item;
		this.expectedSellIn=expectedSellIn;
		this.expectedQuality=expectedQuality;
	}
	
	//method which rwturn list of paramiters
	@Parameters (name="SellIn:{1} Quality{2} ")
	public static List<Object[]> myData(){
		return Arrays.asList(new Object[][]{
			{new Item("Aged Brie", 2, 0),1,1},
			{new Item("Elixir of the Mongoose", 5, 7),4,6},
			{new Item("+5 Dexterity Vest", 10, 20),9,19}
			});
	}
	
	@Test
	public void testUpdateItemBrieWithSellIn2Quality0() {
		
		GildedRose.updateItem(item);
		//sellIN
		assertEquals("SellIn not correct",expectedSellIn, item.getSellIn());
		//Quality
		assertEquals("Quality not correct",expectedQuality, item.getQuality());
	}
}
