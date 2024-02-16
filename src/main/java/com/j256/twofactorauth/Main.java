package com.j256.twofactorauth;

import java.security.GeneralSecurityException;

import static com.j256.twofactorauth.TimeBasedOneTimePasswordUtil.*;

public class Main {

    /**
     * A example test code
     * @param args
     * @throws GeneralSecurityException
     */
    public static void main(String[] args) throws GeneralSecurityException {
        String base32Secret = generateBase32Secret();
        //String base32Secret = "";
        String qrImageUrl = qrImageUrl("this_is_a_demo_of_2FA", base32Secret);
        String currentNumberString = generateCurrentNumberString(base32Secret);
        System.out.printf(
                "\t- base32Secret: %s\n\t- qrImageUrl: %s\n\t- currentNumberString: %s",
                base32Secret,
                qrImageUrl,
                currentNumberString
        );
    }

}
