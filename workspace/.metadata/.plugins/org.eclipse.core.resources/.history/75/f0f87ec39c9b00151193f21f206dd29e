package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class DocCritereUrl implements DocCritere{

	
	private Document doc;
	
	public List<Document> comparer(Document docPrincp, List<Document> docs){
		this.doc=docPrincp;
		
		return meetCriteria(docs);
	}
	
	public List<Document> comparer(String docPrincp, List<Document> docs){
		this.doc= new Document(docPrincp);
		
		return meetCriteria(docs);
	}
	
	public List<Document> meetCriteria(List<Document> docs) {
		// TODO Auto-generated method stub
		List<Document> ret = new ArrayList<Document>();
		
		for(Document doc : docs){
			if(doc.getDocumentURI().equalsIgnoreCase(this.doc.getDocumentURI()) && !(doc.getDocumentURI()=="")){
				ret.add(doc);
			}
		}
		
		return ret;
	}

}
