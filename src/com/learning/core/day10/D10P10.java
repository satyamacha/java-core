
package com.learning.core.day10;
import org.junit.Test;
public class D10P10 {

  public static class UserProfile {
        public void validateUsername(String name) {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Username cannot be null or empty");
            }
            if (!name.matches("[a-zA-Z]+")) {
                throw new IllegalArgumentException("Username should contain only characters");
            }
        }

        public void validatePassword(String password) {
            if (password == null || password.length() != 8) {
                throw new IllegalArgumentException("Password should be of length 8");
            }
            if (!password.matches("[a-zA-Z0-9]+")) {
                throw new IllegalArgumentException("Password should contain only alphabets and digits");
            }
        }
    }

    @Test
    public void testName() {
        UserProfile userProfile = new UserProfile();
        userProfile.validateUsername("JohnDoe");
    }

    @Test
    public void testPassword() {
        UserProfile userProfile = new UserProfile();
        try {
            userProfile.validatePassword("Password1");
        } catch (IllegalArgumentException e) {
            // Expected exception, do nothing
        }
    }
}