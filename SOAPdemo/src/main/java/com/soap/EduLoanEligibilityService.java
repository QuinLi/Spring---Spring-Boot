package com.soap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.marlabs.spring.saop.eduloaneligibility.Acknowledgement;
import com.marlabs.spring.saop.eduloaneligibility.UserRequest;

@Service
public class EduLoanEligibilityService {
	public Acknowledgement checkEduLoanEligibility(UserRequest request) {
		Acknowledgement acknowledgement = new Acknowledgement();
		List<String> mismatchCriteriaList = acknowledgement.getCriteriaMismatch();
		if (!(request.getUserage() > 25 && request.getUserage() <= 55)) {
			mismatchCriteriaList.add("Person Age should be inbetween 25 to 55");
		}
		if (!(request.getUserannualIncome() > 250000)) {
			mismatchCriteriaList.add("Minimum Annual Income should be More that 250000");
		}
		if (!(request.getUserieltsScore() > 400)) {
			mismatchCriteriaList.add("Low IELTS Score, Please try after 6 Months");
		}
		if (mismatchCriteriaList.size() > 0) {
			acknowledgement.setApprovedAmount(0);
			acknowledgement.setIsEligible(false);
		} else {
			acknowledgement.setApprovedAmount(40000);
			acknowledgement.setIsEligible(true);
			mismatchCriteriaList.clear();
		}
		return acknowledgement;
	}
}
