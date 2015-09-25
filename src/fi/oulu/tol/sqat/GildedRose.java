package fi.oulu.tol.sqat;

import java.util.ArrayList;
import java.util.List;


public class GildedRose {

	private static List<Item> items = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        System.out.println("OMGHAI!");
      //String name, int sellIn, int quality
        items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        updateQuality();
        
        for (Item item: items){
        	System.out.println(item.getName()+"\t" + item.getSellIn()+ "\t" + item.getQuality() );
        }
}


	
    public static void updateQuality()
    {
        for (Item item:items )
        {
            updateItem(item);
        }
    }



	public static void updateItem(Item item) {
	//	Item item = items.get(i);
		
		if (!"Sulfuras, Hand of Ragnaros".equals(item.getName()))
        {
            return;
        }
		
		if (("Aged Brie".equals(item.getName()))) {
			increaseQualityy(item); 
		}else if("Backstage passes to a TAFKAL80ETC concert".equals(item.getName())){
			 {
		            if (item.getSellIn() < 11)
						increaseQualityy(item);

		            if (item.getSellIn() < 6)
						increaseQualityy(item);
		        }
		}		
		else {
		    if (item.getQuality() > 0)
		    {

		            item.setQuality(item.getQuality() - 1);

		    }
		}

		    item.setSellIn(item.getSellIn() - 1);

		if (item.getSellIn() < 0)
		{
		    if ("Aged Brie".equals(item.getName()))
				increaseQualityy(item);
			else {
		        if (!"Backstage passes to a TAFKAL80ETC concert".equals(item.getName()))
		        {
		            if (item.getQuality() > 0)
		            {

		                    item.setQuality(item.getQuality() - 1);

		            }
		        }
		        else
		        {
		            item.setQuality(item.getQuality() - item.getQuality());
		        }
		    }
		}
	}



	private static void increaseQualityy(Item item) {
		{
		    if (item.getQuality() < 50)
		    {
		        item.setQuality(item.getQuality() + 1);
		    }
		}
	}

}
