
package javacodechecker;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class MissingRequiredCryptographicStep {
	public void CryptographicStep()  throws Throwable{

		// EMB-ISSUE: CodeIssueNames.MISSING_REQUIRED_CRYPTOGRAPHIC_STEP
		KeyGenerator kG = KeyGenerator.getInstance("AES");
		SecretKey secretKey = kG.generateKey();

	}

	private void CryptographicStep2()  throws Throwable{

		// EMB-ISSUE: CodeIssueNames.MISSING_REQUIRED_CRYPTOGRAPHIC_STEP
		KeyGenerator kGVal = KeyGenerator.getInstance("AES");
		kGVal.equals(kGVal);
		SecretKey secretKeyy = kGVal.generateKey();

	}

	private void CryptographicStep3() {

		// EMB-ISSUE: CodeIssueNames.MISSING_REQUIRED_CRYPTOGRAPHIC_STEP/no-detect
		KeyGenerator kGVal1 = KeyGenerator.getInstance("AES");
		kGVal1.init(256);
		SecretKey secretKey1 = kGVal1.generateKey();

	}

}

