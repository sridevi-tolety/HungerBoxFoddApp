package com.myorg.hungerbox.config;

import org.springframework.batch.item.ItemProcessor;

import com.myorg.hungerbox.models.Item;

public class MenuItemProcessor implements ItemProcessor<Item ,Item>{
	
	@Override
	  public Item process(final Item item) throws Exception {
		final String vendorname = item.getVendorname();
	    final String itemcode = item.getItemcode();	    
	    final String itemname = item.getItemname();
	    final double priceperunit = item.getPriceperunit();
	    

	    final Item processedItem = new Item(1L,vendorname,itemcode,itemname, priceperunit);
	    return processedItem;
	  }

}
