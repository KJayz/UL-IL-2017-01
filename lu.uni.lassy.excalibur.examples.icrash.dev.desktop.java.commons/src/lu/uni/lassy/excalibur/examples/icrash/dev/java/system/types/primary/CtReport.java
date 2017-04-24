package lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.primary;

import java.io.Serializable;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import lu.uni.lassy.excalibur.examples.icrash.dev.java.environment.actors.ActComCompany;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.DtDateAndTime;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtBoolean;

/**
 * The Class ctReport that hold all the informarion for the Police HQ.
 */
public class CtReport implements Serializable {

	private static final long serialVersionUID = 227L;
	
	/** The id of the crisis. */
	public DtCrisisID id;
	
	/** The type of the crisis. */
	public EtCrisisType type;
	
	/** The location of the accident that is associated to the crisis. */
	public DtGPSLocation location;
	
	/** The date and time of the accident that is associated to the crisis. */
	public DtDateAndTime instant;
	
	/** The comment associated with the crisis. Often refered to as the report. */
	public DtComment comment;
	
	/** The explanation if the crisis is a criminal act or not.**/
	public DtCriminalAct criminal;
	
	public PtBoolean init(DtCrisisID aId, EtCrisisType aType, DtGPSLocation aLocation,
			DtDateAndTime aInstant, DtComment aComment, DtCriminalAct aCriminal){
		
		id = aId;
		type = aType;
		location = aLocation;
		instant = aInstant;
		comment = aComment;
		criminal = aCriminal;
		
		
		return new PtBoolean(true);
	}
	
	/** 
	 * 
	 * @param aActComcompany
	 * @return True if the ctReport has been send to the Comcompany
	 * @throws RemoteException
	 * @throws NotBoundException
	 */
	
	public PtBoolean isSentToComcompany(ActComCompany aActComcompany) throws RemoteException, NotBoundException{
		
		aActComcompany.ieSendAReport(this);
		
		return new PtBoolean(true);
		
	
	}
	
}
