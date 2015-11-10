package edu.iut.app;

import java.util.ArrayList;


public class ApplicationLogs extends ArrayList<IApplicationLog> {

	public ApplicationLogs() {		
	}
	
	public ArrayList<IApplicationLog> getErrors() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle � faire ici, penser � utiliser instanceof
		
			for(IApplicationLog l:filteredLogs)
			{
				if(l instanceof ApplicationErrorLog)
				{
					
				}
			}
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getWarnings() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle � faire ici, penser � utiliser instanceof
		
		for(IApplicationLog l:filteredLogs)
		{
			if(l instanceof ApplicationWarningLog)
			{
				
			}
		}
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getInfos() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle � faire ici, penser � utiliser instanceof
		
		for(IApplicationLog l:filteredLogs)
		{
			if(l instanceof ApplicationInfoLog)
			{
				
			}
		}
		return filteredLogs;
	}
	

}
