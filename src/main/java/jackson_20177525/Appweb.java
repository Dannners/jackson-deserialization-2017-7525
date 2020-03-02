package jackson_20177525;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Appweb
{
    public static void main( String[] args ) throws IOException 
    {
		ObjectMapper om = new ObjectMapper();
		om.enableDefaultTyping();

		boom b = om.readValue(Files.readAllBytes(Paths.get(args[0])), boom.class);
    }
}

class boom {
	public int id;
	public Object ob;
}
