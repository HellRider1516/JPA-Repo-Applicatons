package in.mahesh.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.mahesh.entity.PhoneEntity;
import in.mahesh.repo.IphoneRepo;
@Service
public class PhoneService {
	private IphoneRepo ipr;

	public PhoneService(IphoneRepo ipr) {
		super();
		this.ipr = ipr;
	}
	public void setSaveAll() {
		PhoneEntity p1=new PhoneEntity(101,100000,4,"anroid","oneplus");
		PhoneEntity p2=new PhoneEntity(102,500000,6,"ios","iphone");
		PhoneEntity p3=new PhoneEntity(103,300000,8,"anroid","vivo");
		PhoneEntity p4=new PhoneEntity(104,100000,4,"anroid","oppo");
		PhoneEntity p5=new PhoneEntity(105,700000,6,"anroid","samsung");
		PhoneEntity p6=new PhoneEntity(106,10000,4,"anroid","jio");
		PhoneEntity p7=new PhoneEntity(107,1000,2,"anroid","nokia");
		List<PhoneEntity> asList = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		ipr.saveAll(asList);
		System.out.println("Sucesss......");
	}
	public void getFindAll() {
		List<PhoneEntity> all = ipr.findAll();
		all.forEach(e -> System.out.println(e));
	}
	public void getByPagination() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int pageSize=sc.nextInt();
		int pageNumber=0;
		PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
		Page<PhoneEntity> page = ipr.findAll(pageRequest);
		List<PhoneEntity> content = page.getContent();
		content.forEach(e -> System.out.println(e));
	}
	public void getBySorting() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data to sort");
		String str=sc.nextLine();
		Sort ascending = Sort.by(str).ascending();
		List<PhoneEntity> list = ipr.findAll(ascending);
		list.forEach(e -> System.out.println(e));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
