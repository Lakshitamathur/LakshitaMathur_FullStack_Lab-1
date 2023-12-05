package com.greatlearning.email_app;

public interface ICredentialsManagerService {
	
	String generatePassword();

    String generateEmailAddress(String firstName, String lastName, int departmentCode);

    void displayCredentials(Employee employee);

}
