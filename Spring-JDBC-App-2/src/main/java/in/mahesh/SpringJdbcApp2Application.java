package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.service.CRUDOperationService;

@SpringBootApplication
public class SpringJdbcApp2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(SpringJdbcApp2Application.class, args);
		CRUDOperationService bean = cxt.getBean(CRUDOperationService.class);
//		bean.mSave();
//		bean.mSaveAll();
//		bean.mFindById();
//		bean.mFindAllById();
//		bean.mfindAll();
//		bean.mExsitById();
//		bean.mCount();
//		bean.mFindByEname();
//		bean.mFindByEsal();
//		bean.mFindByEsalGretherThanOrEqualTo();
//		bean.getAllEmp();
//		bean.getById();
		bean.getAllEmpBySql();
	}

}
