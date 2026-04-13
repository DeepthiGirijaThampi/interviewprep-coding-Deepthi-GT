package com.deepthi.interviewprep;

import java.util.Random;

public class UrlService {
    String chars = "abcdef";
    Random random = new Random();
    public String generateUrl(String originalUrl) {
       String shortUrl = "";
        StringBuilder sb = new StringBuilder();
       int index = 0;
       for(int i=0; i<6; i++) {
           index = random.nextInt(chars.length());
           shortUrl += sb.append(chars.charAt(index));
       }

        shortUrl = sb.toString();
       return shortUrl;
    }
}
