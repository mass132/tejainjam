package com.cg.frs.dao;
import java.util.ArrayList;
import com.cg.frs.dto.FlatOwner;
import com.cg.frs.dto.RegistrationDetails;
public interface IFlatRegistrationDAO {
	ArrayList<FlatOwner> getAllOwnerIds();
	int registerDTO(RegistrationDetails a);

}
