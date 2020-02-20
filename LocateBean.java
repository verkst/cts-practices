
package mybeans;
public class LocateBean {
	
	double cost;
	double markup;
	double subtotal;
	double var;
	double total;
	

public void setCost(double cost) {
	
	this.cost=cost;
	this.markup= ( ( cost/10 )*20);
	this.subtotal=(cost+markup);
	this.var=((subtotal/100)*12.5);
	this.total=(subtotal*var);
	
}
public double getcost() {
	
	return cost;
}
public String getCostPrice() {
	return doFormat(cost);
}
public String getMarkup() {
	return doFormat(markup);
}
public String getSubTotal() {
	return doFormat(subtotal);
}
public String getVar() {
	return doFormat(var);
}
public String getTotal(){
	return doFormat(total);
}
private String doFormat(double sum) {
	java.util.Locale loc=new java.util.Locale("en", "GB");
	java.text.NumberFormat nf=java.text.NumberFormat.getCurrencyInstance(loc);
	
	return nf.format(sum);
}

}
