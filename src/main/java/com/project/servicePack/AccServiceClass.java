package com.project.servicePack;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.AccountantDetails;
import com.project.dao.AccountantRepo;

@Service
public class AccServiceClass {

	@Autowired
	AccountantDetails aReg;

	@Autowired
	AccountantRepo aRepo;

	public Integer registerLogic(AccountantDetails aReg) {
		// TODO Auto-generated method stub
		aRepo.save(aReg);
		Integer i = aReg.getaId();
		return i;
	}

	public Optional<AccountantDetails> viewLogic() {
		// TODO Auto-generated method stub
		Optional<AccountantDetails> op = aRepo.findById(aReg.getaId());
		return op;
	}

	public void deleteLogic() {
		// TODO Auto-generated method stub
		aRepo.deleteById(aReg.getaId());

	}

	public List<AccountantDetails> loginLogic() {
		// TODO Auto-generated method stub
		List<AccountantDetails> li = aRepo.findAll();
		return li;
	}

	public List<AccountantDetails> allAcc() {
		// TODO Auto-generated method stub
		List<AccountantDetails> li = aRepo.findAll();
		return li;

	}

}
