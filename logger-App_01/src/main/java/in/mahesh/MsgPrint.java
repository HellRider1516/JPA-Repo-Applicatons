package in.mahesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MsgPrint {
	private PrintMessage pm;
	@Autowired
	
	public MsgPrint(PrintMessage pm) {
		super();
		this.pm = pm;
		System.out.println("MsgPrint :: const");
	}
	
	@GetMapping("/mahesh")
	public String msg() {
		String print = pm.print();
		return print;
	}
	

}
