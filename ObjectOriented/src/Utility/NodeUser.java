package Utility;

import com.bridge.commercialdataprosessing.CommercialUserProj;


public class NodeUser implements Node{
	CommercialUserProj userShareProject;
	NodeUser next;
	
	
	//Default Constructor
	public NodeUser() {
		
	}
	//Constructor using Field
	public NodeUser(CommercialUserProj userShareProject, NodeUser next) {
		this.userShareProject = userShareProject;
		this.next = next;
	}

	
	//Gettters And Setters
	public CommercialUserProj getUserShareProject() {
		return userShareProject;
	}

	public void setUserShareProject(CommercialUserProj userShareProject) {
		this.userShareProject = userShareProject;
	}

	public NodeUser getNext() {
		return next;
	}

	public void setNext(NodeUser next) {
		this.next = next;
	}
	
	
	
}
