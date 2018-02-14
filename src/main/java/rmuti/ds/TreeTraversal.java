package rmuti.ds;


import rmuti.ds.Node;

public class TreeTraversal {
	
public void preOder(Node r,Visitor v) {
	if(r==null) {
		return;
	}
	v.visit(r.getValue());
	preOder(r.left,v);
	preOder(r.right,v);
}

public void inOder(Node r,Visitor v) {
	if(r==null) {
		return;
	}
	inOder(r.left,v);
	v.visit(r.getValue());
	inOder(r.right,v);
}

public void postOder(Node r,Visitor v) {
	if(r==null) {
		return;
	}
	postOder(r.left,v);
	postOder(r.right,v);
	v.visit(r.getValue());
}
}
