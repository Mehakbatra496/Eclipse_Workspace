package in.sp.bean;

public class ItemBean {

	private String itemname;
	private int itemprice;
	private int itemid;
	
	public String getItemname() 
	{
		return itemname;
	}
	public int getItemprice()
	{
		return itemprice;
	}
	
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}
	
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	
	
	 @Override
	    public String toString() {
	        return "ItemBean [itemid=" + itemid + ", itemname=" + itemname + ", itemprice=" + itemprice + "]";
	    }
	
}
	