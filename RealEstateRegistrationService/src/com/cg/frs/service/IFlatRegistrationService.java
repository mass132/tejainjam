package com.cg.frs.service;

import java.util.ArrayList;
import com.cg.dto.FlatRegistrationDTO;
import com.cg.frs.dto.FlatOwner;
import com.cg.frs.dto.RegistrationDetails;

public interface IFlatRegistrationService {
	FlatRegistrationDTO registerFlat(RegistrationDetails a);

	ArrayList<FlatOwner> getAllOwnerIds();
}
