package javacodechecker;

public class MissingRequiredCryptographicStep{
	public void notValid() throws Throwable
    {
       
            final String CIPHER_INPUT = "ABCDEFG123456";
            // EMB-ISSUE: CodeIssueNames.MISSING_REQUIRED_CRYPTOGRAPHIC_STEP
            KeyGenerator kG = KeyGenerator.getInstance("AES");
            SecretKey secretKey = kG.generateKey();
            byte[] byteKey = secretKey.getEncoded();
            SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encrypted = aesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));
            IO.writeLine(IO.toHex(encrypted));
            
        
    }
	 private void Valid() throws Throwable
	    {
	        final String CIPHER_INPUT = "ABCDEFG123456";
	            KeyGenerator kGVal = KeyGenerator.getInstance("AES");
	            // EMB-ISSUE: CodeIssueNames.MISSING_REQUIRED_CRYPTOGRAPHIC_STEP/no-detect
	            kGVal.init(256);
	            SecretKey secretKey = kGVal.generateKey();
	            byte[] byteKey = secretKey.getEncoded();
	            SecretKeySpec secretKeySpec = new SecretKeySpec(byteKey, "AES");
	            Cipher aesCipher = Cipher.getInstance("AES");
	            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
	            byte[] encrypted = aesCipher.doFinal(CIPHER_INPUT.getBytes("UTF-8"));
	            IO.writeLine(IO.toHex(encrypted));
	           
	        }
	  
 }
