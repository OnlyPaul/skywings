import package model;
import interface FlugDAO;


public class FlugController  {
 
	FlugDAO flugDAO;
	
	
	public FlugController(string pfad){
		
		
		flugdao = new SerializedFlugDAO(pfad);
		
	}
	
	public FlugDAO getFlugDAO(){
		
		return FlugDAO;
		
	}
	
	public void setFlugDAO(FlugDAO flugDAO){
		this.flugDAO=flugDAO;
		
	}
	
		
	public boolean flugEintragen(int flugid, String flugnummer, double preis, Date abDatum, Date anDatum, String abflugsort, String ankunftsort){
		try{
			Flug neuflug= new Flug (flugid,flugnummer, preis, abflugsort, ankunftsort, abDatum, anDatum );
			flugDAO.speichereFlug(neuflug);
			return true;
		}
		catch(IOException e){
			return false;
		}
		
	}
	
	public boolean flugAendern(int flugid, Date neuabDatum, neuanDatum){
		try{
			Flug.getFlugid(id).setAbflugsdatum=neuabDatum;
		
			Flug.getFLugid(id).setAnkunftsdatum=neuanDatum;
			return true;
		}
		catch(IOException e){
			return false;
		}
					
	}
	
	public void flugLoeschen(int flugid){
		flugDAO.loescheFlug(flugDAO.getFlugbyId(id));
		
	}
	
	//klassendiagramm ändern
	public flugSuche(int flugid){
		Flug.getFlugid(id).
	}
//FLugliste	
	
}


