package com.project.servicePack;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.StudentDetails;
import com.project.dao.StudentRepo;

@Service
public class StudentServiceClass {

	@Autowired
	StudentDetails sDe;

	@Autowired
	StudentRepo sRepo;

	public Integer addNewStd(StudentDetails sDe) {
		// TODO Auto-generated method stub
		sRepo.save(sDe);
		Integer i = sDe.getsRollNo();
		return i;
	}

	public List<StudentDetails> allStudentDetails() {
		// TODO Auto-generated method stub
		List<StudentDetails> li = sRepo.findAll();
		return li;
	}

	public Optional<StudentDetails> studentViewLoic(Integer sRollNo) {
		// TODO Auto-generated method stub
		Optional<StudentDetails> op = sRepo.findById(sRollNo);
		return op;
	}

	public Double feePayment(Double amount, Integer sRollNo) {
		// TODO Auto-generated method stub
		Optional<StudentDetails> op = sRepo.findById(sRollNo);
		StudentDetails feee = op.get();
		sDe.setsFee(feee.getsFee() - amount);
		sDe.setsRollNo(sRollNo);
		sDe.setsName(feee.getsName());
		sDe.setsBranch(feee.getsBranch());
		sDe.setsYear(feee.getsYear());
		sDe.setsContact(feee.getsContact());
		sDe.setsAddress(feee.getsAddress());

		sRepo.save(sDe);
		return sDe.getsFee();
	}

	public List<StudentDetails> feeDue() {
		// TODO Auto-generated method stub
		List<StudentDetails> li = sRepo.findAll();
		List<StudentDetails> li2 = new ArrayList<>();
		for (StudentDetails sr : li) {
			if (sr.getsFee() > 0) {
				li2.add(sr);
			}
		}
		return li2;
	}
	
//	if u want to get the sorted order of students based on name, u can use this method
//	private List<StudentDetails> nameWise() {
//		// TODO Auto-generated method stub
//							List<StudentDetails> li=	sRepo.findAll();
//					        li.sort((o1, o2) -> o1.getsName().compareTo(o2.getsName()));
//					        return li;
//	    }

	
//if you want to get student details year wise, u can use this method
//	public List<StudentDetails> StudYearWise(Integer Year) {
//		// TODO Auto-generated method stub
//		List<StudentDetails> li =		sRepo.findByYear(Year);
//		return li;
//	}

}
