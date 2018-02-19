package teamName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import teamName.Tuple;

public class Page implements Serializable {

	/**
	 *	Having a fixed serialVersionUID to be able to Deserialize objects on any version of java
	 */
	private static final long serialVersionUID = 8010842808275391794L;
		
	private ArrayList<Tuple> rows;
	private int numOfRows;
	private String pageName;
	
	public Page(String pageName) {
				
		// Supported Types: java.lang.Integer, java.lang.String, java.lang.Double, 
		// java.lang.Boolean and java.util.Date
		
		this.pageName = pageName;
		this.rows = new ArrayList<Tuple>();
		this.numOfRows = rows.size();
						
	}
		
	public void insertRow(Hashtable<String, Object> htblColNameValue) {
		
	    Tuple tuple = new Tuple(htblColNameValue);
	    rows.add(tuple);
	    this.numOfRows++;
	    
	}
			
	public int getNumOfRows() {
		return numOfRows;
	}

	public String getPageName() {
		return pageName;
	}
	



}