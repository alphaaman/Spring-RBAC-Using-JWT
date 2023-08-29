package com.alpha.model;

/**
 * Represents an authentication token.
 */
public class AuthToken {
    private String token;

    /**
     * Constructs a new AuthToken object.
     */
    public AuthToken() {
    }

    /**
     * Constructs a new AuthToken object with the specified token.
     * 
     * @param token the authentication token
     */
    public AuthToken(String token) {
        this.token = token;
    }

    /**
     * Returns the authentication token.
     * 
     * @return the authentication token
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the authentication token.
     * 
     * @param token the authentication token to be set
     */
    public void setToken(String token) {
        this.token = token;
    }
}