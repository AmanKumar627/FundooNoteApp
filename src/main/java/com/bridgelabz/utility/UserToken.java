package com.bridgelabz.utility;




import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.Verification;
import com.bridgelabz.exception.CustomException;

public class UserToken {
	
	private static String TOKEN_SECRET="gh2we43jue";
	public static String generateToken(long id) throws CustomException
	{
		try {
			Algorithm algorithm= Algorithm.HMAC256(TOKEN_SECRET);
			String token=JWT.create()
							.withClaim("ID", id)
							.sign(algorithm);
			return token;		
		}
		catch(Exception exception)
		{
			throw new CustomException(200, "Token Not Generated");
		}
	}
	
	public static long tokenVerify(String token)throws CustomException	
	{
		long userid;
		try {
			Verification verification=JWT.require(Algorithm.HMAC256(UserToken.TOKEN_SECRET));
			JWTVerifier jwtverifier=verification.build();
			DecodedJWT decodedjwt=jwtverifier.verify(token);
			Claim claim=decodedjwt.getClaim("ID");
			userid=claim.asLong();	
			System.out.println(userid);
		}
		catch(Exception exception)
		{
			throw new CustomException(100,"Token Not Verified");
		}
		
			return userid;
	}

}