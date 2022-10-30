package com.demo3;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo3.entities.Stud;
import com.demo3.repositories.StudRepository;

@SpringBootTest
class Demo3ApplicationTests {
	@Autowired
	private StudRepository studRepo;

	@Test
	void saveStudInfo() {
		Stud s =new Stud();
		s.setName("hari");
		s.setCourse("react");
		s.setFees(6000);
		studRepo.save(s);
	}
	//@Test
	//void deleteStudInfo() {
		//studRepo.deleteById(2l);
	//}
	//@Test
	//void getStudInfo() {
	//	Optional<Stud> findById = studRepo.findById(1l);
	//	Stud s1 = findById.get();
	//	System.out.println(s1.getId());
	//	System.out.println(s1.getName());
	//	System.out.println(s1.getCourse());
	//	System.out.println(s1.getFees());
	//}
	//@Test
	//void updatesStudInfo() {
		//Optional<Stud> findById = studRepo.findById(1l);
		//Stud s2 = findById.get();
		//s2.setCourse("testing");
		//studRepo.save(s2);
		
		
	//}
	

}
