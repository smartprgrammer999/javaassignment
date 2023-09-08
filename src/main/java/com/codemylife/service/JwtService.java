package com.codemylife.service;

 
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JComboBox.KeySelectionManager;

import org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
import org.springframework.stereotype.Component;

import com.netflix.eureka.registry.Key;

import jakarta.websocket.Decoder;

@Component
public class JwtService {
public static final String SECRET="5367566B59703373367633732";
public void validateToken(final String token)
{
	 Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token);
}
public String generateToken(String userNmae)
{
	Map<String, Object> claims=new HashMap<>();
	return createToken(claims, userNmae)
}
private String createToken(Map<String, Object> claims,String username)
{
	return Jwts.builder()
    .setClaims(claims)
    .setSubject(username)
    .setIssuedAt(new Date(System.currentTimeMillis()))
    .setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
    .signWith(getSignKey(),SignatureAlgorithm.SHA3_512withDSA).compact();
}
private Key getSiKey()
{
	byte[] keyBytes=Decoders.BASE64.decode(SECRET);
	return keys.hmacShaKeyFor(keyBytes);
}
}
