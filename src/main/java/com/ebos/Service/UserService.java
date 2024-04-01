package com.ebos.Service;
import com.ebos.Request.SignUpRequest;
import com.ebos.Response.ApiResponse;
import com.ebos.Response.DeleteResponse;
import com.ebos.Response.GetUserResponse;
import com.ebos.Response.SetListResponse;
import com.ebos.Response.UpdateResponse;

public interface UserService {
	 	SetListResponse findAll();
	 	
	    ApiResponse save(SignUpRequest signUpRequest);
	 
	    DeleteResponse deleteUser();
	    
	    UpdateResponse updateUser(SignUpRequest signUpRequest);
	    
        public GetUserResponse getUserData();

}
