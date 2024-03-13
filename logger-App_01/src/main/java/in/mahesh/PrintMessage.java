package in.mahesh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PrintMessage {
	private Logger log = LoggerFactory.getLogger(PrintMessage.class);
	

	public PrintMessage() {
		super();
		System.out.println("PrintMessage :: const");
	}


	public String print() {
		log.info("Logger Class has been Started...");
		log.info("Logger Class has been Ended...");
		return "<h1>Welcome Mother Fucker</h1>";
		
	}

}
