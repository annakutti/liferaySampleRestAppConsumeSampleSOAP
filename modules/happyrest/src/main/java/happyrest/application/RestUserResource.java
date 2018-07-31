package happyrest.application;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.osgi.service.component.annotations.Component;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;

@Component(immediate = true, service = RestUserResource.class)
public class RestUserResource {

	@GET
	@Path("/myuser")
	public List<RestUser> getMyUsers() {
		List<RestUser> userslist = new ArrayList<>();
		RestUser restuser = new RestUser(1234, "christy", "john");
		userslist.add(restuser);
		return userslist;
	}

	@GET
	@Path("/wsdl/test")
	public List<RestUser> getUsers() {
		List<RestUser> userslist = new ArrayList<>();
		NumberConversion conversion = new NumberConversion();
		NumberConversionSoapType type = conversion.getNumberConversionSoap();
		String convertedValue = type.numberToWords(new BigInteger("5"));
		RestUser restuser = new RestUser(1234, "convertedvalueof5", convertedValue);
		userslist.add(restuser);
		return userslist;
	}
}